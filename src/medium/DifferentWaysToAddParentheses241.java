package medium;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses241 {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        if (expression.length() <= 2) {
            res.add(Integer.parseInt(expression));
            return res;
        }

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) continue;
            List<Integer> leftResult = diffWaysToCompute(expression.substring(0, i));
            List<Integer> rightResult = diffWaysToCompute(expression.substring(i + 1));

            for (int left : leftResult) {
                for (int right : rightResult) {
                    int calc = 0;
                    switch (c) {
                        case '+':
                            calc = left + right;
                            break;
                        case '-':
                            calc = left - right;
                            break;
                        case '*':
                            calc = left * right;
                            break;
                    }
                    res.add(calc);
                }
            }
        }
        return res;
    }

    //Memoization|Best solution
//    public List<Integer> diffWaysToCompute(String expression) {
//        // Initialize memoization array to store results of subproblems
//        List<Integer>[][] memo =
//                new ArrayList[expression.length()][expression.length()];
//        // Solve for the entire expression
//        return computeResults(expression, memo, 0, expression.length() - 1);
//    }
//
//    private List<Integer> computeResults(
//            String expression,
//            List<Integer>[][] memo,
//            int start,
//            int end
//    ) {
//        // If result is already memoized, return it
//        if (memo[start][end] != null) {
//            return memo[start][end];
//        }
//
//        List<Integer> results = new ArrayList<>();
//
//        // Base case: single digit
//        if (start == end) {
//            results.add(expression.charAt(start) - '0');
//            return results;
//        }
//
//        // Base case: two-digit number
//        if (end - start == 1 && Character.isDigit(expression.charAt(start))) {
//            int tens = expression.charAt(start) - '0';
//            int ones = expression.charAt(end) - '0';
//            results.add(10 * tens + ones);
//            return results;
//        }
//
//        // Recursive case: split the expression at each operator
//        for (int i = start; i <= end; i++) {
//            char currentChar = expression.charAt(i);
//            if (Character.isDigit(currentChar)) {
//                continue;
//            }
//
//            List<Integer> leftResults = computeResults(
//                    expression,
//                    memo,
//                    start,
//                    i - 1
//            );
//            List<Integer> rightResults = computeResults(
//                    expression,
//                    memo,
//                    i + 1,
//                    end
//            );
//
//            // Combine results from left and right subexpressions
//            for (int leftValue : leftResults) {
//                for (int rightValue : rightResults) {
//                    switch (currentChar) {
//                        case '+':
//                            results.add(leftValue + rightValue);
//                            break;
//                        case '-':
//                            results.add(leftValue - rightValue);
//                            break;
//                        case '*':
//                            results.add(leftValue * rightValue);
//                            break;
//                    }
//                }
//            }
//        }
//
//        // Memoize the result for this subproblem
//        memo[start][end] = results;
//
//        return results;
//    }
}
