package easy;

public class CheckIfWordEqualsSummationOfTwoWords1880 {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int count1 = 0, count2 = 0, count3 = 0;
        for (char c : firstWord.toCharArray()) {
            count1 = count1 * 10 + c - 'a';
        }
        for (char c : secondWord.toCharArray()) {
            count2 = count2 * 10 + c - 'a';
        }
        for (char c : targetWord.toCharArray()) {
            count3 = count3 * 10 + c - 'a';
        }
        return count1 + count2 == count3;
    }
}
