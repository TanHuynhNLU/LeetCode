package medium;

import java.util.Stack;

public class LongestAbsoluteFilePath388 {
    public int lengthLongestPath(String input) {
        String[] split = input.split("\n");
        int max = 0;
        String result = "";
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(split[0], 0));
        if (split[0].contains(".")) result = split[0];
        for (int i = 1; i < split.length; i++) {
            int tabs = (split[i].lastIndexOf("\t")) + 1;

            if (tabs == 0 && split[i].contains(".")) {
                if (result.length() < split[i].length())
                    result = split[i];
                continue;
            }
            while (!stack.isEmpty() && stack.peek().tabs >= tabs) {
                stack.pop();
            }
            Pair prevPair = null;
            Pair newPair = null;
            if (!stack.isEmpty()) {
                prevPair = stack.peek();
                newPair = new Pair(prevPair.path + "/" + split[i].substring(tabs), tabs);
            } else {
                newPair = new Pair(split[i], 0);
            }
            stack.push(newPair);
            if (newPair.path.length() > max && split[i].contains(".")) {
                max = newPair.path.length();
                result = stack.peek().path;
            }
        }
        return result.length();
    }

    private class Pair {
        String path;
        int tabs;

        public Pair(String path, int tabs) {
            this.path = path;
            this.tabs = tabs;
        }
    }

    //Best Solution
//    public int lengthLongestPath(String input) {
//        HashMap<Integer, Integer> map = new HashMap<>(); // to store level and length of character
//        int max_len = 0;
//        for (String dir : input.split("\n")) {
//            int level = 0;
//            while (level < dir.length() && dir.charAt(level) == '\t') {
//                level++;
//            }
//            int path_len = level == 0 ? dir.length() : map.get(level - 1) + 1 + (dir.length() - level);
//            if (dir.indexOf('.') >= 0) {
//                max_len = Math.max(max_len, path_len);
//            } else {
//                map.put(level, path_len);
//            }
//        }
//        return max_len;
//    }
}
