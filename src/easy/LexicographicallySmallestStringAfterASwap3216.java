package easy;

public class LexicographicallySmallestStringAfterASwap3216 {
    public String getSmallestString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            int n = Character.getNumericValue(chars[i]);
            int prev = Character.getNumericValue(chars[i - 1]);
            if ((n % 2 == 0 && prev % 2 == 0) || (n % 2 != 0 && prev % 2 != 0)) {
                if (prev > n) {
                    char temp = chars[i-1];
                    chars[i - 1] = chars[i];
                    chars[i] = temp;
                    break;
                }
            }
        }
        return new String(chars);
    }
}
