package medium;

public class WiggleSubsequence376 {
    public int wiggleMaxLength(int[] nums) {
        boolean isIncrease = true;
        boolean isDecrease = true;
        int countI = 1;
        int countD = 1;
        for (int i = 1; i < nums.length; i++) {
            if (isIncrease) {
                if (nums[i] > nums[i - 1]) {
                    countI++;
                    isIncrease = false;
                }
            } else {
                if (nums[i] < nums[i - 1]) {
                    countI++;
                    isIncrease = true;
                }
            }
            if (isDecrease) {
                if (nums[i] < nums[i - 1]) {
                    countD++;
                    isDecrease = false;
                }
            } else {
                if (nums[i] > nums[i - 1]) {
                    countD++;
                    isDecrease = true;
                }
            }
        }
        return Math.max(countI, countD);
    }
}
