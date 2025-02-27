package leetcode;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int n = 2 * s.length() + 3;
        char[] sChars = new char[n];
        sChars[0] = '@';
        sChars[n - 1] = '$';

        int t = 1;
        for (char c : s.toCharArray()) {
            sChars[t++] = '#';
            sChars[t++] = c;
        }
        sChars[t] = '#';

        int maxLen = 0;
        int start = 0;
        int center = 0;
        int maxRight = 0;
        int[] p = new int[n];
        for (int i = 1; i < n - 1; i++) {
            if (i < maxRight) {
                p[i] = Math.min(maxRight - i, p[2 * center - i]);
            }

            while (sChars[i + p[i] + 1] == sChars[i - p[i] - 1]) {
                p[i]++;
            }

            if (i + p[i] > maxRight) {
                center = i;
                maxRight = i + p[i];
            }

            if (p[i] > maxLen) {
                start = (i - p[i] - 1) / 2;
                maxLen = p[i];
            }
        }
        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babab"));
    }
}
