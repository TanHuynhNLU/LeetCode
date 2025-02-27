package easy;

public class AvailableCapturesForRook999 {
    public int numRookCaptures(char[][] board) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != 'R') continue;
                return availableCaptures(board,i,j);
            }
        }
        return 0;
    }

    public int availableCaptures(char[][] board, int row, int col) {
        int count = 0;
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'B') break;
            if (board[i][col] == 'p') {
                count++;
                break;
            }
        }
        for (int i = row + 1; i <8; i++) {
            if (board[i][col] == 'B') break;
            if (board[i][col] == 'p') {
                count++;
                break;
            }
        }
        for (int i = col - 1; i >= 0; i--) {
            if (board[row][i] == 'B') break;
            if (board[row][i] == 'p') {
                count++;
                break;
            }
        }
        for (int i = col + 1; i < 8; i++) {
            if (board[row][i] == 'B') break;
            if (board[row][i] == 'p') {
                count++;
                break;
            }
        }
        return count;
    }
}
