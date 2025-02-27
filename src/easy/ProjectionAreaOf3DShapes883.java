package easy;

public class ProjectionAreaOf3DShapes883 {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int countZ = 0;
        int[] maxY = new int[n];
        int[] maxX = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]!=0) countZ++;
                maxY[j] = Math.max(maxY[j], grid[i][j]);
                maxX[i] = Math.max(maxX[i], grid[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            countZ+=maxY[i]+maxX[i];
        }
        return countZ;
    }
}
