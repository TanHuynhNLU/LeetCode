package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class WorldSearch79 {
    boolean isExist = false;

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] visited = new boolean[board.length][board[0].length];
                    visited[i][j] = true;
                    backtrack(board, 1, i, j, visited, word);
                    if (isExist) return true;
                }
            }
        }
        return false;
    }

    public void backtrack(char[][] board, int count, int row, int col, boolean[][] visited, String word) {
        if (count == word.length()) {
            isExist = true;
            return;
        }

        if (row > 0 && board[row - 1][col] == word.charAt(count) && !visited[row - 1][col]) {
            visited[row - 1][col] = true;
            backtrack(board, count + 1, row - 1, col, visited, word);
            visited[row - 1][col] = false;
        }
        if (row < board.length - 1 && board[row + 1][col] == word.charAt(count) && !visited[row + 1][col]) {
            visited[row + 1][col] = true;
            backtrack(board, count + 1, row + 1, col, visited, word);
            visited[row + 1][col] = false;
        }
        if (col > 0 && board[row][col - 1] == word.charAt(count) && !visited[row][col - 1]) {
            visited[row][col - 1] = true;
            backtrack(board, count + 1, row, col - 1, visited, word);
            visited[row][col - 1] = false;
        }
        if (col < board[0].length - 1 && board[row][col + 1] == word.charAt(count) && !visited[row][col + 1]) {
            visited[row][col + 1] = true;
            backtrack(board, count + 1, row, col + 1, visited, word);
            visited[row][col + 1] = false;
        }
    }
//
//    private static final int[] dirs = {0, -1, 0, 1, 0};
//
//    public boolean exist(char[][] board, String word) {
//        int m = board.length;
//        int n = board[0].length;
//
//        if (m * n < word.length()) return false;
//
//        int[] boardf = new int[128];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                boardf[board[i][j]]++;
//            }
//        }
//
//        char[] wrd = word.toCharArray();
//
//        for (char ch : wrd) {
//            if (--boardf[ch] < 0) {
//                return false;
//            }
//        }
//
//        if (boardf[wrd[0]] > boardf[wrd[wrd.length - 1]]) {
//            reverse(wrd);
//        }
//
//        for (int i = 0; i < m; ++i) {
//            for (int j = 0; j < n; ++j) {
//                if (wrd[0] == board[i][j] && found(board, i, j, wrd, new boolean[m][n], 0)) {
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }
//
//    private void reverse(char[] word) {
//        int n = word.length;
//
//        for (int i = 0; i < n / 2; ++i) {
//            char temp = word[i];
//            word[i] = word[n - i - 1];
//            word[n - i - 1] = temp;
//        }
//    }
//
//    private boolean found(char[][] board,
//                          int row,
//                          int col,
//                          char[] word,
//                          boolean[][] visited,
//                          int index) {
//        if (index == word.length) return true;
//
//        if (row < 0 || col < 0 || row == board.length || col == board[0].length
//                || board[row][col] != word[index] || visited[row][col]
//        ) {
//            return false;
//        }
//
//        visited[row][col] = true;
//
//        for (int i = 0; i < 4; ++i) {
//            if (found(board, row + dirs[i], col + dirs[i + 1], word, visited, index + 1)) {
//                return true;
//            }
//        }
//
//        visited[row][col] = false;
//
//        return false;
//    }
}


