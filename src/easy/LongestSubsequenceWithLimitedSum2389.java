package easy;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum2389 {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            res[i] = count(nums, queries[i]);
        }
        return res;
    }

    public int count(int[] nums, int max) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) break;
            else count++;
        }
        return count;
    }
//    Best Solution

//    int binarySearch(int[] prefixSum, int target) {
//        int left = 0;
//        int right = prefixSum.length - 1;
//        while (left <= right) {
//            int mid = (left + right) >>> 1;
//            if (prefixSum[mid] <= target) {
//                left = ++mid;
//            } else {
//                right = --mid;
//            }
//        }
//        return left;
//    }
//
//    public int[] answerQueries(int[] nums, int[] queries) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        for (int i = 1; i < n; i++) {
//            nums[i] = nums[i] + nums[i - 1];
//        }
//        int[] res = new int[queries.length];
//        for (int i = 0; i < queries.length; i++) {
//            res[i] = binarySearch(nums, queries[i]);
//        }
//
//        return res;
//    }
}
