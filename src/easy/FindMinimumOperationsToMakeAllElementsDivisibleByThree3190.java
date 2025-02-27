package easy;

public class FindMinimumOperationsToMakeAllElementsDivisibleByThree3190 {
    public int minimumOperations(int[] nums) {
        int res = 0;
        for(int num : nums){
            if(num % 3 !=0) res++;
        }
        return res;
    }
}
