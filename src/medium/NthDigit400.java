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
                int num = startNum + n / (i + 3);
                return getDigit(num, i - 1);
            }
        }
        return 0;
    }

    public int getDigit(int num, int th) {
        String s = String.valueOf(num);
        return Character.getNumericValue(s.charAt(th));
    }
}
