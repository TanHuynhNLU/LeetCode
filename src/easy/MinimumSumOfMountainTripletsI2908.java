package easy;

public class MinimumSumOfMountainTripletsI2908 {
    public int minimumSum(int[] nums) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[j] > nums[k]) {
                        int sum = nums[i] + nums[j] + nums[k];
                        res = Math.min(res, sum);
                    }
                }
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}
