package easy;

public class ReplaceAllDigitsWithCharacters1844 {
    public String replaceDigits(String s) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i+=2) {
            chars[i] = (char) (chars[i-1]+Character.getNumericValue(chars[i]));
        }
        return new String(chars);
    }

}
