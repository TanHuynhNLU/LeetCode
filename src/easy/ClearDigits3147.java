package easy;

import java.util.Stack;

public class ClearDigits3147 {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.pop();
            } else stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
