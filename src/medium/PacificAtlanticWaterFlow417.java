package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PacificAtlanticWaterFlow417 {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] pacificOcean = new boolean[m][n];
        boolean[][] atlanticOcean = new boolean[m][n];

        // Water can flow to the Pacific Ocean
        for (int i = 0; i < m; i++) {
            pacificOcean[i][0] = true;
            bfs(pacificOcean, heights, i, 0);
        }

        for (int i = 0; i < n; i++) {
            pacificOcean[0][i] = true;
            bfs(pacificOcean, heights, 0, i);
        }


        // Water can flow to the Atlantic Ocean
        for (int i = 0; i < m; i++) {
            atlanticOcean[i][n - 1] = true;
            bfs(atlanticOcean, heights, i, n - 1);
        }

        for (int i = 0; i < n; i++) {
            atlanticOcean[m - 1][i] = true;
            bfs(atlanticOcean, heights, m - 1, i);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacificOcean[i][j] && atlanticOcean[i][j]) res.add(List.of(i, j));
            }
        }
        return res;
    }

    public void bfs(boolean[][] matrix, int[][] heights, int row, int col) {
        int m = matrix.length;
        int n = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col});
        while (!queue.isEmpty()) {
            int[] position = queue.poll();
            int i = position[0];
            int j = position[1];
            if (i + 1 <= m - 1 && !matrix[i + 1][j] && heights[i + 1][j] >= heights[i][j]) {
                queue.add(new int[]{i + 1, j});
                matrix[i + 1][j] = true;
            }
            if (j + 1 <= n - 1 && !matrix[i][j + 1] && heights[i][j + 1] >= heights[i][j]) {
                queue.add(new int[]{i, j + 1});
                matrix[i][j + 1] = true;
            }
            if (i - 1 >= 0 && !matrix[i - 1][j] && heights[i - 1][j] >= heights[i][j]) {
                queue.add(new int[]{i - 1, j});
                matrix[i - 1][j] = true;
            }
            if (j - 1 >= 0 && !matrix[i][j - 1] && heights[i][j - 1] >= heights[i][j]) {
                queue.add(new int[]{i, j - 1});
                matrix[i][j - 1] = true;
            }
        }
    }
}
