package easy;

import java.util.Arrays;

public class LargestSubstringBetweenTwoEqualCharacter1624 {
    public static int maxLengthBetweenEqualCharacters(String s) {
        int max =-1;
        int[] count = new int[26];
        Arrays.fill(count,-1);
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {

            if(count[chars[i]-'a']==-1) count[chars[i]-'a']=i;
            else {
                max = Math.max(max,i-count[chars[i]-'a']-1);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        maxLengthBetweenEqualCharacters("abca");
    }
}

