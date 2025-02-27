package easy;

public class LargestLocalValuesInAMatrix2373 {
    public int[][] largestLocal(int[][] grid) {
        int[][] local = new int[grid.length - 2][grid.length - 2];
        for (int i = 0; i < local.length; i++) {
            for (int j = 0; j < local.length; j++) {
                local[i][j] = maxValue(i,j,grid);
            }
        }
        return local;
    }
    public int maxValue(int i , int j, int[][]grid){
        int max = 0;
        for (int k = i; k < i+3; k++) {
            for (int l = j; l < j+3; l++) {
                max = Math.max(max, grid[k][l]);
            }
        }
        return max;
    }
}
