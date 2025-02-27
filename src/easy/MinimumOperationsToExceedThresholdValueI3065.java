package easy;

public class MinimumOperationsToExceedThresholdValueI3065 {
    public int minOperations(int[] nums, int k) {
        int res =0;
        for(int n: nums){
            if(n<k) res++;
        }
        return res;
    }
}
