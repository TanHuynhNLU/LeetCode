package easy;

public class FindThePivotInteger2485 {
    public int pivotInteger(int n) {
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum2 += i;
            if (sum2 == sum1) return i;
            sum1 -= i;
        }
        return -1;
    }

    //    Best Solution
//    public int pivotInteger(int n) {
//        int totalSum = ((n * (n + 1)) / 2);
//        int sqrt = (int) Math.sqrt(totalSum);
//        if ((sqrt * sqrt) == totalSum)
//            return sqrt;
//        return -1;
//    }
}
