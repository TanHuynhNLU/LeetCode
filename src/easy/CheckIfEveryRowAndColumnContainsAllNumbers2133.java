package easy;

import java.util.HashSet;

public class CheckIfEveryRowAndColumnContainsAllNumbers2133 {
    public boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < matrix.length; j++) {
                set.add(matrix[i][j]);
            }
            if (set.size() != matrix.length) return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < matrix.length; j++) {
                set.add(matrix[j][i]);
            }
            if (set.size() != matrix.length) return false;
        }
        return true;
    }

    //    Best Solution
//    public boolean checkValid(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            if (!check(i, matrix)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private boolean check(int row, int[][] matrix) {
//        boolean[] rowArr = new boolean[matrix.length];
//        boolean[] colArr = new boolean[matrix.length];
//
//        for (int i = 0; i < matrix.length; i++) {
//            int rowIndex = matrix[row][i] - 1;
//            int colIndex = matrix[i][row] - 1;
//            if (rowArr[rowIndex] == true) {
//                return false;
//            } else {
//                rowArr[rowIndex] = true;
//            }
//
//            if (colArr[colIndex] == true) {
//                return false;
//            } else {
//                colArr[colIndex] = true;
//            }
//        }
//
//        return true;
//    }
}
