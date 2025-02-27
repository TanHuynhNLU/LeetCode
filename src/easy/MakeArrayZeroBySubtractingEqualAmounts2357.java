package easy;

import java.util.Arrays;

public class MakeArrayZeroBySubtractingEqualAmounts2357 {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int count = 0;
        for (int n : nums) {
            if (n <= 0) continue;
            if (n - sum > 0) {
                sum += n - sum;
                count++;
            }
        }
        return count;
    }

    //    Best Solution
//    public int minimumOperations(int[] nums) {
//        return result(nums, 0);
//    }
//
//    private int result(int[] nums, int count) {
//        int min = Integer.MAX_VALUE;
//        for (int num : nums) {
//            if (num > 0 && num < min) min = num;
//        }
//        if (min == Integer.MAX_VALUE) return count;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) nums[i] -= min;
//        }
//        return result(nums, ++count);
//    }
}
