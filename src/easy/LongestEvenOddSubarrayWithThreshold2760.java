package easy;

public class LongestEvenOddSubarrayWithThreshold2760 {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i] <= threshold) {
                int prev = 0;
                int l = 1;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > threshold) {
                        break;
                    }
                    if (nums[j] % 2 == prev) {
                        break;
                    }
                    l++;
                    prev = nums[j] % 2;
                }
                max = Math.max(max, l);
            }
        }
        return max;
    }

    //    Best Solution
//    public int longestAlternatingSubarray(int[] nums, int threshold) {
//        int len = 0;
//        int maxLen = 0;
//        for (int num : nums) {
//            if (num <= threshold) {
//                if (((num ^ len) & 1) == 0) {
//                    len++;
//                    maxLen = Math.max(maxLen, len);
//                } else {
//                    len = (~num & 1);
//                }
//            } else {
//                len = 0;
//            }
//        }
//        return maxLen;
//    }
}
