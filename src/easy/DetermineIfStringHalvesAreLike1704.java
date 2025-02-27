package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DetermineIfStringHalvesAreLike1704 {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = Set.of('a','o','i','u','e','A','O','I','U','E');
        int counter1 = 0;
        int counter2 = 0;
        for(int i = 0; i < s.length()/2; i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                counter1++;
            }
        }
        for(int i = s.length()/2; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                counter2++;
            }
        }
        return counter1 == counter2;
    }

//    Best solution
//public boolean halvesAreAlike(String s) {
//    int[] firstPart = new int[123], secondPart = new int[123];
//    return compute(0, s.length() / 2, firstPart, s) == compute(s.length() / 2, s.length(), secondPart, s);
//}
//
//    private static int compute(int start, int end, int[] map, String s){
//        while(start < end)
//            map[s.charAt(start++)]++;
//        return map['a'] + map['e'] + map['i'] + map['u'] + map['o'] + map['A'] + map['E'] + map['I'] + map['U'] + map['O'];
//    }
}
