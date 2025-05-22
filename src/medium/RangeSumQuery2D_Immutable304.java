package medium;

public class RangeSumQuery2D_Immutable304 {

    int[][] prefix;

    public RangeSumQuery2D_Immutable304(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        prefix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefix[i][j] = matrix[i][j];
                if (j > 0) prefix[i][j] = matrix[i][j] + prefix[i][j - 1];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefix[i][j] += prefix[i - 1][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int calc = prefix[row2][col2];
        if (row1 > 0) {
            calc -= prefix[row1 - 1][col2];
        }
        if (col1 > 0) {
            calc -= prefix[row2][col1 - 1];
        }
        if (row1 > 0 && col1 > 0) calc += prefix[row1 - 1][col1 - 1];
        return calc;
    }
}
