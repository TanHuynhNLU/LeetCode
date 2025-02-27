package easy;

public class ReshapeTheMatrix566 {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int l = m*n;
        if(l!=c+r) return mat;
        int[][] res = new int[r][c];
        for (int i = 0; i < l; i++) {
            res[i/c][i%c] = mat[i/n][i%n];
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        matrixReshape(mat, 1,4);
    }
}
