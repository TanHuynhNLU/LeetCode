package medium;

import java.util.ArrayList;
import java.util.List;

public class Triangle120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows = triangle.size();
        int cols = triangle.get(rows - 1).size();

        int[][] dp = new int[rows][cols];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < rows; i++) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + row.get(j);
                } else if (j == row.size() - 1) {
                    dp[i][j] = dp[i - 1][j - 1] + row.get(j);
                } else dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + row.get(j);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < cols; i++) {
            min = Math.min(min, dp[rows - 1][i]);
        }
        return min;
    }

    //    Best Solution
//    public static int minimumTotal(List<List<Integer>> triangle) {
//        int m = triangle.size();
//        int[][] dp = new int[m][m];
//        for (int[] d : dp) {
//            Arrays.fill(d, -1);
//        }
//        return helper1(0, 0, m, triangle, dp);
//    }
//
//    private static int helper1(int idx, int curr, int m, List<List<Integer>> triangle, int[][] dp) {
//        if (idx == m - 1) {
//            return triangle.get(idx).get(curr);
//        }
//        if (dp[idx][curr] != -1) {
//            return dp[idx][curr];
//        }
//        int down = helper1(idx + 1, curr, m, triangle, dp);
//        int diagonal = helper1(idx + 1, curr + 1, m, triangle, dp);
//        dp[idx][curr] = triangle.get(idx).get(curr) + Math.min(down, diagonal);
//        return dp[idx][curr];
//    }
}
