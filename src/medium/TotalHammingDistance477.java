package medium;

public class TotalHammingDistance477 {
    public int totalHammingDistance(int[] nums) {
        int sum = 0;
        int[] zeros = new int[32];
        int[] ones = new int[32];
        for (int num:nums) {
           sum+= helper(num, zeros, ones);
        }
        return sum;
    }

    public int helper(int num, int[] zeros, int[] ones) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int bit = 1 << i;
            if ((num & bit) == bit) {
                res += zeros[i];
                ones[i]++;
            } else {
                res += ones[i];
                zeros[i]++;
            }
        }
        return res;
    }

    //Best Solution
//    public int totalHammingDistance(int[] nums) {
//        int res = 0;
//        for (int i = 0; i < 32; i++) {
//            res += distance(nums, i);
//        }
//        return res;
//    }
//    private int distance(int[] nums, int pos) {
//        int count = 0;
//        for (int num : nums) {
//            count += ((num >> pos) & 1);
//        }
//        return count * (nums.length - count);
//    }
}
