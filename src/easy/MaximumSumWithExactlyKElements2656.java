package easy;

public class MaximumSumWithExactlyKElements2656 {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        for(int num: nums){
            max = Math.max(max, num);
        }
        return max*k+(int)(((double)(k)/2)*(k-1));
    }
}
