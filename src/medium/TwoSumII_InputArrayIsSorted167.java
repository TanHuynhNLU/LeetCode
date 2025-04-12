package medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII_InputArrayIsSorted167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] counters = new int[3001];
        for (int i = 0; i < numbers.length; i++) {
            if (counters[numbers[i] + 1000] != 0) {
                return new int[]{counters[numbers[i] + 1000], i + 1};
            } else {
                counters[target - numbers[i] + 1000] = i + 1;
            }
        }
        return null;
    }
    // By binary search method
//    public int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        int l = 0;
//        int r = nums.length - 1;
//        while (l < r) {
//            int sum = nums[l] + nums[r];
//            int mid = l + (r - l) / 2;
//            if (sum == target) {
//                res[0] = l + 1;
//                res[1] = r + 1;
//                return res;
//            }
//            if (sum < target) {
//                if (nums[r] + nums[mid] < target) {
//                    l = mid + 1;
//                } else {
//                    l++;
//                }
//            } else {
//                if (nums[l] + nums[mid] > target) {
//                    r = mid - 1;
//                } else {
//                    r--;
//                }
//            }
//        }
//        return res;
//    }
}
