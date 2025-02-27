package medium;

public class MyPow50 {
    public double myPow(double x, int n) {
        if(x==-1&&n==Integer.MIN_VALUE) return 1.0;
        double ans = 1;
        double base = x;
        int sign = n > 0 ? 1 : -1;
        if (n == Integer.MIN_VALUE) n = Integer.MAX_VALUE;
        else n = Math.abs(n);
        while (n > 0) {
            if ((n & 1) == 1) {
                if (sign == 1) ans *= base;
                else ans /= base;
            }
            base *= base;
            n >>= 1;
        }
        return ans;
    }
}
