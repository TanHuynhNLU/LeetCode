package medium;

import java.util.Stack;

public class EvaluateReversePolishNotation150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(helper(s, a, b));
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    public int helper(String operate, int a, int b) {
        switch (operate) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }
        return 0;
    }

    //    Best Solution
//    int i;
//
//    public int evalRPN(String[] tokens) {
//        i = tokens.length;
//        return eval(tokens);
//    }
//
//    public int eval(String[] tokens) {
//        String currentString = tokens[--i];
//        int k = 0, sign = 1, num = 0;
//        char s = currentString.charAt(0);
//        if (currentString.length() == 1) {
//            switch (s) {
//                case '+':
//                    return eval(tokens) + eval(tokens);
//                case '-':
//                    return -eval(tokens) + eval(tokens);
//                case '*':
//                    return eval(tokens) * eval(tokens);
//                case '/':
//                    int second = eval(tokens);
//                    int first = eval(tokens);
//                    return first / second;
//                default:
//                    return s - '0';
//            }
//        } else {
//            if (s == '-') {
//                sign = -1;
//                s = currentString.charAt(++k);
//            }
//            while (k < currentString.length()) {
//                s = currentString.charAt(k++);
//                num = num * 10 + s - '0';
//            }
//            return num * sign;
//        }
//    }
}
