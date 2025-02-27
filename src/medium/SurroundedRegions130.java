package medium;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class SurroundedRegions130 {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] saved = new boolean[m][n];
        boolean[][] visited = new boolean[m][n];
        //Check first row & last row
        for (int i = 0; i < n; i++) {
            if (board[0][i] == 'O')
                BFS(board, 0, i, saved, visited);
            if (board[m - 1][i] == 'O') {
                BFS(board, m - 1, i, saved, visited);
            }
        }
        // Check first col & last col
        for (int i = 1; i < m - 1; i++) {
            if (board[i][0] == 'O')
                BFS(board, i, 0, saved, visited);
            if (board[i][n - 1] == 'O') {
                BFS(board, i, n - 1, saved, visited);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && !saved[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void BFS(char[][] board, int i, int j, boolean[][] visited, boolean[][] saved) {
        int m = board.length;
        int n = board[0].length;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(i, j));
        visited[i][j] = true;
        saved[i][j] = true;
        while (!queue.isEmpty()) {
            Pair point = queue.poll();
            int row = point.x;
            int col = point.y;
            if (row - 1 >= 0 && !visited[row - 1][col] && board[row - 1][col] == 'O') {
                visited[row - 1][col] = true;
                saved[row - 1][col] = true;
                queue.add(new Pair(row - 1, col));
            }
            if (row + 1 < m && !visited[row + 1][col] && board[row + 1][col] == 'O') {
                visited[row + 1][col] = true;
                saved[row + 1][col] = true;
                queue.add(new Pair(row + 1, col));
            }
            if (col - 1 >= 0 && !visited[row][col - 1] && board[row][col - 1] == 'O') {
                visited[row][col - 1] = true;
                saved[row][col - 1] = true;
                queue.add(new Pair(row, col - 1));
            }
            if (col + 1 < n && !visited[row][col + 1] && board[row][col + 1] == 'O') {
                visited[row][col + 1] = true;
                saved[row][col + 1] = true;
                queue.add(new Pair(row, col + 1));
            }
        }
    }

    private class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    //    Best Solution
//    public void solve(char[][] board) {
//        if (board == null || board.length == 1 || board[0].length == 1) {
//            return;
//        }
//
//        int m = board.length;
//        int n = board[0].length;
//
//        char[][] out = new char[m][n];
//        for (char[] row : out) {
//            Arrays.fill(row, 'X');
//        }
//
//        for (int j = 0; j < board[0].length; j++) {
//            if (board[0][j] == 'O') {
//                dfs(board, 0, j, out);
//            }
//        }
//
//        for (int j = 0; j < board[0].length; j++) {
//            if (board[m - 1][j] == 'O') {
//                dfs(board, m - 1, j, out);
//            }
//        }
//
//        for (int i = 0; i < board.length; i++) {
//            if (board[i][0] == 'O') {
//                dfs(board, i, 0, out);
//            }
//        }
//
//        for (int i = 0; i < board.length; i++) {
//            if (board[i][n - 1] == 'O') {
//                dfs(board, i, n - 1, out);
//            }
//        }
//
//        for (int i = 0; i < board.length; i++) {
//            board[i] = out[i];
//        }
//    }
//
//    public void dfs(char[][] board, int i, int j, char[][] out) {
//        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
//            return;
//        }
//
//        out[i][j] = 'O';
//        board[i][j] = '1';
//        dfs(board, i + 1, j, out);
//        dfs(board, i - 1, j, out);
//        dfs(board, i, j + 1, out);
//        dfs(board, i, j - 1, out);
//    }
}
