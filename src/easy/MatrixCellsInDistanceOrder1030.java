package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MatrixCellsInDistanceOrder1030 {

    boolean[][] visited;

    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        Queue<Pair> queue = new LinkedList<>();
        int[][] res = new int[rows * cols][2];
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, -1, 0, 1};

        visited = new boolean[rows][cols];
        queue.add(new Pair(rCenter, cCenter));
        visited[rCenter][cCenter] = true;
        int count = 0;
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            res[count++] = new int[]{pair.x, pair.y};
            for (int i = 0; i < 4; i++) {
                int x = pair.x + dRow[i];
                int y = pair.y + dCol[i];
                if (isValid(x, y, rows, cols)) {
                    queue.add(new Pair(x, y));
                    visited[x][y] = true;
                }
            }
        }
        return res;
    }

    public boolean isValid(int x, int y, int rows, int cols) {
        if (x < 0 || y < 0 || x >= rows || y >= cols) return false;
        if (visited[x][y]) return false;
        return true;
    }

    class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }


}
