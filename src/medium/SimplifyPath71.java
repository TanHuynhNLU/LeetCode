package medium;

import java.util.Stack;

public class SimplifyPath71 {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] split = path.split("/");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("/") || split[i].equals(".") || split[i].isEmpty()) continue;
            if (split[i].equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else
                stack.push(split[i]);
        }
        if (stack.isEmpty()) return "/";
        if (stack.peek().equals("..")) return "/";
        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
            sb.append("/");
            sb.append(s);
        }
        return sb.toString();
    }

    //    Best Solution
//    public String simplifyPath(String path) {
//        String[] spath = new String[path.length()];
//        int top = -1, i = 0, n = path.length();
//        while (i < n) {
//            while (i < n && path.charAt(i) == '/') ++i;
//            int e = i;
//            while (e < n && path.charAt(e) == '.') ++e;
//            if (e > i && ((e == n && e - i == 1) || (e < n && e - i == 1 && path.charAt(e) == '/'))) {
//                i = e;
//                continue;
//            }
//            if (e > i && ((e == n && e - i == 2) || (e < n && e - i == 2 && path.charAt(e) == '/'))) {
//                if (top != -1) --top;
//                i = e;
//                continue;
//            }
//            if (i == n) break;
//            int s = i;
//            while (i < n && path.charAt(i) != '/') ++i;
//            spath[++top] = path.substring(s, i);
//        }
//        StringBuilder sb = new StringBuilder();
//        for (i = 0; i <= top; ++i) {
//            sb.append("/");
//            sb.append(spath[i]);
//        }
//        if (sb.length() == 0) sb.append("/");
//        return sb.toString();
//    }

    public static void main(String[] args) {
        simplifyPath("/../");
    }
}
