package easy;

public class LongestNiceSubstring1763 {
    public String longestNiceSubstring(String s) {
        for (int i = s.length(); i >= 2; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                String sub = s.substring(j, j + i);
                if (check(sub)) return sub;
            }
        }
        return "";
    }

    public boolean check(String s) {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(chars[i])) upper[chars[i] - 'A'] = true;
            else lower[chars[i] - 'a'] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (upper[i] != lower[i]) return false;
        }
        return true;
    }
//    Best Solution
//    int scLen;
//    long[] scBits;
//    int longestLen = 0;
//    int longestStart = 0;
//
//    public String longestNiceSubstring(String s) {
//        var scLen = s.length();
//        scBits = new long[scLen];
//        for (var i = 0; i < scLen; ++i)
//            scBits[i] = 1L << (s.charAt(i) - '@');
//
//        checkRange(0, scLen);
//
//        return (longestLen == 0) ? "" : s.substring(longestStart, longestStart + longestLen);
//    }
//
//    private void checkRange(int startIdx, int endIdx) {
//        var unmatchedChars = 0L;
//        for (var i = startIdx; i < endIdx; ++i)
//            unmatchedChars |= scBits[i];
//
//        unmatchedChars = (unmatchedChars ^ (unmatchedChars >>> 32)) & 0xFFFFFFFFL;
//        unmatchedChars |= (unmatchedChars << 32);
//
//        if (unmatchedChars == 0) {
//            longestLen = endIdx - startIdx;
//            longestStart = startIdx;
//        } else {
//            var substrStart = startIdx;
//            for (var i = startIdx; i < endIdx; ++i) {
//                if ((scBits[i] & unmatchedChars) != 0) {
//                    if (i - substrStart > longestLen)
//                        checkRange(substrStart, i);
//
//                    substrStart = i + 1;
//                }
//            }
//
//            if (endIdx - substrStart > longestLen)
//                checkRange(substrStart, endIdx);
//        }
//    }
//=============================================================================================
    //    Simple Solution
//    public String longestNiceSubstring(String s) {
//        if (s.length() < 2) return "";
//        char[] arr = s.toCharArray();
//        Set<Character> set = new HashSet<>();
//        for (char c : arr) set.add(c);
//        for (int i = 0; i < arr.length; i++) {
//            char c = arr[i];
//            if (set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c))) continue;
//            String sub1 = longestNiceSubstring(s.substring(0, i));
//            String sub2 = longestNiceSubstring(s.substring(i + 1));
//            return sub1.length() >= sub2.length() ? sub1 : sub2;
//        }
//        return s;
//    }
}
