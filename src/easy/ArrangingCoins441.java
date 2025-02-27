package easy;

public class ArrangingCoins441 {
    public static int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        int max = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            double sum = mid * ((double)(1 + mid) / 2);
            if (sum < n) {
                left = mid + 1;
                if (mid > max) max = mid;
            }
            if (sum > n) {
                right = mid - 1;
            }
            if (sum == n) return mid;
        }
        return max;
//        Bit manipulation solution
//        if (n < 0) {
//            throw new IllegalArgumentException("Input Number is invalid. Only positive numbers are allowed");
//        }
//
//        int mask = 1 << 15;
//        long result = 0;
//
//        while (mask > 0) {
//            long temp = result | mask;
//            long coinsFilled = temp * (temp + 1) / 2;
//            if (coinsFilled == n) {
//                return (int) temp;
//            }
//            if (coinsFilled < n) {
//                result = temp;
//            }
//            mask >>= 1;
//        }
//
//        return (int) result;

    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
}
