package easy;

public class MatrixSimilarityAfterCyclicShifts2946 {
    public boolean areSimilar(int[][] mat, int k) {
        int[][] dp = new int[mat.length][mat[0].length];
        k = k % mat[0].length;
        for (int i = 0; i < mat.length; i++) {
            if (i % 2 == 0) {
                dp[i] = leftShift(mat[i], k);
            } else {
                dp[i] = rightShift(mat[i], k);
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (dp[i][j] != mat[i][j]) return false;
            }
        }
        return true;
    }

    public int[] leftShift(int[] arr, int k) {
        int n = arr.length;
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            int index = (i + n - k) % n;
            tmp[index] = arr[i];
        }
        return tmp;
    }

    public int[] rightShift(int[] arr, int k) {
        int n = arr.length;
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            int index = (i + k) % n;
            tmp[index] = arr[i];
        }
        return tmp;
    }

    //    Best Solution
//    public boolean areSimilar(int[][] mat, int k) {
//        int cols = mat[0].length;
//        if ((k %= cols) == 0)
//            return true;
//
//        int rows = mat.length;
//        int[][] res = new int[rows][cols];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                int newCol = (i % 2 == 0) ? j - k : j + k;
//
//                if (newCol >= cols) newCol -= cols;
//                else if (newCol < 0) newCol += cols;
//
//                res[i][newCol] = mat[i][j];
//            }
//        }
//
//        for (int i = 0; i < rows; i++)
//            for (int j = 0; j < cols; j++)
//                if (res[i][j] != mat[i][j])
//                    return false;
//
//        return true;
//    }
}
