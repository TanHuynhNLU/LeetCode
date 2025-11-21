package medium;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomFlipMatrix519 {
    private Random rd;
    private int m;
    private int n;
    Set<Integer> set;

    public RandomFlipMatrix519(int m, int n) {
        this.rd = new Random();
        this.m = m;
        this.n = n;
        set = new HashSet<>();
    }

    public int[] flip() {
        int value = rd.nextInt(m * n);
        while (set.contains(value)) {
            value = rd.nextInt(m * n);
        }
        set.add(value);
        int i = value / n;
        int j = value % n;
        return new int[]{i, j};
    }

    public void reset() {
        this.rd = new Random();
        set = new HashSet<>();
    }

    // Best solution
//    int i = 0, j = 0;
//    int m = 0;
//    int n = 0;
//
//    public Solution(int m, int n) {
//        this.m = m;
//        this.n = n;
//    }
//
//    public int[] flip() {
//        j++;
//        if (j == n) {
//            j = 0;
//            i++;
//        }
//        if (i == m) {
//            i = 0;
//            j = 0;
//        }
//        return new int[]{i, j};
//    }
//
//    public void reset() {
//
//    }
}
