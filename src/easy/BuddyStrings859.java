package easy;

public class BuddyStrings859 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        int[] chars = new int[26];
        boolean isDuplicate = false;
        int count = 0;
        int fIndex = -1;
        int sIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (!isDuplicate) {
                if (++chars[s.charAt(i) - 'a'] > 1) isDuplicate = true;
            }
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
            } else continue;
            if (count > 2) return false;
            if (count == 1) fIndex = i;
            if (count == 2) sIndex = i;
        }
        if (count == 0) {
            if (isDuplicate)
                return true;
            else return false;
        }
        if (count == 1) return false;
        return s.charAt(fIndex) == goal.charAt(sIndex) && s.charAt(sIndex) == goal.charAt(fIndex);
    }
//    Best solution
//      if (s.length() != goal.length())
//              return false;
//
//    char[] sc = s.toCharArray();
//    char[] gc = goal.toCharArray();
//
//        if (s.equals(goal)) {
//        int[] mp = new int[26];
//        for (char c : sc)
//            if (++mp[c - 'a'] > 1)
//                return true;
//    }
//
//    int[] track = new int[]{-1, -1};
//        for (int i = 0, j = 0; i < sc.length; ++i)
//            if (sc[i] != gc[i]) {
//        if (j < 2)
//            track[j++] = i;
//        else
//            return false;
//    }
//
//        return track[1] != -1 ? sc[track[0]] == gc[track[1]] && sc[track[1]] == gc[track[0]] : false;
}
