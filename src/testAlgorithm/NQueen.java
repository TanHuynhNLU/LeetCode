package testAlgorithm;

public class NQueen {
    public static void nQueen(int n) {
        int[][] matrix = new int[n][n];
        solve(matrix, 0, 0, n);
    }

    public static void solve(int[][] matrix, int row, int col, int num) {
        if (col == num) {
            printMatrix(matrix);
            return;
        } else {
            for (int i = 0; i < num; i++) {
                if (check(matrix, i, col)) {
                    matrix[i][col] = 1;
                    solve(matrix, 0, col + 1, num);
                    matrix[i][col] = 0;
                }
            }
        }
    }

    public static boolean check(int[][] matrix, int row, int col) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[row][i] == 1) return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] == 1) return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 1) return false;
        }
        for (int i = row + 1, j = col - 1; i < matrix.length && j >= 0; i++, j--) {
            if (matrix[i][j] == 1) return false;
        }
        return true;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        nQueen(4);
    }
}
