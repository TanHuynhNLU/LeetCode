package easy;

import java.util.Arrays;

public class CheckDistancesBetweenSameLetters2399 {
    public static boolean checkDistances(String s, int[] distance) {
        int[] calc = new int[26];
        Arrays.fill(calc, -1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (calc[c - 'a'] == -1) {
                calc[c - 'a'] = i;
            } else {
                calc[c - 'a'] = i - calc[c - 'a'] - 1;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (calc[i] == -1) continue;
            if (calc[i] != distance[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        checkDistances("abaccb",new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
    }
}
