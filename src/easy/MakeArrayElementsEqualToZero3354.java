package easy;

public class MakeArrayElementsEqualToZero3354 {
    public int countValidSelections(int[] nums) {
        int res = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int tmpSum = 0;
        for (int i = 0; i < nums.length; i++) {
            tmpSum += nums[i];
            if (nums[i] == 0) {
                if (sum - tmpSum == tmpSum) res += 2;
                if (Math.abs(sum - tmpSum * 2) == 1) res += 1;
            }
        }
        return res;
    }
}
