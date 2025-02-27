package easy;

public class DivideAnArrayIntoSubarraysWithMinimumCostI3010 {
    public int minimumCost(int[] nums) {
        int res = nums[0];
        int fMin = 51;
        int sMin = 51;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < fMin) {
                sMin = fMin;
                fMin = nums[i];
            } else if (nums[i] < sMin) {
                sMin = nums[i];
            }
        }
        return res + fMin + sMin;
    }
}
