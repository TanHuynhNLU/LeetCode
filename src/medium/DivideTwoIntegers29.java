package medium;

public class DivideTwoIntegers29 {
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int sign = (dividend > 0) ^ (divisor > 0) ? -1 : 1;
        int res = 0;
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        for (int i = 31; i >= 0; i--) {
            if ((b << i) <= a) {
                a -= (b << i);
                res |= (1 << i);
            }
        }
        return res * sign;
    }

    public static void main(String[] args) {
        divide(-2147483648, 1);
    }
}
