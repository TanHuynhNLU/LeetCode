package medium;

public class HouseRobberII213 {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0],nums[1]);

        // House 1 to House n-1
        int[] dp1 = new int[nums.length - 1];
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0], nums[1]);
        //House 2 to House n;
        int[] dp2 = new int[nums.length - 1];
        dp2[0] = nums[1];
        dp2[1] = Math.max(nums[1], nums[2]);

        for (int i = 2; i < nums.length - 1; i++) {
            dp1[i] = Math.max(dp1[i - 2] + nums[i], dp1[i - 1]);
        }

        for (int i = 3; i < nums.length; i++) {
            dp2[i - 1] = Math.max(dp2[i - 3] + nums[i], dp2[i - 2]);
        }
        return Math.max(dp1[nums.length - 2], dp2[nums.length - 2]);
    }
}
