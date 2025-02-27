package easy;

public class RearrangeCharactersToMakeTargetString2287 {
    public int rearrangeCharacters(String s, String target) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (char c : s.toCharArray()) count1[c - 'a']++;
        for (char c : target.toCharArray()) count2[c - 'a']++;
        int min = 100;
        for (int i = 0; i < 26; i++) {
            if(count1[i] == 0 && count2[i] > 0) return 0;
            if (count1[i] > 0 && count2[i] > 0) {
                min = Math.min(min, Math.floorDiv(count1[i], count2[i]));
            }
        }
        return min;
    }
}
