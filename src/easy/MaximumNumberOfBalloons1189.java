package easy;

public class MaximumNumberOfBalloons1189 {
    public int maxNumberOfBalloons(String text) {
        int[] chars = new int[26];
        char[] charArray = text.toCharArray();
        int min =text.length();
        for (char c : charArray) {
            chars[c-'a']++;
        }
        min = Math.min(min,chars['b'-'a']);
        min = Math.min(min,chars['a'-'a']);
        min = Math.min(min,chars['l'-'a']/2);
        min = Math.min(min,chars['o'-'a']/2);
        min = Math.min(min,chars['n'-'a']);
        return min;
    }
}
