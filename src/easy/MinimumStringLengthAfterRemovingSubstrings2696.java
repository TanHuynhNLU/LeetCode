package easy;

import java.util.Stack;

public class MinimumStringLengthAfterRemovingSubstrings2696 {
    public static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && chars[i] == 'B' && stack.peek() == 'A') {
                stack.pop();
                continue;
            }
            if (!stack.isEmpty() && chars[i] == 'D' && stack.peek() == 'C') {
                stack.pop();
                continue;
            }
            stack.push(chars[i]);
        }
        return stack.size();
    }

    //    Best Solution
//    public int minLength(String s) {
//        if (s.length() == 1)
//            return 1;
//
//        int[] ids = new int[s.length() + 1];
//        ids[0] = -1;
//        int del = 0, j = 0, i = 0, id = 0;
//
//        while (++i < s.length()) {
//            if (s.charAt(i) == 'B' && s.charAt(j) == 'A'
//                    || s.charAt(i) == 'D' && s.charAt(j) == 'C') {
//                del += 2;
//                id = ids[j];
//                if (id == -1) {
//                    ids[i] = -1;
//                    j = i + 1;
//                    i++;
//                } else if (id == 0) {
//                    j--;
//                } else {
//                    j = id - 1;
//                }
//            } else if (j == i - 1) {
//                j++;
//            } else {
//                ids[i] = j + 1;
//                j = i;
//            }
//        }
//
//        return s.length() - del;
//    }

    public static void main(String[] args) {
        minLength("ACBBD");
    }
}
