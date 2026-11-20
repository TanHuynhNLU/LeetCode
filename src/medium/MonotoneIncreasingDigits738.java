package medium;

public class MonotoneIncreasingDigits738 {
    public int monotoneIncreasingDigits(int n) {
        if (n == 0) return 0;
        if (n <= 10) return n - 1;
        int[] nums = new int[10];
        int i = 9;
        nums[i] = n % 10;
        n /= 10;
        i--;
        while (n != 0) {
            int digit = n % 10;
            if (digit > nums[i + 1]) {
                for (int j = i + 1; j < 10; j++) {
                    nums[j] = 9;
                }
                nums[i] = digit - 1;
            } else {
                nums[i] = digit;
            }
            n /= 10;
            i--;
        }
        int res = 0;
        for (int j = 0; j < 10; j++) {
            res = res * 10 + nums[j];
        }
        return res;
    }

    //Best solution
//    public int monotoneIncreasingDigits(int n) {
//        int multiplier = 10, decreasedN = n;
//        while (!isMonotone(decreasedN)) {
//            decreasedN = n - (n % multiplier + 1);
//            multiplier *= 10;
//        }
//        return decreasedN;
//    }
//
//    private boolean isMonotone(int n) {
//        int prev = Integer.MAX_VALUE, current;
//        while (n > 0) {
//            current = n % 10;
//            if (current > prev) {
//                return false;
//            }
//            prev = current;
//            n = n / 10;
//        }
//        return true;
//    }
}
