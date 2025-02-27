package easy;

public class FindTheMaximumDivisibilityScore2644 {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max = -1;
        int res = -1;
        for (int divisor : divisors) {
            int sum = 0;
            for (int num : nums) {
                if (num % divisor == 0) {
                    sum++;
                }
            }
            if (sum > max) {
                max = sum;
                res = divisor;
            }
            if (sum == max) {
                if (res > divisor) res = divisor;
            }
        }
        return res;
    }

    //    Best Solution
//    public int maxDivScore(int[] nums, int[] divisors) {
//        int div = Integer.MAX_VALUE;
//        int maxcount = 0;
//
//        int l = divisors.length;
//        if (l > 100) {
//            Arrays.sort(divisors);
//            divisors = Arrays.copyOfRange(divisors, 0, l / 10);
//        }
//
//        for (int d : divisors) {
//            int count = 0;
//            for (int n : nums) {
//                if (n % d == 0) {
//                    count++;
//                }
//            }
//            if (count > maxcount || (count == maxcount && d < div)) {
//                maxcount = count;
//                div = d;
//            }
//        }
//        return div;
//    }
}
