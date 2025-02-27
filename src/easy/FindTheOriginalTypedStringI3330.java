package easy;

public class FindTheOriginalTypedStringI3330 {
    public int possibleStringCount(String word) {
        char[] chars = word.toCharArray();
        int count = 1;
        char prev = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == prev) {
                count++;
            }
            prev = chars[i];
        }
        return count;
    }
}
