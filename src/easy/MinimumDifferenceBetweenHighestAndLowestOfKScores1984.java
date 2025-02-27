package easy;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestAndLowestOfKScores1984 {
    public static int minimumDifference(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - k + 1; i++) {
            int calc = nums[i+k-1] - nums[i];
            min = Math.min(min, calc);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {87063,61094,44530,21297,95857,93551,9918};
        minimumDifference(nums, 6);
    }
}
