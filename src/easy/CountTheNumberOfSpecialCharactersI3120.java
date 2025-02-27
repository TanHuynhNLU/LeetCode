package easy;

public class CountTheNumberOfSpecialCharactersI3120 {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        int[] countLowercase = new int[26];
        int[] countUppercase = new int[26];
        for (char c : word.toCharArray()) {
            if (Character.isLowerCase(c)) {
                if (countLowercase[c - 'a'] == 0 && countUppercase[c - 'a'] >= 1) count++;
                countLowercase[c - 'a']++;
            } else {
                if (countUppercase[c - 'A'] == 0 && countLowercase[c - 'A'] >= 1) count++;
                countUppercase[c - 'A']++;
            }
        }
        return count;
    }
}
