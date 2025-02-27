package medium;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses93 {
    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) return res;
        backtrack(s, new ArrayList<>(), 0);
        return res;
    }

    public void backtrack(String s, List<String> list, int start) {
        if (list.size() == 4 && start == s.length()) {
            res.add(String.join(".", list));
            return;
        }
        if (start >= s.length()) return;
        int i = Math.min(3, s.length() - start);
        for (; i > 0; i--) {
            String sub = s.substring(start, start + i);
            if (isValid(sub)) {
                List<String> temp = new ArrayList<>(list);
                temp.add(sub);
                backtrack(s, temp, start + i);
            }
        }
    }

    public boolean isValid(String s) {
        if (s.length() > 1 && s.startsWith("0")) return false;
        if (Integer.parseInt(s) > 255) return false;
        return true;
    }

    //    Popular Solution
//    public List<String> restoreIpAddresses(final String s) {
//        List<String> ans = new ArrayList<>();
//        dfs(s, 0, new ArrayList<>(), ans);
//        return ans;
//    }
//
//    private void dfs(final String s, int start, List<String> path, List<String> ans) {
//        if (path.size() == 4 && start == s.length()) {
//            ans.add(String.join(".", path));
//            return;
//        }
//        if (path.size() == 4 || start == s.length())
//            return;
//
//        for (int length = 1; length <= 3; ++length) {
//            if (start + length > s.length()) // out-of-bounds
//                return;
//            if (length > 1 && s.charAt(start) == '0') // leading '0'
//                return;
//            final String num = s.substring(start, start + length);
//            if (Integer.parseInt(num) > 255)
//                return;
//            path.add(num);
//            dfs(s, start + length, path, ans);
//            path.remove(path.size() - 1);
//        }
//    }
}
