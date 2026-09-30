package medium;

public class MaxAreaOfIsland695 {
    int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, visited, i, j));
                }
            }

        }
        return max;
    }

    public int dfs(int[][] grid, boolean[][] visited, int row, int col) {
        if (visited[row][col]) return 0;
        visited[row][col] = true;
        int res = 1;
        for (int[] direction : directions) {
            int r = row + direction[0];
            int c = col + direction[1];
            if (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && !visited[r][c] && grid[r][c] == 1) {
                res += dfs(grid, visited, r, c);
            }
        }
        return res;
    }

    // Best solution
//    public int maxAreaOfIsland(int[][] grid) {
//        int maxArea = 0;
//
//        for (int r = 0; r < grid.length; r++) {
//            for (int c = 0; c < grid[0].length; c++) {
//                if (grid[r][c] == 1) {
//                    maxArea = Math.max(dfs(grid, r, c), maxArea);
//                }
//            }
//        }
//
//        return maxArea;
//    }
//
//    public int dfs(int[][] grid, int r, int c) {
//        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length) {
//            return 0;
//        }
//
//        if (grid[r][c] == 0) {
//            return 0;
//        }
//
//        grid[r][c] = 0;
//
//        int areaUp = dfs(grid, r - 1, c);
//        int areaDown = dfs(grid, r + 1, c);
//        int areaLeft = dfs(grid, r, c - 1);
//        int areaRight = dfs(grid, r, c+1);
//
//        return (areaUp + areaDown + areaLeft + areaRight) + 1;
//    }
}
