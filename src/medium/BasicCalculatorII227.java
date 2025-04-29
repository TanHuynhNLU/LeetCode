package medium;

import java.util.Stack;

public class BasicCalculatorII227 {
    public static int calculate(String s) {
        s = s.trim();
        int start = 0;
        Stack<Integer> nums = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            while (i < s.length() && (s.charAt(i) == ' ' || Character.isDigit(s.charAt(i)))) i++;
            int num = Integer.parseInt(s.substring(start, i).trim());
            if (!operators.isEmpty() && operators.peek() == '*') {
                int prevNum = nums.pop();
                nums.push(prevNum * num);
                operators.pop();
                start = i + 1;
                if (i < s.length()) operators.push(s.charAt(i));
                continue;
            }
            if (!operators.isEmpty() && operators.peek() == '/') {
                int prevNum = nums.pop();
                nums.push(prevNum / num);
                operators.pop();
                start = i + 1;
                if (i < s.length()) operators.push(s.charAt(i));
                continue;
            }
            if (i < s.length()) operators.push(s.charAt(i));
            nums.push(num);
            start = i + 1;
        }
        int res = 0;
        while (!operators.isEmpty()) {
            char operator = operators.pop();
            if (operator == '+') {
                res += nums.pop();
            } else if (operator == '-') {
                res -= nums.pop();
            }
        }
        res += nums.pop();
        return res;
    }

    //Best solution
    //a character could be + - * / number
    //digit: add to token
    //when there is a sign, we need to store current result into the stack
    //update to current sign
    //depending on previous sign
    //+ or -: directly push current token into stack
    //* or /: pop out the last number, push back top * or / token
//    public int calculate(String s) {
//        int len = s.length();
//        if (len == 299999)
//            return 2;
//        if (len == 209079)
//            return 199;
//        if (len == 0)
//            return 0;
//        // s = s.replaceAll(" ", "");
//        Deque<Integer> results = new ArrayDeque<>();
//        char sign = '+';
//        int token = 0, n = s.length();
//
//        for (int i = 0; i < n; i++) {
//            char ch = s.charAt(i);
//            if (ch == ' ' && i != n - 1) {
//                continue;
//            }
//
//            if ('0' <= ch && ch <= '9') {
//                token = token * 10 + ch - '0';
//                if (i != n - 1) {
//                    continue;
//                }
//            }
//
//            if (sign == '+') {
//                results.push(token);
//            } else if (sign == '-') {
//                results.push(-token);
//            } else if (sign == '*') {
//                results.push(results.pop() * token);
//            } else { // sign is /
//                results.push(results.pop() / token);
//            }
//
//            token = 0;
//            sign = ch;
//        }
//
//        int res = 0;
//        while (results.size() > 0) {
//            res += results.pop();
//        }
//        return res;
//    }
}
