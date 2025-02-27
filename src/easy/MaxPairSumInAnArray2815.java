package easy;

public class MaxPairSumInAnArray2815 {
    public static int maxSum(int[] nums) {
        int[][] matrix = new int[9][2];
        for (int n : nums) {
            int lDigit = largestDigit(n);
            if (n > matrix[lDigit - 1][0]) {
                matrix[lDigit - 1][1] = matrix[lDigit - 1][0];
                matrix[lDigit - 1][0] = n;
            } else if (n > matrix[lDigit - 1][1]) {
                matrix[lDigit - 1][1] = n;
            }
        }
        int maxSum = -1;
        for (int i = 8; i >= 0; i--) {
            if (matrix[i][0] != 0 && matrix[i][1] != 0) {
                maxSum = Math.max(maxSum, matrix[i][0] + matrix[i][1]);
            }
        }
        return maxSum;
    }

    public static int largestDigit(int num) {
        int max = 0;
        while (num != 0) {
            max = Math.max(max, num % 10);
            num /= 10;
        }
        return max;
    }
//    Best Solution
//    public int maxSum(int[] nums) {
//        int[] arr = new int[10];
//        int res = -1;
//        for (int n:nums) {
//            int num = n;
//            int x = num%10;
//            num /= 10;
//            while (num > 0) {
//                x = Math.max(x, num%10);
//                num /= 10;
//            }
//            if (arr[x] > 0) {
//                res = Math.max(res, n+arr[x]);
//            }
//            arr[x] = Math.max(arr[x], n);
//        }
//        return res;
//    }

    public static void main(String[] args) {
        int[] nums = new int[]{31, 25, 72, 79, 74};
        maxSum(nums);
    }
}
