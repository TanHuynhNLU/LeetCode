package medium;

import java.util.Stack;

public class DecodeString394 {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ']') {
                StringBuilder sb = new StringBuilder();
                while (!stack.peek().equals("[")) {
                    sb.append(stack.pop());
                }
                stack.pop();
                String chars = sb.toString();
                sb = new StringBuilder();
                while (!stack.isEmpty() && stack.peek().length() == 1 && Character.isDigit(stack.peek().charAt(0))) {
                    sb.append(stack.pop());
                }
                int num = Integer.parseInt(sb.reverse().toString());
                sb = new StringBuilder();
                for (int i = 0; i < num; i++) {
                    sb.append(chars);
                }
                stack.push(sb.toString());
            } else {
                stack.push(String.valueOf(c));
            }
        }
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }

    // Best solution
//    public String decodeString(String s) {
//        Deque<Integer> countStack = new ArrayDeque<>();
//        Deque<StringBuilder> strStack = new ArrayDeque<>();
//        StringBuilder curr = new StringBuilder();
//        int k = 0;
//
//        for (char c : s.toCharArray()) {
//            if (Character.isDigit(c)) {
//                k = k * 10 + (c - '0');
//            } else if (c == '[') {
//                countStack.push(k);
//                strStack.push(curr);
//                curr = new StringBuilder();
//                k = 0;
//            } else if (c == ']') {
//                StringBuilder decoded = strStack.pop();
//                int times = countStack.pop();
//                while (times-- > 0) decoded.append(curr);
//                curr = decoded;
//            } else {
//                curr.append(c);
//            }
//        }
//        return curr.toString();
//    }
}
