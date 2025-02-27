package easy;

public class MakeThreeStringsEqual2937 {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int count = 0;
        int i = 0;
        while (i < s1.length() && i < s2.length() && i < s3.length()) {
            if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) count++;
            else break;
            i++;
        }
        if (count == 0) return -1;
        return (s1.length() + s2.length() + s3.length()) - count * 3;
    }
}
