package medium;

public class PermutationInString567 {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int[] counts = new int[26];
        for (char c : s1.toCharArray()) {
            counts[c - 'a']++;
        }
        for (int i = 0; i < s2.length() - l1; i++) {
            int[] clone = counts.clone();
            if (check(clone, s2.substring(i, i + l1))) return true;
        }
        return false;
    }

    public boolean check(int[] count, String s) {
        for (char c : s.toCharArray()) {
            if (count[c - 'a'] > 0) count[c - 'a']--;
            else return false;
        }
        return true;
    }

    // Best Solution
//    public boolean checkInclusion(String s1, String s2) {
//        int k = s1.length();
//        int l = 0;
//
//        char[] s1Arr = s1.toCharArray();
//        Arrays.sort(s1Arr);
//        String sortedS1 = new String(s1Arr);
//
//        for (int r = 0; r < s2.length(); r++) {
//            if (r - l + 1 == k) {
//                String subString = s2.substring(l, r + 1);
//                char[] sort = subString.toCharArray();
//                Arrays.sort(sort);
//                String compare = new String(sort);
//                if (compare.equals(sortedS1))
//                    return true;
//                else l++;
//            }
//        }
//        return false;
//    }
}
