package medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class BattleshipsInABoard419 {
    public int countBattleships(char[][] board) {
        int res = 0;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!visited[i][j] && board[i][j] == 'X') {
                    dfs(board, visited, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    public void dfs(char[][] board, boolean[][] visited, int row, int col) {
        int m = board.length;
        int n = board[0].length;
        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{row, col});
        while (!stack.isEmpty()) {
            int[] position = stack.pop();
            int i = position[0];
            int j = position[1];
            visited[i][j] = true;
            if (i > 0 && !visited[i - 1][j] && board[i - 1][j] == 'X') {
                stack.push(new int[]{i - 1, j});
            }
            if (i < m - 1 && !visited[i + 1][j] && board[i + 1][j] == 'X') {
                stack.push(new int[]{i + 1, j});
            }
            if (j > 0 && !visited[i][j - 1] && board[i][j - 1] == 'X') {
                stack.push(new int[]{i, j - 1});
            }
            if (j < n - 1 && !visited[i][j + 1] && board[i][j + 1] == 'X') {
                stack.push(new int[]{i, j + 1});
            }
        }
    }

    //DFS approach by using recursion
//    public void dfs(int r, int c, int m, int n, char[][] grid) {
//        if (r < 0 || r >= m || c < 0 || c >= n)
//            return;
//        if (grid[r][c] == 'X') {
//            grid[r][c] = '.';
//            dfs(r + 1, c, m, n, grid);
//            dfs(r - 1, c, m, n, grid);
//            dfs(r, c + 1, m, n, grid);
//            dfs(r, c - 1, m, n, grid);
//        }
//    }
}
