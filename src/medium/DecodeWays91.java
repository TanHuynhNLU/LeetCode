package medium;

public class DecodeWays91 {
    public static int numDecodings(String s) {
        int n = s.length();
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        dp1[0] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 1; i < n; i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (curr == '0') {
                dp1[i] = 0;
            } else {
                dp1[i] = dp1[i - 1] + dp2[i - 1];
            }
            if (prev <= '1' || (prev == '2' && curr <= '6')) {
                dp2[i] = dp1[i - 1];
            } else dp2[i] = 0;
        }
        return dp1[n - 1] + dp2[n - 1];
    }

    public static void main(String[] args) {
        numDecodings("12");
    }
}
