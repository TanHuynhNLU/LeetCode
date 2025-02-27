package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PalindromePartitioning131 {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtrack(new ArrayList<>(), s, 0);
        return res;
    }

    public void backtrack(List<String> list, String s, int start) {
        if (start >= s.length()) {
            List<String> newList = new ArrayList<>(list);
            res.add(newList);
            return;
        }
        for (int i = 1; i <= s.length() - start; i++) {
            String sub = s.substring(start, start + i);
            if (checkPalindrome(sub)) {
                list.add(sub);
                backtrack(list, s, start + i);
                list.remove(list.size() - 1);
            }
        }
    }

    public boolean checkPalindrome(String s) {
        if (s.length() == 1) return true;
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

//    public List<List<String>> partition(String s) {
//
//        return new java.util.AbstractList<List<String>>() {
//            List<List<String>> result;
//
//            public int size() {
//                if (result == null) {
//                    init();
//                }
//                return result.size();
//            }
//
//            public List<String> get(int index) {
//                return result.get(index);
//            }
//
//            public void init() {
//                result = new ArrayList<>();
//                backtrack(s, result, new ArrayList<>(), 0);
//            }
//        };
//    }
//
//    public void backtrack(String s, List<List<String>> ans, List<String> part, int st) {
//        if (st == s.length()) {
//            ans.add(new ArrayList<>(part));
//            return;
//        }
//
//        for (int end = st + 1; end <= s.length(); end++) {
//            if (isPalindrome(s, st, end - 1)) {
//                part.add(s.substring(st, end));
//                backtrack(s, ans, part, end);
//                part.remove(part.size() - 1);
//            }
//        }
//    }
//
//    public boolean isPalindrome(String s, int st, int end) {
//        while (st < end) {
//            if (s.charAt(st++) != s.charAt(end--)) return false;
//        }
//        return true;
//    }
}
