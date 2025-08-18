package medium;

import java.util.ArrayList;
import java.util.List;

public class LongestRepeatingCharacterReplacement424 {
    public int characterReplacement(String s, int k) {
        int max = 0;
        boolean[] chars = new boolean[26];
        for (char c : s.toCharArray()) {
            chars[c - 'A'] = true;
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            if (!chars[c - 'A']) continue;
            max = Math.max(max, findMaxLength(s, c, k));
        }
        return max;
    }

    public int findMaxLength(String s, char currChar, int k) {
        int max = 0;
        int count = 0;
        int i = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) != currChar) {
                if (i < k) {
                    i++;
                } else {
                    while (s.charAt(left) == currChar) {
                        left++;
                        count--;
                    }
                    count--;
                    left++;
                }
            }
            count++;
            max = Math.max(count, max);
        }
        return max;
    }

//    Best solution
//    static {
//        for (int i = 0; i < 500; i++) {
//            characterReplacement("", 1);   //JIT warmup ?? heh, it works :D
//        }
//    }
//
//    public static int characterReplacement(String s, int k) {
//        int res = 0;
//        int maxf = 0;
//        int l = 0;
//        int[] count = new int[26];
//        int n = s.length();
//        for (int r = 0; r < n; r++) {
//            char c = s.charAt(r);
//            count[c - 'A']++;
//            maxf = Math.max(maxf, count[c - 'A']);
//            if (r - l + 1 - maxf <= k) {
//                res = r - l + 1;
//            } else {
//                count[s.charAt(l) - 'A']--;
//                l++;
//            }
//        }
//        return res;
//    }
}
