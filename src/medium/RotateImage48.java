package medium;

public class RotateImage48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (i != j) {
                    swapAcross(matrix, i, j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                swapCol(matrix, i, j, n - j - 1);

            }
        }
    }

    public void swapAcross(int[][] matrix, int i, int j) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = tmp;
    }

    public void swapCol(int[][] matrix, int row, int col1, int col2) {
        int tmp = matrix[row][col1];
        matrix[row][col1] = matrix[row][col2];
        matrix[row][col2] = tmp;
    }

}
