package easy;

import java.util.HashSet;
import java.util.Set;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegers1317 {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if (checkNoZero(n) && checkNoZero(n - i)) return new int[]{i, n - i};
        }
        return null;
    }

    public boolean checkNoZero(int n) {
        while (n != 0) {
            if (n % 10 == 0) return false;
            n /= 10;
        }
        return true;
    }
}
