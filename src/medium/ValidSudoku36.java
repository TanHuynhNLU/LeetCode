package medium;

public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!checkRow(board, i) || !checkCol(board, i)) return false;
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!checkSquare(board, i, j)) return false;
            }
        }
        return true;
    }

    public boolean checkRow(char[][] board, int row) {
        int[] count = new int[10];
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == '.') continue;
            int num = board[row][i] - '0';
            count[num]++;
            if (count[num] == 2) return false;
        }
        return true;
    }

    public boolean checkCol(char[][] board, int col) {
        int[] count = new int[10];
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == '.') continue;
            int num = board[i][col] - '0';
            count[num]++;
            if (count[num] == 2) return false;
        }
        return true;
    }

    public boolean checkSquare(char[][] board, int row, int col) {
        int[] count = new int[10];
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (board[i][j] == '.') continue;
                int num = board[i][j] - '0';
                count[num]++;
                if (count[num] == 2) return false;
            }
        }
        return true;
    }
}
