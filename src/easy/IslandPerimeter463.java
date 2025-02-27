package easy;

public class IslandPerimeter463 {
    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1)
                    perimeter += countPerimeter(grid, i, j);
            }
        }
        return perimeter;
    }

    public static int countPerimeter(int[][] grid, int i, int j) {
        int count = 4;
        if (i - 1 >= 0 && grid[i - 1][j] == 1) count--;
        if (i + 1 < grid.length && grid[i + 1][j] == 1) count--;
        if (j - 1 >= 0 && grid[i][j - 1] == 1) count--;
        if (j + 1 < grid[i].length && grid[i][j + 1] == 1) count--;
        return count;
    }

    //    Best solution
//    int numRows = grid.length;
//    int numCol = grid[0].length;
//    int perimeter = 0;
//       for(
//    int i = 0;
//    i<numRows;i++)
//
//    {
//        for (int j = 0; j < numCol; j++) {
//            if (grid[i][j] == 1) {
//                perimeter += 4;
//            }
//            if (j > 0) {
//                if (grid[i][j - 1] == 1 && grid[i][j] == 1) {
//                    perimeter -= 2;
//                }
//            }
//            if (i > 0) {
//                if (grid[i - 1][j] == 1 && grid[i][j] == 1) {
//                    perimeter -= 2;
//                }
//            }
//        }
//    }
//       return perimeter;

    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        System.out.println(islandPerimeter(grid));
    }
}
