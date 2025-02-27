package easy;

import java.util.Arrays;

public class MaximumStrongPairXorI2932 {
    public int maximumStrongPairXor(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
                    res = Math.max(res, nums[i] ^ nums[j]);
                }
            }
        }
        return res;
    }

    //    Best Solution
//    public int maximumStrongPairXor(int[] nums) {
//        int n = nums.length;
//
//        int max = 0;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                int xor = nums[i] ^ nums[j];
//
//                if (xor > max && isStrongPair(nums[i], nums[j]))
//                    max = xor;
//            }
//        }
//
//        return max;
//    }
//
//    private boolean isStrongPair(int x, int y) {
//        return Math.abs(x - y) <= Math.min(x, y);
//    }
}
