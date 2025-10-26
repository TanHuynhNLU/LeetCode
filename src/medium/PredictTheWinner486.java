package medium;

public class PredictTheWinner486 {
    public boolean predictTheWinner(int[] nums) {
        return helper(nums,0,nums.length-1,0,0,true);
    }

    public boolean helper(int[] nums, int left, int right, int sum1, int sum2, boolean isP1Turn) {
        if (left > right) return sum1 >= sum2;
        if (isP1Turn) {
            return helper(nums, left + 1, right, sum1 + nums[left], sum2, false)
                    || helper(nums, left, right - 1, sum1 + nums[right], sum2, false);
        } else {
            return helper(nums, left + 1, right, sum1, sum2 + nums[left], true)
                    && helper(nums, left, right - 1, sum1, sum2 + nums[right], true);
        }
    }

    //Best Solution
//    public boolean predictTheWinner(int[] nums) {
//        int sum=0;
//        for(int i : nums){
//            sum+=i;
//        }
//        int dp[][]= new int [nums.length][nums.length];
//        for(int i[] : dp){
//            Arrays.fill(i,-1);
//        }
//        int player1 = helper(nums,0,nums.length-1,dp);
//        int player2 = sum - player1;
//        if(player1>=player2){
//            return true;
//        }
//        return false;
//    }
//
//    public int helper(int nums[],int i,int j,int dp[][]){
//        if(i>j){
//            return 0;
//        }
//
//        if(dp[i][j]!=-1){
//            return dp[i][j];
//        }
//        int left = nums[i]+Math.min(helper(nums,i+2,j,dp),helper(nums,i+1,j-1,dp));
//        int right = nums[j]+Math.min(helper(nums,i+1,j-1,dp),helper(nums,i,j-2,dp));
//
//        return dp[i][j]=Math.max(left,right);
//    }
}
