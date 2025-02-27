package easy;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences1941 {
    public boolean areOccurrencesEqual(String s) {
        int[] counts = new int[26];
        int max = 0;
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
            max = Math.max(max, counts[c - 'a']);
        }
        for (int i = 0; i < 26; i++) {
            if (counts[i] != 0 && counts[i] != max) return false;
        }
        return true;
    }
}
