package easy;

public class CheckWhetherTwoStringsAreAlmostEquivalent2068 {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] counts = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            counts[word1.charAt(i) - 'a']++;
            counts[word2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (Math.abs(counts[i])>3) return false;
        }
        return true;
    }
}
