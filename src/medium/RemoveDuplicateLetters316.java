package medium;

import java.util.Stack;

public class RemoveDuplicateLetters316 {
//    public String removeDuplicateLetters(String s) {
//        boolean[] visited = new boolean[26];
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (visited[c - 'a']) {
//                continue;
//            }
//            while (!stack.isEmpty() && c < stack.peek() && i < s.lastIndexOf(stack.peek())) {
//                visited[stack.pop() - 'a'] = false;
//            }
//            stack.push(c);
//            visited[c - 'a'] = true;
//        }
//        StringBuilder sb = new StringBuilder();
//        while (!stack.isEmpty()) {
//            sb.append(stack.pop());
//        }
//        return sb.reverse().toString();
//    }
}
