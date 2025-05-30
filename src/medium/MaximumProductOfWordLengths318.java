package medium;

public class MaximumProductOfWordLengths318 {
    public static int maxProduct(String[] words) {
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!isShareCommon(words[i], words[j])) {
                    max = Math.max(words[i].length() * words[j].length(), max);
                }
            }
        }
        return max;
    }

    public static boolean isShareCommon(String s1, String s2) {
        boolean[] chars = new boolean[26];
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            chars[c - 'a'] = true;
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (chars[c - 'a']) return true;
        }
        return false;
    }

    // Best Solution
//    static {
//        for (int i = 0; i < 200; i++) {
//            maxProduct(new String[]{"a"});
//        }
//    }
//
//    public static int maxProduct(String[] words) {
//        int n = words.length;
//        int[] bitMap = new int[n];
//        int[] wordLen = new int[n];
//        for (int i = 0; i < n; i++) {
//            int bits = 0;
//            char[] cs = words[i].toCharArray();
//            for (char c : cs) {
//                bits |= 1 << (c - 'a');
//            }
//            bitMap[i] = bits;
//            wordLen[i] = cs.length;
//        }
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if ((bitMap[i] & bitMap[j]) == 0) {
//                    max = Math.max(max, wordLen[i] * wordLen[j]);
//                }
//            }
//        }
//        return max;
//    }
}
