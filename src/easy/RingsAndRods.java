package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RingsAndRods {
    public static int countPoints(String rings) {
        Set<Character>[] counts = new HashSet[10];
        for (int i = 0; i < counts.length; i++){
            counts[i] = new HashSet<>();
        }
        char[] chars = rings.toCharArray();
        for (int i = 0; i < chars.length; i+=2) {
            counts[chars[i+1]-'0'].add(chars[i]);
        }
        int ans = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i].size() == 3) ans++;
        }
        return ans;
    }

//    Best solution
//public int countPoints(String rings) {
//    int[] array = new int[10];
//    for (int i = 0; i < rings.length(); i += 2) {
//        int index = rings.charAt(i + 1) - '0';
//        char color = rings.charAt(i);
//        int mask = color == 'R' ? 1 : (color == 'G' ? 2 : 4);
//        array[index] |= mask;
//    }
//    int result = 0;
//    for (int num : array) {
//        if (num == 7) {
//            result++;
//        }
//    }
//    return result;
//}

    public static void main(String[] args) {
        countPoints("B0B6G0R6R0R6G9");
    }
}
