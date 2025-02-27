package easy;

public class LeftAndRightSumDifferences2574 {
    public static int[] leftRightDifference(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            sumLeft[i] = sumLeft[i - 1] + nums[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            sumRight[i] = sumRight[i + 1] + nums[i + 1];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = Math.abs(sumLeft[i] - sumRight[i]);
        }
        return res;
    }

    //    Best Solution
//    public int[] leftRightDifference(int[] nums) {
//        int[] answer = new int[nums.length];
//        getDifference(nums, answer, 0, 0);
//        return answer;
//    }
//
//    private int getDifference(int[] nums, int[] answer, int i, int leftSum) {
//        if (i == nums.length) return 0;
//
//        int rightSum = getDifference(nums, answer, i + 1, leftSum + nums[i]);
//        answer[i] = Math.abs(rightSum - leftSum);
//        return rightSum + nums[i];
//    }

    public static void main(String[] args) {
        leftRightDifference(new int[]{10, 4, 8, 3});
    }
}
