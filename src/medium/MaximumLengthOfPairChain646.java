package medium;

import java.util.Arrays;

public class MaximumLengthOfPairChain646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        int[] prev = pairs[0];
        int res = 0;
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > prev[1]) {
                res++;
                prev = pairs[i];
            }
        }
        return res;
    }

    //Best solution
//    public int findLongestChain(int[][] pairs) {
//        int OFFSET = 1000;
//        int[] maxStartForEnd = new int[2005];
//        for (int i = 0; i < 2005; i++) {
//            maxStartForEnd[i] = -2000;
//        }
//        for (int[] pair : pairs) {
//            int start = pair[0];
//            int end = pair[1] + OFFSET;
//            if (start > maxStartForEnd[end]) {
//                maxStartForEnd[end] = start;
//            }
//        }
//        int len = 0;
//        int currentEnd = -2000;
//        for (int end = 0; end < 2005; end++) {
//            int start = maxStartForEnd[end];
//            if (start != -2000 && start > currentEnd) {
//                len++;
//                currentEnd = end - OFFSET;
//            }
//        }
//        return len;
//    }
}
