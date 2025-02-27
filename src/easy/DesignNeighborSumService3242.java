package easy;

public class DesignNeighborSumService3242 {
    public int[][] grid;
    public int[][] positions;

    public DesignNeighborSumService3242(int[][] grid) {
        this.grid = grid;
        positions = new int[grid.length * grid.length][2];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[1].length; j++) {
                positions[grid[i][j]][0] = i;
                positions[grid[i][j]][1] = j;
            }
        }
    }

    public int adjacentSum(int value) {
        int row = positions[value][0];
        int col = positions[value][1];
        int sum = 0;
        if (row > 0) sum += grid[row - 1][col];
        if (row < grid.length - 1) sum += grid[row + 1][col];
        if (col > 0) sum += grid[row][col - 1];
        if (col < grid.length - 1) sum += grid[row][col + 1];
        return sum;
    }

    public int diagonalSum(int value) {
        int row = positions[value][0];
        int col = positions[value][1];
        int sum = 0;
        if (row > 0 && col > 0) sum += grid[row - 1][col - 1];
        if (row > 0 && col < grid.length - 1) sum += grid[row - 1][col + 1];
        if (row < grid.length - 1 && col > 0) sum += grid[row + 1][col - 1];
        if (row < grid.length - 1 && col < grid.length - 1) sum += grid[row + 1][col + 1];
        return sum;
    }
}

//Best Solution
//class NeighborSum {
//    private int[] adj;
//    private int[] diag;
//
//    public NeighborSum(int[][] grid) {
//        adj = new int[grid.length * grid.length];
//        diag = new int[grid.length * grid.length];
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                int curr = grid[i][j];
//                adj[curr] = calculateAdjSum(grid, i, j);
//                diag[curr] = calculateDiagSum(grid, i, j);
//            }
//        }
//    }
//
//    private int calculateAdjSum(int[][] grid, int i, int j) {
//        int adjSum = 0;
//        if (i - 1 >= 0) {
//            adjSum += grid[i-1][j];
//        }
//        if (i + 1 < grid.length) {
//            adjSum += grid[i+1][j];
//        }
//        if (j - 1 >= 0) {
//            adjSum += grid[i][j-1];
//        }
//        if (j + 1 < grid.length) {
//            adjSum += grid[i][j+1];
//        }
//        return adjSum;
//    }
//
//    private int calculateDiagSum(int[][] grid, int i, int j) {
//        int diagSum = 0;
//        if (i - 1 >= 0 && j - 1 >= 0) {
//            diagSum += grid[i-1][j-1];
//        }
//        if (i + 1 < grid.length && j + 1 < grid.length) {
//            diagSum += grid[i+1][j+1];
//        }
//        if (i + 1 < grid.length && j - 1 >= 0) {
//            diagSum += grid[i+1][j-1];
//        }
//        if (i - 1 >= 0 && j + 1 < grid.length) {
//            diagSum += grid[i-1][j+1];
//        }
//        return diagSum;
//    }
//
//    public int adjacentSum(int value) {
//        return adj[value];
//    }
//
//    public int diagonalSum(int value) {
//        return diag[value];
//    }
//}
