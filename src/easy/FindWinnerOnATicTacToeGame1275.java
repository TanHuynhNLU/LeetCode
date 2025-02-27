package easy;

public class FindWinnerOnATicTacToeGame1275 {
    public String tictactoe(int[][] moves) {
        String[][] matrix = new String[3][3];
        for (int i = 0; i < moves.length; i += 2) {
            matrix[moves[i][0]][moves[i][1]] = "A";
        }
        for (int i = 1; i < moves.length; i += 2) {
            matrix[moves[i][0]][moves[i][1]] = "B";
        }
//        check row
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == null) continue;
            if (matrix[i][0].equals(matrix[i][1]) && matrix[i][1].equals(matrix[i][2])) return matrix[i][0];
        }
//        check col
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[0][i] == null) continue;
            if (matrix[0][i].equals(matrix[1][i]) && matrix[1][i].equals(matrix[2][i])) return matrix[0][i];
        }
//        check cross
        if (matrix[0][0] != null && matrix[1][1] != null && matrix[2][2] != null)
            if (matrix[0][0].equals(matrix[1][1]) && matrix[1][1].equals(matrix[2][2])) return matrix[0][0];
        if (matrix[0][2] != null && matrix[1][1] != null && matrix[2][0] != null)
            if (matrix[0][2].equals(matrix[1][1]) && matrix[1][1].equals(matrix[2][0])) return matrix[0][2];
        if (moves.length == 9)
            return "Draw";
        else return "Pending";
//        Best Solution
//        int[] aRow = new int[3], aCol = new int[3], bRow = new int[3], bCol = new int[3];
//        int  aD1 = 0, aD2 = 0, bD1 = 0, bD2 = 0;
//        for (int i = 0; i < moves.length; ++i) {
//            int r = moves[i][0], c = moves[i][1];
//            if (i % 2 == 1) {
//                if (++bRow[r] == 3 || ++bCol[c] == 3 || r == c && ++bD1 == 3 || r + c == 2 && ++bD2 == 3) return "B";
//            }else {
//                if (++aRow[r] == 3 || ++aCol[c] == 3 || r == c && ++aD1 == 3 || r + c == 2 && ++aD2 == 3) return "A";
//            }
//        }
//        return moves.length == 9 ? "Draw" : "Pending";
    }
}
