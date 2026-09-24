package medium;

public class KnightProbabilityInChessboard688 {
    public double knightProbability(int n, int k, int row, int column) {
        int[][] directions = {{-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {2, 1}, {1, 2}, {-1, 2}};
        double[][] dp = new double[n][n];
        dp[row][column] = 1;
        for (int i = 0; i < k; i++) {
            double[][] tmp = new double[n][n];
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    if (dp[j][l] != 0) {
                        for (int[] direction : directions) {
                            int newRow = j + direction[0];
                            int newCol = l + direction[1];
                            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n) {
                                tmp[newRow][newCol] += dp[j][l] / 8;
                            }
                        }
                    }
                }
            }
            dp = tmp;
        }
        double res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res += dp[i][j];
            }
        }
        return res;
    }

    //Best solution
//    protected static final double cellProb = 0.125;
//    protected static final int rowDir = 0,
//            colDir = 1;
//    protected static final int[][] dirs = new int[][]{
//            new int[]{2, 1},
//            new int[]{2, -1},
//            new int[]{-2, 1},
//            new int[]{-2, -1},
//            new int[]{1, 2},
//            new int[]{1, -2},
//            new int[]{-1, 2},
//            new int[]{-1, -2}
//    };
//
//    protected double dfs(int k, int N, int r, int c, double[][][] dp) {
//        if (r < 0 || r >= N || c < 0 || c >= N) return 0.0;
//        if (k == 0) return 1.0;
//        r = Math.min(r, N - r - 1);
//        c = Math.min(c, N - c - 1);
//        if (dp[k - 1][r][c] == 0) {
//            double prob = 0.0;
//            for (int[] dir : dirs)
//                prob += dfs(k - 1, N, r + dir[rowDir], c + dir[colDir], dp);
//            prob *= cellProb;
//            dp[k - 1][r][c] = prob;
//        }
//        return dp[k - 1][r][c];
//    }
//
//    public double knightProbability(int N, int K, int r, int c) {
//        int mid = (N >> 1) + 1;
//        return dfs(K, N, r, c, new double[K][mid][mid]);
//    }
}
