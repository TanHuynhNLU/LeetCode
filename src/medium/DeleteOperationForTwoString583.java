package medium;

public class DeleteOperationForTwoString583 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int lcs = lcs(word1, word2, new int[m][n], m - 1, n - 1);
        return m - lcs + n - lcs;
    }

    public int lcs(String s1, String s2, int[][] dp, int i, int j) {
        if (i < 0 || j < 0) return 0;
        if (dp[i][j] != 0) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            int val = 1 + lcs(s1, s2, dp, i - 1, j - 1);
            dp[i][j] = val;
            return val;
        } else {
            int val = Math.max(lcs(s1, s2, dp, i - 1, j), lcs(s1, s2, dp, i, j - 1));
            dp[i][j] = val;
            return val;
        }
    }

    //Best Solution
//    public int minDistance(String W1, String W2) {
//        int m = W1.length(), n = W2.length();
//        if (m < n) {
//            String tempStr = W1;
//            W1 = W2;
//            W2 = tempStr;
//            int tempInt = n;
//            n = m;
//            m = tempInt;
//        }
//        char[] WA1 = W1.toCharArray(), WA2 = W2.toCharArray();
//        int[] dpLast = new int[n+1], dpCurr = new int[n+1];
//        for (char c1 : WA1) {
//            for (int j = 0; j < n; j++)
//                dpCurr[j+1] = c1 == WA2[j]
//                        ? dpLast[j] + 1
//                        : Math.max(dpCurr[j], dpLast[j+1]);
//            int[] tempArr = dpLast;
//            dpLast = dpCurr;
//            dpCurr = tempArr;
//        }
//        return m + n - 2 * dpLast[n];
//    }
}
