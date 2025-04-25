package medium;

public class MaximumSquare221 {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = matrix[0][0] - '0';
        int res = dp[0][0];

        for (int i = 1; i < m; i++) {
            dp[i][0] = matrix[i][0] - '0';
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = matrix[0][i] - '0';
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == '1' && matrix[i - 1][j] == '1' && matrix[i][j - 1] == '1' && matrix[i - 1][j - 1] == '1') {
                    int min = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                    dp[i][j] = min + 1;
                } else {
                    dp[i][j] = matrix[i][j] - '0';
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res = Math.max(res, dp[i][j] * dp[i][j]);
            }
        }
        return res;
    }

    //Popular Solution
//    public int maximalSquare(char[][] matrix) {
//        int n = matrix.length;
//        int m = matrix[0].length;
//        int[][] dp = new int[n + 1][m + 1];
//        int max = 0;
//        for (int i = 1; i < n + 1; i++) {
//            for (int j = 1; j < m + 1; j++) {
//                if (matrix[i - 1][j - 1] == '1') {
//                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
//                    max = Math.max(max, dp[i][j]);
//                }
//
//            }
//        }
//        return max * max;
//    }
}
