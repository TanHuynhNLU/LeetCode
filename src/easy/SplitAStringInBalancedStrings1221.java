package easy;

public class SplitAStringInBalancedStrings1221 {
    public int balancedStringSplit(String s) {
        int countL = 0;
        int countR = 0;
        int res = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == 'L') countL++;
            else countR++;
            if (countR == countL) {
                res++;
                countR = 0;
                countL = 0;
            }
        }
        return res;
    }
}
