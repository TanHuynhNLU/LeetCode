package easy;

import java.util.Arrays;

public class DeleteGreatestValueInEachRow2500 {
    public int deleteGreatestValue(int[][] grid) {
        int res = 0;
        for (int[] arr : grid) {
            Arrays.sort(arr);
        }
        for (int i = grid[0].length - 1; i >= 0; i--) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max, grid[j][i]);
            }
            res += max;
        }
        return res;
    }
}
