package easy;

public class RobotReturnToOrigin657 {
    public boolean judgeCircle(String moves) {
        int[] count = new int[26];
        for (char c: moves.toCharArray()) {
            count[c-'A']++;
        }
        return count['L'-'A']==count['R'-'A']&&count['U'-'A']==count['D'-'A'];
    }
}
