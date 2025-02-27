package easy;

public class MinimumNumberOfPushesToTypeWordI3014 {
    public int minimumPushes(String word) {
        int res = 0;
        int div = word.length() / 8;
        int mod = word.length() % 8;
        for (int i = 1; i <= div; i++) {
            res += 8 * i;
        }
        return res + mod * (div + 1);
    }
}
