package easy;

public class ToeplitzMatrix766 {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int topLeft = matrix[i][0];
            for (int j = i + 1, k = 1; j < matrix.length && k < matrix[j].length; j++, k++) {
                if (matrix[j][k] != topLeft) return false;
            }
        }
        for (int i = 1; i < matrix[0].length; i++) {
            int topLeft = matrix[0][i];
            for (int j = 1, k =i+1; j < matrix.length && k < matrix[j].length; j++, k++) {
                if (matrix[j][k] != topLeft) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.println(isToeplitzMatrix(matrix));
    }
}
