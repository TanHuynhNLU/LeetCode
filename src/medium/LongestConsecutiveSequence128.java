package medium;

import java.util.Arrays;
import java.util.TreeSet;

public class LongestConsecutiveSequence128 {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int longest = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;
            if (nums[i] == nums[i - 1] + 1) count++;
            else {
                longest = Math.max(longest, count);
                count = 1;
            }
        }
        longest = Math.max(longest, count);
        return longest;
    }

    //    Best Solution
//    public int longestConsecutive(int[] nums) {
//        int result = 0; // Variable to store the length of the longest consecutive sequence
//        if (nums.length > 0) {
//            // Check if the array length is less than 10,000
//            if (nums.length < 10000) {
//                Set<Integer> set = new HashSet<>();
//
//                for (int num : nums)
//                    set.add(num);
//
//                for (int num : nums) {
//                    int currLength = 0;
//
//                    if (!set.contains(num - 1)) {
//                        while (set.contains(num + currLength))
//                            currLength++;
//
//                        result = Math.max(result, currLength);
//                    }
//                }
//            } else {
//                // For larger arrays, find min and max
//                int min = Integer.MAX_VALUE;
//                int max = Integer.MIN_VALUE;
//                for (int num : nums) {
//                    if (num > max) {
//                        max = num; // Update max
//                    }
//                    if (num < min) {
//                        min = num; // Update min
//                    }
//                }
//                // Create a bit array to track presence of numbers
//                boolean[] bits = new boolean[max - min + 1];
//                for (int num : nums) {
//                    bits[num - min] = true; // Mark the presence of the number
//                }
//                int current = 0; // Counter for the current consecutive sequence
//
//                for (boolean isPresent : bits) {
//                    if (isPresent) {
//                        current++;
//                    } else {
//                        if (current > result) {
//                            result = current;
//                        }
//                        current = 0;
//                    }
//                }
//                // Final check for the last sequence
//                if (current > result) {
//                    result = current;
//                }
//            }
//        }
//        return result; // Return the length of the longest consecutive sequence
//    }
}
