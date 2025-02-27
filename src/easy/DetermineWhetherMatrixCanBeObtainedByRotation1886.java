package easy;

public class DetermineWhetherMatrixCanBeObtainedByRotation1886 {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(check(mat,target)) return true;
        for (int i = 0; i < 3; i++) {
            mat = rotate(mat);
            if(check(mat,target)) return true;
        }
        return false;
    }
    public int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] newMat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMat[j][n-i] = mat[i][j];
            }
        }
        return newMat;
    }
    
    public boolean check(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
}
