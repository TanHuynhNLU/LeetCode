package easy;

import java.util.Stack;

public class ValidParentheses20 {
    public static boolean isValid(String s) {
        if (s.length() < 2) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if (stack.size() <= 0) return false;
                if (c == ')' && stack.peek() == '(')
                    stack.pop();
                else if (c == ']' && stack.peek() == '[')
                    stack.pop();
                else if (c == '}' && stack.peek() == '{')
                    stack.pop();
                else return false;
            }
        }
        if (stack.size() > 0) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "{{[]}";
        System.out.println(isValid(s));
    }
}
