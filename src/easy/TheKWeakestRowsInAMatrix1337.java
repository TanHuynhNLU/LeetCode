package easy;

public class TheKWeakestRowsInAMatrix1337 {


    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        boolean[] visited = new boolean[mat.length];
        int count = 0;
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (!visited[j]&&mat[j][i] == 0) {
                    res[count++] = j;
                    visited[j]=true;
                }
                if (count == k ) return res;
            }
        }
        if(count!=k){
            for (int i = 0; i < mat.length; i++) {
                if (visited[i]) continue;
                res[count++] = i;
                if (count == k ) return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        kWeakestRows(mat,3);
    }
}
