package easy;

import java.util.Arrays;

public class Convert1DArrayInto2DArray2022 {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length) return new int[0][0];
        int[][] result = new int[m][n];
        for(int i = 0; i < original.length; i++){
            result[i/m][i%n] = original[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] original = {1,2};
        construct2DArray(original,1,1);
    }
}
