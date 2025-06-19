package medium;

public class CountNumbersWithUniqueDigits357 {
    public int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            int res = 9;
            int count = 9;
            for (int j = 1; j < i; j++) {
                res *= count--;
            }
            dp[i] = res+dp[i-1];
        }
        return dp[n];
    }
}
