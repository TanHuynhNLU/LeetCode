package medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Minesweeper529 {
    public char[][] updateBoard(char[][] board, int[] click) {
        int m = board.length;
        int n = board[0].length;
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }
        boolean[][] visited = new boolean[m][n];
        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(click);
        while (!stack.isEmpty()) {
            int[] position = stack.pop();
            int count = countMine(board, position);
            if (count == 0) {
                board[position[0]][position[1]] = 'B';
                for (int i = Math.max(0, position[0] - 1); i < Math.min(position[0] + 2, board.length); i++) {
                    for (int j = Math.max(0, position[1] - 1); j < Math.min(position[1] + 2, board[0].length); j++) {
                        if (i == position[0] && j == position[1]) continue;
                        if (!visited[position[0]][position[1]]) stack.push(new int[]{i, j});
                    }
                }
            } else {
                board[position[0]][position[1]] = Character.forDigit(count, 10);
            }
            visited[position[0]][position[1]] = true;
        }
        return board;
    }

    public int countMine(char[][] board, int[] position) {
        int count = 0;
        for (int i = Math.max(0, position[0] - 1); i < Math.min(position[0] + 2, board.length); i++) {
            for (int j = Math.max(0, position[1] - 1); j < Math.min(position[1] + 2, board[0].length); j++) {
                if (i == position[0] && j == position[1]) continue;
                if (board[i][j] == 'M') count++;
            }
        }
        return count;
    }

    // Best Solution
//    public char[][] updateBoard(char[][] board, int[] click) {
//        updateBoardRecursive(board, click[0], click[1]);
//        return board;
//    }
//
//    private void updateBoardRecursive(char[][] board, int row, int col) {
//        if(row < 0 || row >= board.length || col < 0 || col >= board[row].length) return;
//
//        if(board[row][col] == 'M') {
//            board[row][col] = 'X';
//            return;
//        }
//        if(board[row][col] != 'E') return;
//
//
//        int adjacentMineCount = countMinesAroundCell(board, row, col);
//
//        if(adjacentMineCount == 0) {
//            board[row][col] = 'B';
//            updateBoardRecursive(board, row - 1, col - 1);
//            updateBoardRecursive(board, row - 1, col);
//            updateBoardRecursive(board, row - 1, col + 1);
//            updateBoardRecursive(board, row, col - 1);
//            updateBoardRecursive(board, row, col + 1);
//            updateBoardRecursive(board, row + 1, col - 1);
//            updateBoardRecursive(board, row + 1, col);
//            updateBoardRecursive(board, row + 1, col + 1);
//            return;
//        }
//
//        board[row][col] = (char) ('0' + adjacentMineCount);
//        return;
//    }
//
//    private int countMinesAroundCell(char[][] board, int row, int col) {
//        int count = 0;
//        for(int i = -1; i <= 1; i++){
//            if(row + i < 0 || row + i >= board.length) continue;
//
//            for(int j = -1; j <= 1; j++) {
//                if((i == 0 && j == 0) || col + j < 0 || col + j >= board[row + i].length) continue;
//
//                if(board[row + i][col + j] == 'M') {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//}

/*
1. If clicked a mine, cross the cell, return;
count mines
2. If count == 0,
    write B into cell
    explore ALL neighbours recursively (including diagonals)
3. else
    write count into cell, stop recursing
*/
}
