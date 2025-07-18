package medium;

public class LongestSubstringWithAtLeastKRepeatingCharacters395 {
    public static int longestSubstring(String s, int k) {
        if (k == 1) return s.length();
        for (int i = s.length(); i >= k; i--) {
            int[] counters = new int[26];
            for (int j = 0; j <= s.length() - i; j++) {
                boolean isValid = true;
                if (j == 0) {
                    for (char c : s.substring(j, j + i).toCharArray()) {
                        counters[c - 'a']++;
                    }
                    for (int h = 0; h < 26; h++) {
                        if (counters[h] != 0 && counters[h] < k) {
                            isValid = false;
                            break;
                        }
                    }
                } else {
                    int first = s.charAt(j - 1) - 'a';
                    int last = s.charAt(i + j - 1) - 'a';
                    counters[first]--;
                    counters[last]++;
                    if ((counters[first] != 0 && counters[first] < k) || (counters[last] != 0 && counters[last] < k)) {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) return i;
            }
        }
        return 0;
    }

    // Best Solution: Divide and Conquer
//    public int longestSubstring(String s, int k) {
//        return helper(s, k, 0, s.length());
//    }
//
//    private int helper(String s, int k, int start, int end) {
//        if (end - start < k)
//            return 0;
//
//        int[] freq = new int[26];
//        for (int i = start; i < end; i++) {
//            freq[s.charAt(i) - 'a']++;
//        }
//
//        for (int mid = start; mid < end; mid++) {
//            if (freq[s.charAt(mid) - 'a'] < k) {
//                int midNext = mid + 1;
//                while (midNext < end && freq[s.charAt(midNext) - 'a'] < k) {
//                    midNext++;
//                }
//                return Math.max(helper(s, k, start, mid), helper(s, k, midNext, end));
//            }
//        }
//
//        return end - start; // All characters occur >= k times
//    }
}
