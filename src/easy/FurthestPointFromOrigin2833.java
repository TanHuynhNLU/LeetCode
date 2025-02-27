package easy;

public class FurthestPointFromOrigin2833 {
    public int furthestDistanceFromOrigin(String moves) {
        char[] chars = moves.toCharArray();
        int countL = 0;
        int countR = 0;
        int count_ = 0;
        for (char c : chars) {
            if (c == 'L') countL++;
            else if (c == 'R') countR++;
            else count_++;
        }
        return Math.abs(countL - countR) + count_;
    }
}
