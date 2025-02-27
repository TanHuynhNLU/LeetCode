package easy;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBallsInABox1742 {
    public int countBalls(int lowLimit, int highLimit) {
        int[] counts = new int[46];
        int max = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = sumDigits(i);
            counts[sum]++;
            max = Math.max(max, counts[sum]);
        }

        return max;
    }
    public int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

//    Best solution
//private static int MAX_IDX = 45; //10^5 -> 100000 -> 9+9+9+9+9
//
//    public int countBalls(int lo, int hi) {
//        var boxes = new int[MAX_IDX + 1];
//
//        var idx = boxIdx(lo);
//        boxes[idx]++;
//
//        var max = 1;
//        while (++lo <= hi) {
//            var tmp = lo;
//
//            // 6199 -> 6200
//            while (tmp % 10 == 0) { // we reduce 'idx' for each tailing zero
//                idx -= 9;
//                tmp /= 10;
//            }
//            max = Math.max(++boxes[++idx], max);
//        }
//        return max;
//    }
//
//    private static int boxIdx(int n) {
//        var res = 0;
//        while (n > 0) {
//            res += n % 10;
//            n /= 10;
//        }
//        return res;
//    }
}
