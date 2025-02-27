package easy;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing1496 {
    public static boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String> set = new HashSet<>();
        set.add("0,0");
        for (char c : path.toCharArray()) {
            StringBuilder sb = new StringBuilder();
            switch (c) {
                case 'N':
                    y++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'S':
                    y--;
                    break;
            }
            sb.append(x).append(',').append(y);
            if (set.contains(sb.toString())) return true;
            else set.add(sb.toString());
        }
        return false;
    }

    public static void main(String[] args) {
        isPathCrossing("NESWW");
    }
}
