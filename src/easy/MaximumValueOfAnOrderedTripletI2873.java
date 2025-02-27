package easy;

public class MaximumValueOfAnOrderedTripletI2873 {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    long calc = (nums[i] - nums[j]) * nums[k];
                    max = Math.max(max, calc);
                }
            }
        }
        return max;
    }

    //    Best Solution
//    public long maximumTripletValue(int[] nums) {
//        long ans = 0;
//        int maxDiff = 0, maxNum = 0;
//        for (int num : nums) {
//            ans = Math.max(ans, (long) maxDiff * num);
//            maxDiff = Math.max(maxDiff, maxNum - num);
//            maxNum = Math.max(maxNum, num);
//        }
//        return ans;
//    }
}
