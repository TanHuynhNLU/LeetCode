package medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int l = p.length();
        int[] countP = new int[26];
        for (char c : p.toCharArray()) {
            countP[c - 'a']++;
        }
        boolean prev = false;
        for (int i = 0; i <= s.length() - l; i++) {
            if (prev && i > 0 && i < s.length() - l && s.charAt(i + l) == s.charAt(i - 1)) {
                res.add(i);
                continue;
            }
            if (isAnagrams(s.substring(i, i + l), countP)) {
                res.add(i);
                prev = true;
            } else {
                prev = false;
            }
        }
        return res;
    }

    public boolean isAnagrams(String s, int[] countP) {
        int[] countS = new int[26];
        for (char c : s.toCharArray()) {
            countS[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (countP[i] != countS[i]) return false;
        }
        return true;
    }

    //Best solution
//    static {
//        for (int i = 0; i < 200; i++) {
//            findAnagrams("aaa","a");
//        }
//    }
//
//    public static List<Integer> findAnagrams(String s, String p) {
//        List<Integer> result= new ArrayList<>();
//        char[]sArr= s.toCharArray();
//        char[]pArr=p.toCharArray();
//        int[]maps= new int[26];
//        int n=sArr.length;
//        int k =pArr.length;
//
//        if (n < k) return result;
//        for (int i = 0; i < k; i++) {
//            maps[pArr[i]-'a']++;
//            maps[sArr[i]-'a']--;
//        }
//        int diffCount = 0;
//        for (int f : maps) {
//            if (f > 0) {
//                diffCount++;
//            }
//        }
//        if(diffCount==0)
//            result.add(0);
//
//        for (int i = k; i <n ; i++) {
//            if(++maps[sArr[i-k]-'a']==1) diffCount++;
//            if(--maps[sArr[i]-'a']==0) diffCount--;
//            if(diffCount==0)
//                result.add(i-k+1);
//        }
//        return result;
//    }
}
