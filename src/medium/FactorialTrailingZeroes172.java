package medium;

public class FactorialTrailingZeroes172 {
    public int trailingZeroes(int n) {
        if (n == 0) return 1;
        int res = 0;
        while (n >= 5) {
            res += n / 5;
            n /= 5;
        }
        return res;
    }
}
