package easy;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] arr = new int[grid.length * grid[0].length];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                arr[count++] = grid[i][j];
            }
        }
        if (k == 0) count = 0;
        else count = arr.length - (k % arr.length);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                if (count == arr.length) count = 0;
                row.add(arr[count++]);
            }
            res.add(row);
        }
        return res;
    }
}
