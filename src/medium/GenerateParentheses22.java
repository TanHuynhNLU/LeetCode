package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses22 {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backTracking(n, 0, 0, new StringBuilder());
        return res;
    }

    public void backTracking(int n, int numL, int numR, StringBuilder sb) {
        if (numL == n && numR == n) {
            res.add(sb.toString());
        } else {
            if (numL < n) {
                StringBuilder tmp = new StringBuilder(sb.toString());
                tmp.append("(");
                backTracking(n, numL + 1, numR, tmp);
            }
            if (numR < numL) {
                StringBuilder tmp = new StringBuilder(sb.toString());
                tmp.append(")");
                backTracking(n, numL, numR + 1, tmp);
            }
        }
    }
}
