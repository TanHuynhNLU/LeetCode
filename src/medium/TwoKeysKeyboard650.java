package medium;

public class TwoKeysKeyboard650 {
    public int minSteps(int n) {
        int res = 0;
        while (n > 1) {
            boolean flag = false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    res += i;
                    n /= i;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                res += n;
                break;
            }
        }
        return res;
    }
}
