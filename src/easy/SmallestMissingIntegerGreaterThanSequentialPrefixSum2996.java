package easy;

public class SmallestMissingIntegerGreaterThanSequentialPrefixSum2996 {
    public int missingInteger(int[] nums) {
        int[] counters = new int[51];
        int res = nums[0];
        int sum =nums[0];
        for (int i = 0; i < nums.length; i++) {
            counters[nums[i]]++;
        }
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]+1) sum+=nums[i];
            else break;
        }
        res = Math.max(res,sum);
        while (res<51&&counters[res]!=0) res++;
        return res;
    }
}
