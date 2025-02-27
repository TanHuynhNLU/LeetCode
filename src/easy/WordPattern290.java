package easy;

import java.util.HashMap;

public class WordPattern290 {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] split = s.split(" ");
        if(split.length!=pattern.length()) return false;

        for (int i=0;i<pattern.length();i++) {
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(split[i])) return false;
            }else {
                if(map.containsValue(split[i])) return false;
                map.put(c,split[i]);
            }
        }
        return true;
//        Best Solution
//        String[] words = s.split(" ");
//        if (words.length != pattern.length())
//            return false;
//
//        Map<Character, Integer> charToIndex = new HashMap<>();
//        Map<String, Integer> stringToIndex = new HashMap<>();
//
//        for (Integer i = 0; i < pattern.length(); ++i)
//            if (charToIndex.put(pattern.charAt(i), i) != stringToIndex.put(words[i], i))
//                return false;
//
//        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "cat dog dog cat";
        System.out.println(wordPattern(pattern,s));
    }
}
