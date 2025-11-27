package medium;

import java.util.Arrays;

public class LongestUncommonSubsequenceII522 {
    // Solution
//    public int findLUSlength(String[] strs) {
//        Arrays.sort(strs, (a, b) -> b.length() - a.length());
//
//        for (int i = 0; i < strs.length; i++) {
//            String s = strs[i];
//            boolean isUncommon = true;
//
//            for (int j = 0; j < strs.length; j++) {
//                if (i == j) continue;
//                if (isSubsequence(s, strs[j])) {
//                    isUncommon = false;
//                    break;
//                }
//            }
//
//            if (isUncommon) {
//                return s.length();
//            }
//        }
//
//        return -1;
//    }
//
//    private boolean isSubsequence(String s, String t) {
//        int i = 0, j = 0;
//
//        while (i < s.length() && j < t.length()) {
//            if (s.charAt(i) == t.charAt(j)) {
//                i++;
//            }
//            j++;
//        }
//
//        return i == s.length();
//    }
}
