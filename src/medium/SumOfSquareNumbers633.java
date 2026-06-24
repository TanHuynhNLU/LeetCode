package medium;

import java.util.HashSet;
import java.util.Set;

public class SumOfSquareNumbers633 {
    public boolean judgeSquareSum(int c) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= Math.sqrt(c); i++) {
            if (set.contains(i * i) || i * i + i * i == c) return true;
            else {
                set.add(c - i * i);
            }
        }
        return false;
    }
    //Best solution
//    public boolean judgeSquareSum(int c) {
//        for (int divisor = 2; divisor * divisor <= c; divisor++) {
//            if (c % divisor == 0) {
//                int exponentCount = 0;
//                while (c % divisor == 0) {
//                    exponentCount++;
//                    c /= divisor;
//                }
//                if (divisor % 4 == 3 && exponentCount % 2 != 0) {
//                    return false;
//                }
//            }
//        }
//        return c % 4 != 3;
//    }
}
