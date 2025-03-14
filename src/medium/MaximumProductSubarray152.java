package medium;

public class MaximumProductSubarray152 {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;
        for (int num : nums) {
            int tmpMax = max;
            int tmpMin = min;
            if (num < 0) {
                max = Math.max(num, num * tmpMin);
                min = Math.min(num, num * tmpMax);
            } else {
                max = Math.max(num, num * tmpMax);
                min = Math.min(num, num * tmpMin);
            }
            res = Math.max(res, max);
        }
        return res;
    }

    //    Best solution
//    public int maxProduct(int[] nums) {
//        int ans = -95;
//        int c = 1;
//        for (int i = 0; i < nums.length; i++) {
//            c *= nums[i];
//            ans = Math.max(ans, c);
//            if (c == 0) {
//                c = 1;
//            }
//        }
//        c = 1;
//        for (int i = nums.length - 1; i >= 0; i--) {
//            c *= nums[i];
//            ans = Math.max(ans, c);
//            if (c == 0) {
//                c = 1;
//            }
//        }
//        return ans;
//    }
}
