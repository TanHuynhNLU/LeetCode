package medium;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class UglyNumberII264 {
    public static int nthUglyNumber(int n) {
        if (n == 1) return 1;
        int count = 1;
        TreeSet<Long> set = new TreeSet<>();
        set.add(1L);
        while (count < n) {
            long min = set.pollFirst();
            set.add(min * 2);
            set.add(min * 3);
            set.add(min * 5);
            count++;
        }
        return set.pollFirst().intValue();
    }

    //Best Solution
//    public static final int SIZE = 1690;
//    public static final int[] dp = new int[SIZE];
//    public static boolean isFilled = false;
//
//    public int nthUglyNumber(int n) {
//        if (!isFilled) fillValues();
//        return dp[n - 1];
//    }
//
//    public void fillValues() {
//        dp[0] = 1;
//        int p2 = 0, p3 = 0, p5 = 0;
//        for (int i = 1; i < SIZE; i++) {
//            int n2 = 2 * dp[p2], n3 = 3 * dp[p3], n5 = 5 * dp[p5];
//            dp[i] = Math.min(n2, Math.min(n3, n5));
//            if (dp[i] == n2) p2++;
//            if (dp[i] == n3) p3++;
//            if (dp[i] == n5) p5++;
//        }
//        isFilled = true;
//    }
}
