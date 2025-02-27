package easy;

public class MaximumLengthSubstringWithTwoOccurrences3090 {
    public static int maximumLengthSubstring(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] count = new int[26];
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                count[c - 'a']++;
                if (count[c - 'a'] > 2) {
                    res = Math.max(res, j - i);
                    count = new int[26];
                    break;
                }
                if (j == s.length() - 1) res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }

    //    Best Solution
//    public int maximumLengthSubstring(String s) {
//        int count = 0;
//        int[] freq = new int[26];
//        int left = 0, right;
//        for (right = 0; right < s.length(); right++) {
//            freq[s.charAt(right) - 'a']++;
//            while (freq[s.charAt(right) - 'a'] > 2) {
//                freq[s.charAt(left) - 'a']--;
//                left++;
//            }
//            count = Math.max(count, right - left + 1);
//        }
//        return count;
//    }

    public static void main(String[] args) {
        maximumLengthSubstring("bcbbbcba");
    }
}
