package medium;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands200 {
    public int numIslands(char[][] grid) {
        int res = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    res++;
                    dfs(i, j, grid, visited);
                }
            }
        }
        return res;
    }

    public void dfs(int row, int col, char[][] grid, boolean[][] visited) {
        visited[row][col] = true;
        if (row > 0 && !visited[row - 1][col] && grid[row - 1][col] == '1') {
            dfs(row - 1, col, grid, visited);
        }
        if (row < grid.length - 1 && !visited[row + 1][col] && grid[row + 1][col] == '1') {
            dfs(row + 1, col, grid, visited);

        }
        if (col > 0 && !visited[row][col - 1] && grid[row][col - 1] == '1') {
            dfs(row, col - 1, grid, visited);

        }
        if (col < grid[0].length - 1 && !visited[row][col + 1] && grid[row][col + 1] == '1') {
            dfs(row, col + 1, grid, visited);

        }
    }

    // Best solution
//    int rows, cols, islands = 0;
//
//    public int numIslands(char[][] grid) {
//        rows = grid.length;
//        cols = grid[0].length;
//        for (int row = 0; row < rows; row++)
//            check(grid, row);
//        return islands;
//    }
//
//    public void check(final char[][] grid, int row) {
//        final char[] finalRow = grid[row];
//        for (int col = 0; col < cols; ++col)
//            if (finalRow[col] == '1') {
//                ++islands;
//                dfs(grid, row, col);
//            }
//    }
//
//    public void dfs(char[][] grid, int row, int col) {
//        grid[row][col] = '*';
//        if (row > 0 && grid[row - 1][col] == '1')
//            dfs(grid, row - 1, col);
//        if (row + 1 < rows && grid[row + 1][col] == '1')
//            dfs(grid, row + 1, col);
//        if (col > 0 && grid[row][col - 1] == '1')
//            dfs(grid, row, col - 1);
//        if (col + 1 < cols && grid[row][col + 1] == '1')
//            dfs(grid, row, col + 1);
//    }
}
