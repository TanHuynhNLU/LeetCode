package medium;

public class MinimumPathSum64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }
        for (int i = 1; i < n; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int min = Math.min(dp[i - 1][j], dp[i][j - 1]);
                dp[i][j] = min + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }

    //    Best Solution
//    public int minPathSum(int[][] grid) {
//        int m = grid.length, n = grid[0].length;
//        fill(0, 0, m, n, grid);
//        return grid[m - 1][n - 1];
//    }
//
//    void fill(int r, int c, int m, int n, int[][] grid) {
//        if (r >= m || c >= n) return;
//        if (r != 0 && c != 0) grid[r][c] = grid[r][c] + Math.min(grid[r - 1][c], grid[r][c - 1]);
//        for (int i = r + 1; i < m; i++) {
//            if (c == 0) grid[i][c] = grid[i][c] + grid[i - 1][c];
//            else grid[i][c] = grid[i][c] + Math.min(grid[i - 1][c], grid[i][c - 1]);
//        }
//        for (int i = c + 1; i < n; i++) {
//            if (r == 0) grid[r][i] = grid[r][i] + grid[r][i - 1];
//            else grid[r][i] = grid[r][i] + Math.min(grid[r][i - 1], grid[r - 1][i]);
//        }
//        fill(r + 1, c + 1, m, n, grid);
//    }
}
