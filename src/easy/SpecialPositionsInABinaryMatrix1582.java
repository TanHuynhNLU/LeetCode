package easy;

public class SpecialPositionsInABinaryMatrix1582 {
    public int numSpecial(int[][] mat) {
        int[] rowCounter = new int[mat.length];
        int[] colCounter = new int[mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    rowCounter[i]++;
                    colCounter[j]++;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && rowCounter[i] == 1 && colCounter[j] == 1) res++;
            }
        }
        return res;
    }

//    Best solution
//public int numSpecial(int[][] mat) {
//
//    int specials = 0;
//
//    for (int i = 0; i < mat.length; i++) {
//        int index = checkRow(mat, i);
//        if (index >= 0 && checkColumn(mat, i, index))
//            specials++;
//    }
//
//    return specials;
//}
//
//    private int checkRow(int[][] mat, int i) {
//        int index = -1;
//        for (int j = 0; j < mat[0].length; j++) {
//            if (mat[i][j] == 1) {
//                if (index >= 0)
//                    return -1;
//                else
//                    index = j;
//            }
//        }
//        return index;
//    }
//
//    private boolean checkColumn(int[][] mat, int i, int index) {
//        for (int j = 0; j < mat.length; j++) {
//            if (mat[j][index] == 1 && j != i)
//                return false;
//        }
//        return true;
//    }
}
