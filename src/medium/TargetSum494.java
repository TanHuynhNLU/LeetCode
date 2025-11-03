package medium;

public class TargetSum494 {
    int res = 0;

    public int findTargetSumWays(int[] nums, int target) {
        helper(nums, 0, 0, target);
        return res;
    }

    public void helper(int[] nums, int idx, int sum, int target) {
        if (idx == nums.length) {
            if (sum == target) res++;
            return;
        }
        helper(nums, idx + 1, sum + nums[idx], target);
        helper(nums, idx + 1, sum - nums[idx], target);
    }
    // Best Solution
//    static{
//        for(int i=0; i < 100; i++){
//            findTargetSumWays(new int[]{1, 2, 3}, 3);
//        }
//    }
//    public static int findTargetSumWays(int[] nums, int target) {
//        int sum =0;
//        int zero = 0;
//        for(int num : nums){
//            sum += num;
//        }
//        int result = sum - Math.abs(target);
//        if(result < 0 ||(result & 1) == 1){
//            return 0;
//        }
//        int[] data = new int[(result >>= 1)+1];
//        data[0]++;
//        for(int num : nums){
//            if(num == 0){
//                zero++;
//                continue;
//            }
//            for(int j = result; j >= num ; j--){
//                data[j] +=  data[j-num];
//            }
//        }
//        return data[result] << zero;
//    }
    //Dynamic Programming
//    public int findTargetSumWays(int[] nums, int target) {
//        int totalSum = Arrays.stream(nums).sum();
//        int[] dp = new int[2 * totalSum + 1];
//
//        // Initialize the first row of the DP table
//        dp[nums[0] + totalSum] = 1; // Adding nums[0]
//        dp[-nums[0] + totalSum] += 1; // Subtracting nums[0]
//
//        // Fill the DP table
//        for (int index = 1; index < nums.length; index++) {
//            int[] next = new int[2 * totalSum + 1];
//            for (int sum = -totalSum; sum <= totalSum; sum++) {
//                if (dp[sum + totalSum] > 0) {
//                    next[sum + nums[index] + totalSum] += dp[sum + totalSum];
//                    next[sum - nums[index] + totalSum] += dp[sum + totalSum];
//                }
//            }
//            dp = next;
//        }
//
//        // Return the result if the target is within the valid range
//        return Math.abs(target) > totalSum ? 0 : dp[target + totalSum];
//    }
}
