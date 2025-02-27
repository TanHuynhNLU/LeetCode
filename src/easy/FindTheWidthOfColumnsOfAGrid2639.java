package easy;

public class FindTheWidthOfColumnsOfAGrid2639 {
    public int[] findColumnWidth(int[][] grid) {
        int[] ans = new int[grid[0].length];
        int c = 0;
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max, String.valueOf(grid[j][i]).length());
            }
            ans[c++] = max;
        }
        return ans;
    }
    //    Best Solution
//    public int[] findColumnWidth(int[][] grid) {
//        int row = 0;
//        if (grid.length == 1 && grid[0].length == 1) {
//            return new int[]{1};
//        }
//        int arr[] = new int[grid[0].length];
//        for (int i = 0; i < grid[0].length; i++) {
//            arr[i] = check(grid, i);
//        }
//        return arr;
//    }
//
//    private static int check(int[][] grid, int col) {
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < grid.length; i++) {
//            max = Math.max(max, go(grid[i][col]));
//        }
//        return max;
//    }
//
//    private static int go(int num) {
//        int x = num;
//        if (x < 0) {
//            x *= -1;
//        }
//        int count = 0;
//        while (x != 0) {
//            count++;
//            x /= 10;
//        }
//        if (num <= 0) {
//            return count + 1;
//        } else {
//            return count;
//        }
//    }
}
