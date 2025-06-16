package medium;

public class IntegerBreak343 {
    public int integerBreak(int n) {
        if(n<=3) return n-1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            int firstNum = Math.floorDiv(i, 2);
            int secondNum = i - firstNum;
            dp[i] = Math.max(dp[firstNum] * dp[secondNum], dp[firstNum - 1] * dp[secondNum + 1]);
        }
        return dp[n];
    }
    // Other Solution
//    public int integerBreak(int n) {
//        if (n <= 3) return n - 1;
//        int res = 1;
//        while (n > 4) {
//            res *= 3;
//            n -= 3;
//        }
//        return res * n;
//    }
}
