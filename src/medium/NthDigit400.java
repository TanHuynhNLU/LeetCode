package medium;

public class NthDigit400 {
    public int findNthDigit(int n) {
        if (n < 10) return n;
        int a = 1;
        int b = 1;
        int sum = 0;
        int[] nums = new int[8];
        int count = 0;
        while (b <= 8) {
            sum += 9 * a * b;
            a *= 10;
            b += 1;
            nums[count++] = sum;
        }
        for (int i = 7; i >= 0; i--) {
            if (n > nums[i]) {
                n = n - nums[i];
                int startNum = (int) Math.pow(10, i + 1);
                int num = startNum + (n - 1) / (i + 1);
                return getDigit(num, (n - 1) % (i + 1));
            }
        }
        return 0;
    }

    public int getDigit(int num, int th) {
        String s = String.valueOf(num);
        return Character.getNumericValue(s.charAt(th));
    }

    //Best Solution
//    public int findNthDigit(int n) {
//        int len = 1;
//        long count = 9;
//        int start = 1;
//
//        while (n > len * count) {
//            n -= len * count;
//            len += 1;
//            count *= 10;
//            start *= 10;
//        }
//
//        start += (n - 1) / len;
//        String s = Integer.toString(start);
//        return Character.getNumericValue(s.charAt((n - 1) % len));
//    }
}
