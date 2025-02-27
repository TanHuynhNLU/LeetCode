package easy;

public class AlternatingDigitSum2544 {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        boolean isPositive = true;
        int res = 0;
        for (char c : s.toCharArray()) {
            res += isPositive ? Character.getNumericValue(c) : -Character.getNumericValue(c);
            isPositive = !isPositive;
        }
        return res;
    }
}
