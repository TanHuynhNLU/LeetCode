package easy;

public class MakeASquareWithTheSameColor3127 {
    public static boolean canMakeSquare(char[][] grid) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (check(i, j, grid)) return true;
            }
        }
        return false;
    }

    public static boolean check(int row, int col, char[][] grid) {
        int b = 0;
        int w = 0;
        for (int i = row; i < row + 2; i++) {
            for (int j = col; j < col + 2; j++) {
                if (grid[i][j] == 'B') b++;
                else w++;
            }
        }
        return b <= 1 || w <= 1;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'B', 'W', 'B'}, {'W', 'B', 'W'}, {'B', 'W', 'B'}
        };
        canMakeSquare(grid);
    }
}
