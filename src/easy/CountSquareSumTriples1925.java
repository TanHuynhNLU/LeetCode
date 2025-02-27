package easy;

public class CountSquareSumTriples1925 {
    public static int countTriples(int n) {
        int count = 0;
        for (int i = 3; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                double value = Math.sqrt(i * i + j * j);
                if (value > n) break;
                if (value == (int) value) count++;
            }
        }
        return count*2;
    }

    public static void main(String[] args) {
        countTriples(10);
    }
}
