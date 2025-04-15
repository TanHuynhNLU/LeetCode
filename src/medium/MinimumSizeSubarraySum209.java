package medium;

public class MinimumSizeSubarraySum209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int res = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target && left <= right) {
                if (res == 0) res = right - left + 1;
                else res = Math.min(res, right - left + 1);
                sum -= nums[left++];
            }
        }
        return res;
    }
}
