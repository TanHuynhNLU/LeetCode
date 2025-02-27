package leetcode;

public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        int pCount = 0;
        int sCount = 0;
        while (sCount < s.length() && pCount < p.length()) {
            char c = s.charAt(sCount);
            if (p.charAt(pCount) == '.') {
                if (pCount + 1 < p.length() &&p.charAt(pCount + 1) != '*') {
                    pCount++;
                    sCount++;
                    continue;
                } else return true;
            }
            if (pCount + 1 < p.length() && p.charAt(pCount + 1) == '*') {
                if (c == p.charAt(pCount)) {
                    if (sCount + 1 < s.length()&&s.charAt(sCount + 1) == p.charAt(pCount)) sCount++;
                    else {
                        pCount += 2;
                        sCount++;
                    }
                } else {
                    sCount++;
                    pCount += 2;
                }
            } else {
                if (c == p.charAt(pCount)) {
                    pCount++;
                    sCount++;
                    continue;
                } else return false;
            }
        }
        if (pCount < p.length() || sCount < s.length()) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "mississippi";
        String p = "mis*is*p*.";
        System.out.println(isMatch(s, p));
    }
}
