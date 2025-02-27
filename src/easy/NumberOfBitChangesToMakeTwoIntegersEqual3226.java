package easy;

public class NumberOfBitChangesToMakeTwoIntegersEqual3226 {
    public int minChanges(int n, int k) {
        int count = 0;
        while (n != 0 || k != 0) {
            int n1 = n & 1;
            int k1 = k & 1;
            if (n1 == 1 && k1 == 0) count++;
            if (n1 == 0 && k1 == 1) return -1;
            n >>>= 1;
            k >>>= 1;
        }
        return count;
    }
}
