package easy;

public class ConsecutiveCharacters1446 {
    public int maxPower(String s) {
        int max = 0;
        char prev = ' ';
        int count = 1;
        for (char c : s.toCharArray()) {
            if (c == prev) count++;
            else {
                prev = c;
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}
