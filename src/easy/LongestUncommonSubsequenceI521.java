package easy;

public class LongestUncommonSubsequenceI521 {
    public int findLUSlength(String a, String b) {
        return a.equals(b)?-1:Math.max(a.length(),b.length());
    }
}
