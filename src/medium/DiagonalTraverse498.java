package medium;

public class DiagonalTraverse498 {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int i = 0;
        int row = 0;
        int col = 0;
        boolean isUp = true;
        int[] res = new int[m * n];
        while (i < m * n) {
            if (isUp) {
                while (true) {
                    res[i++] = mat[row][col];
                    if (row == 0 || col == n - 1) {
                        if (col + 1 < n) {
                            col++;
                            break;
                        } else {
                            row++;
                            break;
                        }
                    }
                    col++;
                    row--;
                }
                isUp = false;
            } else {
                while (true) {
                    res[i++] = mat[row][col];
                    if (col == 0 || row == m - 1) {
                        if (row + 1 < m) {
                            row++;
                            break;
                        } else {
                            col++;
                            break;
                        }
                    }
                    col--;
                    row++;
                    isUp = true;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        findDiagonalOrder(mat);
    }
}
