package medium;

import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix378 {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o1[0], o2[0]));
        boolean[][] visited = new boolean[n][n];
        queue.add(new int[]{matrix[0][0], 0, 0});
        visited[0][0] = true;

        int count = 0;
        while (!queue.isEmpty()) {
            int[] first = queue.poll();
            int i = first[1];
            int j = first[2];
            count++;
            if (count == k) return matrix[i][j];
            if (i + 1 < n && !visited[i + 1][j]) {
                queue.add(new int[]{matrix[i + 1][j], i + 1, j});
                visited[i + 1][j] = true;
            }
            if (j + 1 < n && !visited[i][j + 1]) {
                queue.add(new int[]{matrix[i][j + 1], i, j + 1});
                visited[i][j + 1] = true;
            }
        }
        return 0;
    }

    //Best solution
//    public int kthSmallest(int[][] matrix, int k) {
//        int n = matrix.length;
//        int min = matrix[0][0];
//        int max = matrix[n - 1][n - 1];
//
//        while (min < max) {
//            int mid = min + (max - min) / 2;
//            int count = countLessEqual(matrix, mid);
//
//            if (count < k) {
//                min = mid + 1;
//            } else {
//                max = mid;
//            }
//        }
//
//        return min;
//    }

    // Efficiently count number of elements ≤ mid
//    private int countLessEqual(int[][] matrix, int mid) {
//        int n = matrix.length;
//        int row = n - 1;
//        int col = 0;
//        int count = 0;
//
//        while (row >= 0 && col < matrix[0].length) {
//            if (matrix[row][col] <= mid) {
//                count += (row + 1);  // all elements above in this column are ≤ mid
//                col++;
//            } else {
//                row--;
//            }
//        }
//
//        return count;
//    }
}
