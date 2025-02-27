package medium;

public class JumpGameII45 {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int i = 0;
        int res = 0;
        while (i < nums.length) {
            if (i + nums[i] >= nums.length - 1) {
                res++;
                break;
            }
            int maxIndex = findMax(nums, i + 1, i + nums[i]);
            if (maxIndex + nums[maxIndex] > i + nums[i]) {
                i = maxIndex;
            } else {
                i = i + nums[i];
            }
            res++;
        }
        return res;
    }

    public int findMax(int[] nums, int start, int end) {
        int max = start + nums[start];
        int res = start;
        for (int i = start; i <= end; i++) {
            if (i + nums[i] >= max) {
                max = i + nums[i];
                res = i;
            }
        }
        return res;
    }
}
