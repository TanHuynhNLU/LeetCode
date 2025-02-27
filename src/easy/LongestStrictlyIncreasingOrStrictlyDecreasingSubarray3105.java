package easy;

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray3105 {
    public int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 1) return 1;
        int res =0;
        int increasing = 1;
        int decreasing = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                increasing++;
                decreasing=1;
            }
            if(nums[i] < nums[i-1]) {
                decreasing++;
                increasing=1;
            }
            if(nums[i] == nums[i-1]) {
                increasing=1;
                decreasing=1;
            }
            res = Math.max(res, increasing);
            res = Math.max(res, decreasing);
        }
        return res;
    }
}
