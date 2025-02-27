package easy;

public class MaximumScoreAfterSplittingAString {
    public int maxScore(String s) {
        int count0 = 0;
        int count1 = 0;
        int max = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') count1++;
        }
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == '0') count0++;
            else count1--;
            max = Math.max(max, count1 + count0);
        }
        return max;
    }
}
