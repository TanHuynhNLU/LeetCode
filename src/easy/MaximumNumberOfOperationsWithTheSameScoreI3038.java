package easy;

public class MaximumNumberOfOperationsWithTheSameScoreI3038 {
    public int maxOperations(int[] nums) {
        int n = nums.length % 2 == 0 ? nums.length - 1 : nums.length - 2;
        int sum=nums[0]+nums[1];
        int res=1;
        for (int i = 2; i < n; i+=2) {
            if(nums[i]+nums[i+1]!=sum)break;
            else res++;
        }
        return res;
    }
}
