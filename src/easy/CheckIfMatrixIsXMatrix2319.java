package easy;

public class CheckIfMatrixIsXMatrix2319 {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            if (grid[i][i] == 0) return false;
            visited[i][i] = true;
            if (grid[n - 1 - i][i] == 0) return false;
            visited[n - 1 - i][i] = true;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] != 0) return false;
            }
        }
        return true;
    }

    //    Best Solution
//    public boolean checkXMatrix(int[][] grid) {
//        return checkLayer(0, grid.length - 1, grid);
//    }
//
//    private boolean checkLayer(int first, int last, int[][] grid) {
//        if (grid[first][first] == 0 || grid[first][last] == 0 ||
//                grid[last][first] == 0 || grid[last][last] == 0) return false;
//        for (int i = first + 1; i < last; i++) {
//            if (grid[first][i] != 0 || grid[i][first] != 0 ||
//                    grid[last][i] != 0 || grid[i][last] != 0) return false;
//        }
//        if (first + 1 >= last) return true;
//        return checkLayer(first + 1, last - 1, grid);
//    }
}
