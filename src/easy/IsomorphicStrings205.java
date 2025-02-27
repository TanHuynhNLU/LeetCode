package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings205 {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (map.containsKey(charS)) {
                char tmp = map.get(charS);
                if (tmp != charT) return false;
            }else if(map.containsValue(charT)) return false;
            else {
                map.put(charS, charT);
            }
        }
        return true;
        //best Solution
//        char[] asciiMap = new char[128];
//        boolean[] alreadyMapped = new boolean[128];
//
//        char[] sArr = s.toCharArray();
//        char[] tArr = t.toCharArray();
//
//        for (int i = 0; i < sArr.length; i++) {
//            if (asciiMap[sArr[i]] == tArr[i])
//                continue;
//
//            if (asciiMap[sArr[i]] == 0 && !alreadyMapped[tArr[i]])
//                asciiMap[sArr[i]] = tArr[i];
//            else
//                return false;
//            alreadyMapped[tArr[i]] = true;
//        }
//        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
    }
}
