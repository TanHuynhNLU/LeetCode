package easy;

public class NumberOfValidWordsInASentence2047 {
    public static int countValidWords(String sentence) {
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.length() == 0) continue;
            if (isValidWord(word)) count++;
        }
        return count;
    }

    public static boolean isValidWord(String word) {
        char[] chars = word.toCharArray();
        int hyphen = 0;
        boolean isValid = true;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(chars[i])) {
                isValid = false;
                break;
            }
            if (chars[i] == ',' || chars[i] == '.' || chars[i] == '!') {
                if (i != word.length() - 1) {
                    isValid = false;
                    break;
                }
            }
            if (chars[i] == '-') {
                if (i + 1 < word.length()) {
                    if (!Character.isAlphabetic(chars[i + 1])) {
                        isValid = false;
                        break;
                    } else {
                        hyphen++;
                    }
                }
            }
        }
        if (hyphen > 1 || chars[0] == '-' || chars[word.length() - 1] == '-') {
            isValid = false;
        }
        return isValid;
    }

    public static void main(String[] args) {
        isValidWord("j-ppy");
    }
}
