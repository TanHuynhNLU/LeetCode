package medium;

public class RotateFunction396 {
    public int maxRotateFunction(int[] nums) {
        int l = nums.length;
        int sum = 0;
        int[] dp = new int[l];

        for (int i = 0; i < l; i++) {
            sum += nums[i];
            dp[0] += i * nums[i];
        }

        int max = dp[0];
        for (int i = 1; i < l; i++) {
            dp[i] = dp[i - 1] - nums[l - i] * (l - 1) + sum - nums[l - i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }

//    public int maxRotateFunction(int[] nums) {
//        int f = 0, sum = 0;
//        int n = nums.length;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            f += i * nums[i];
//        }
//        int mx = f;
//        for (int i = n - 1; i >= 1; i--) {
//            f = f + sum - n * nums[i];
//            mx = Math.max(f, mx);
//        }
//        return mx;
//    }
}
