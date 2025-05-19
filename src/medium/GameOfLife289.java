package medium;

public class GameOfLife289 {
    public void gameOfLife(int[][] board) {
        int[][] tmp = board.clone();
        for (int i = 0; i < board.length; i++) {
            tmp[i] = board[i].clone();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int count = count(tmp, i, j);
                if (tmp[i][j] == 1) {
                    if (count > 3) board[i][j] = 0;
                    else if (count >= 2) board[i][j] = 1;
                    else board[i][j] = 0;
                } else {
                    if (count == 3) board[i][j] = 1;
                }
            }
        }
    }

    public int count(int[][] board, int row, int col) {
        int count = 0;
        for (int i = Math.max(row - 1, 0); i <= Math.min(row + 1, board.length - 1); i++) {
            for (int j = Math.max(col - 1, 0); j <= Math.min(col + 1, board[0].length - 1); j++) {
                if (i == row && j == col) continue;
                if (board[i][j] == 1) count++;
            }
        }
        return count;
    }
}
