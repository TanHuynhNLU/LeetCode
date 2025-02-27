package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LuckyNumbersInAMatrix1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        Set<Integer> minSet = new HashSet<>();
        Set<Integer> maxSet = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[1].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            minSet.add(min);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int max = 0;
            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            maxSet.add(max);
        }
        for (int i : minSet) {
            if (maxSet.contains(i)) res.add(i);
        }
        return res;
    }
//    Best Solution
//    public List<Integer> luckyNumbers (int[][] matrix) {
//    int m = matrix.length;  // row
//    int n = matrix[0].length; // column
//
//    List<Integer> luckyNumbers = new ArrayList<>();
//    for (int row = 0; row < m; row++) {
//        int columnIndex = getMinInRow(matrix, n, row);
//        if (isMaxInColumn(matrix, m, row, columnIndex)) {
//            luckyNumbers.add(matrix[row][columnIndex]);
//        }
//    }
//    return luckyNumbers;
//}
//
//    public int getMinInRow(int[][] matrix, int n, int row) {
//        int min = matrix[row][0], indexColumn = 0;
//        for (int i = 1; i < n; i++) {
//            if (matrix[row][i] < min) {
//                min = matrix[row][i];
//                indexColumn = i;
//            }
//        }
//        return indexColumn;
//    }
//
//    public boolean isMaxInColumn(int[][] matrix, int m, int row, int column) {
//        int max = matrix[row][column];
//        for (int i = 0; i < m; i++) {
//            if (matrix[i][column] > max) {
//                return false;
//            }
//        }
//        return true;
//    }
}
