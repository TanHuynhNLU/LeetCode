package easy;

public class CheckIfStringsCanBeMadeEqualWithOperationsI2839 {
    public boolean canBeEqual(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        if(c1[0] != c2[0]&&c1[0] != c2[2]) return false;
        if(c1[2] != c2[2]&&c1[2] != c2[0]) return false;
        if(c1[1] != c2[1]&&c1[1] != c2[3]) return false;
        if(c1[3] != c2[3]&&c1[3] != c2[1]) return false;
        return true;
    }
}
