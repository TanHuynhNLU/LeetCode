package medium;

public class PalindromicSubstrings647 {
    public int countSubstrings(String s) {
        int res = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {
            if (chars[i + 1] == chars[i]) {
                int start = i;
                int end = i + 1;
                res++;
                while (start - 1 > 0 && end + 1 < s.length() && chars[start - 1] == chars[end + 1]) {
                    res++;
                    start--;
                    end++;
                }
            }
            if (i > 0 && chars[i - 1] == chars[i + 1]) {
                int start = i;
                int end = i;
                while (start - 1 > 0 && end + 1 < s.length() && chars[start - 1] == chars[end + 1]) {
                    res++;
                    start--;
                    end++;
                }
            }
        }
        return res;
    }
}
