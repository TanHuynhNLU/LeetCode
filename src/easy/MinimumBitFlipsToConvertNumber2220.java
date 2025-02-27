package easy;

public class MinimumBitFlipsToConvertNumber2220 {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        while (start != 0 || goal != 0) {
            int num1 = start & 1;
            int num2 = goal & 1;
            if (num1 != num2) count++;
            start >>>= 1;
            goal >>>= 1;
        }
        return count;
    }
}
