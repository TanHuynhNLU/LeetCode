package medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    static List<Integer> result = new ArrayList<>();

    public static List<Integer> spiralOrder(int[][] matrix) {
        int maxSize = matrix.length * matrix[0].length;
        int boundLeft = 0;
        int boundRight = matrix[0].length - 1;
        int boundTop = 0;
        int boundBottom = matrix.length - 1;
        while (result.size() != maxSize) {
            moveRight(matrix, boundTop, boundLeft, boundRight);
            boundTop++;
            if (result.size() != maxSize) moveDown(matrix, boundRight, boundTop, boundBottom);
            boundRight--;
            if (result.size() != maxSize) moveLeft(matrix, boundBottom, boundLeft, boundRight);
            boundBottom--;
            if (result.size() != maxSize) moveUp(matrix, boundLeft, boundTop, boundBottom);
            boundLeft++;
        }
        return result;
    }

    public static void moveRight(int[][] matrix, int row, int boundLeft, int boundRight) {
        for (int i = boundLeft; i <= boundRight; i++) {
            result.add(matrix[row][i]);
        }
    }

    public static void moveDown(int[][] matrix, int col, int boundTop, int boundBottom) {
        for (int i = boundTop; i <= boundBottom; i++) {
            result.add(matrix[i][col]);
        }
    }

    public static void moveLeft(int[][] matrix, int row, int boundLeft, int boundRight) {
        for (int i = boundRight; i >= boundLeft; i--) {
            result.add(matrix[row][i]);
        }
    }

    public static void moveUp(int[][] matrix, int col, int boundTop, int boundBottom) {
        for (int i = boundBottom; i >= boundTop; i--) {
            result.add(matrix[i][col]);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        spiralOrder(matrix);
    }
}
