package easy;

public class PercentageOfLetterInString2278 {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }
        return (int) Math.floor(((double) count / s.length()) * 100);
    }
}
