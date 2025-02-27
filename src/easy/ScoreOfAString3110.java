package easy;

public class ScoreOfAString3110 {
    public int scoreOfString(String s) {
        int prev = s.charAt(0);
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            sum += Math.abs(s.charAt(i) - prev);
            prev = s.charAt(i);
        }
        return sum;
    }
}
