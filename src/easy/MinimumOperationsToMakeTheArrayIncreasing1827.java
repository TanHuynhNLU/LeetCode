package easy;

public class MinimumOperationsToMakeTheArrayIncreasing1827 {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int temp = nums[i - 1] + 1 - nums[i];
                count += temp;
                nums[i] += temp;
            }
        }
        return count;
    }
}
