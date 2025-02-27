package easy;

public class FindWordsThatCanBeFormedByCharacters1160 {
    public int countCharacters(String[] words, String chars) {
        int res = 0;
        int[] countChars = new int[26];
        char[] charsCharArray = chars.toCharArray();
        for (char c : charsCharArray) {
            countChars[c - 'a']++;
        }
        for (String word : words) {
            char[] wordsCharArray = word.toCharArray();
            int[] countWords = new int[26];
            boolean isGood = true;
            for (char c : wordsCharArray) {
                if (countWords[c - 'a'] < countChars[c - 'a']) {
                    countWords[c - 'a']++;
                } else {
                    isGood = false;
                    break;
                }
            }
            if (isGood) res += word.length();
        }
        return res;
    }
}
