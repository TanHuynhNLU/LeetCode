package easy;

public class SurfaceAreaOf3DShapes892 {
    public static int surfaceArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[i][j]==0) continue;
                sum += 4 * grid[i][j] + 2;
                if (j > 0) {
                    sum -= Math.min(grid[i][j], grid[i][j - 1])*2;
                }
                if (i > 0) {
                    sum -= Math.min(grid[i][j], grid[i - 1][j])*2;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,2},{3,4}};
        System.out.println(surfaceArea(grid));
    }
}
