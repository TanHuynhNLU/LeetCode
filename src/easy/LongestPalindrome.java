package easy;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int l =0;
        int[] chars = new int[256];
        int odd=0;
        for (char c : s.toCharArray()){
            if(++chars[c]%2==0) {
                l+=2;
                odd--;
            }
            else odd++;
        }
        if(odd>0) l++;
        return l;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
