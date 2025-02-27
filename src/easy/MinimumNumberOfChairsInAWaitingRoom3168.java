package easy;

public class MinimumNumberOfChairsInAWaitingRoom3168 {
    public int minimumChairs(String s) {
        int count = 0;
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == 'E') count++;
            else count--;
            max = Math.max(max, count);
        }
        return max;
    }
}
