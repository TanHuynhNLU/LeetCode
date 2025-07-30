package medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class RemoveKDigits402 {
    public static String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (count < k) {
                while (!stack.isEmpty() && stack.peek() > c && count < k) {
                    stack.pop();
                    count++;
                }
            }
            stack.push(c);
        }
        while (!stack.isEmpty() && count < k) {
            stack.pop();
            count++;
        }
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            if (sb.isEmpty() && stack.peekLast() == '0') {
                stack.pollLast();
                continue;
            }
            sb.append(stack.pollLast());
        }
        return sb.isEmpty()?"0": sb.toString();
    }
}
