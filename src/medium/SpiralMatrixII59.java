package medium;

public class SpiralMatrixII59 {
    int count = 1;

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int boundLeft = 0;
        int boundRight = n - 1;
        int boundTop = 0;
        int boundBottom = n - 1;
        while (count<=n*n) {
            moveRight(matrix, boundTop, boundLeft, boundRight);
            boundTop++;
            if (count<=n*n) moveDown(matrix, boundRight, boundTop, boundBottom);
            boundRight--;
            if (count<=n*n) moveLeft(matrix, boundBottom, boundLeft, boundRight);
            boundBottom--;
            if (count<=n*n) moveUp(matrix, boundLeft, boundTop, boundBottom);
            boundLeft++;
        }
        return matrix;
    }

    public void moveRight(int[][] matrix, int row, int boundLeft, int boundRight) {
        for (int i = boundLeft; i <= boundRight; i++) {
            matrix[row][i]=count++;
        }
    }

    public void moveDown(int[][] matrix, int col, int boundTop, int boundBottom) {
        for (int i = boundTop; i <= boundBottom; i++) {
            matrix[i][col]=count++;
        }
    }

    public void moveLeft(int[][] matrix, int row, int boundLeft, int boundRight) {
        for (int i = boundRight; i >= boundLeft; i--) {
            matrix[row][i]=count++;
        }
    }

    public void moveUp(int[][] matrix, int col, int boundTop, int boundBottom) {
        for (int i = boundBottom; i >= boundTop; i--) {
            matrix[i][col]=count++;
        }
    }
}
