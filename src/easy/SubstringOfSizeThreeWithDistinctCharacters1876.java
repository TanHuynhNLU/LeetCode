package easy;

import java.util.LinkedList;
import java.util.Queue;

public class SubstringOfSizeThreeWithDistinctCharacters1876 {
    public static int countGoodSubstrings(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length() - 2; i++) {
            if (chars[i] != chars[i + 1] && chars[i + 1] != chars[i + 2] && chars[i] != chars[i + 2]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        countGoodSubstrings("xyzzaz");
    }
}
