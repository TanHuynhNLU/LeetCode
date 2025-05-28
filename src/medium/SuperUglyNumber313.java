package medium;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SuperUglyNumber313 {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        long[] dp = new long[n];
        int[] indexes = new int[primes.length];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                long calc = dp[indexes[j]] * primes[j];
                if (calc < min) {
                    min = calc;
                }
            }
            dp[i] = min;
            for (int j = 0; j < primes.length; j++) {
                long calc = dp[indexes[j]] * primes[j];
                if (calc == min) {
                    indexes[j]++;
                }
            }
        }
        return (int) dp[n - 1];
    }

    // Best solution
//    public int nthSuperUglyNumber(int n, int[] primes) {
//        if (n == 5911) return 2144153025;
//        if (n == 1719) return 2135179264;
//        int[] ugly = new int[n];
//        int[] idx = new int[primes.length];
//        int[] val = new int[primes.length];
//        Arrays.fill(val, 1);
//        int next = 1;
//        for (int i = 0; i < n; i++) {
//            ugly[i] = next;
//            next = Integer.MAX_VALUE;
//            for (int j = 0; j < primes.length; j++) {
//                if (val[j] == ugly[i]) val[j] = ugly[idx[j]++] * primes[j];
//                next = Math.min(next, val[j]);
//            }
//        }
//        return ugly[n - 1];
//    }
}
