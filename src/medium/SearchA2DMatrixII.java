package medium;

public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] > target) return false;
            if (binarySearch(matrix, i, 0, n - 1, target)) return true;
        }
        return false;
    }

    public boolean binarySearch(int[][] matrix, int row, int start, int end, int target) {
        while (start < end) {
            int mid = (start + end) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                start = mid + 1;
            } else if (matrix[row][mid] > target) {
                end = mid - 1;
            }
        }
        return false;
    }

    //    Best Solution
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int row = 0;
//        int col = matrix[0].length - 1;
//        while (row < matrix.length && col >= 0) {
//            if (matrix[row][col] == target) return true;
//            else if (matrix[row][col] > target) col--;
//            else row++;
//        }
//        return false;
//    }

}
