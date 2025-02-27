package easy;

import java.util.List;

public class SnakeInMatrix3248 {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;
        for (String command : commands) {
            switch (command) {
                case "UP":
                    i--;
                    break;
                case "DOWN":
                    i++;
                    break;
                case "LEFT":
                    j--;
                    break;
                case "RIGHT":
                    j++;
                    break;
            }
        }
        return i * n + j;
    }
}
