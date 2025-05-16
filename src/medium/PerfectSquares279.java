package medium;

import java.util.Arrays;

public class PerfectSquares279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }
        return dp[n];
    }

    //Best solution: Legendre's 4,3-square Theorem
//    public int numSquares(int n) {
//        int sqrt = (int)Math.sqrt(n);
//        if(sqrt*sqrt == n) return 1;
//        while(n%4==0) n=n/4;
//
//        if(n%8 == 7) return 4;
//        for(int i=1;i*i<=n;i++){
//            int base = (int) Math.sqrt(n-i*i);
//            if(base * base == n-i*i) return 2;
//        }
//
//        return 3;
//    }
}
