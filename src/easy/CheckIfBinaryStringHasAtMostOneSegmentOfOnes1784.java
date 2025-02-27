package easy;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes1784 {
    public boolean checkOnesSegment(String s) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if(chars[i]=='1' && chars[i-1]=='0') return false;
        }
        return true;
    }
}
