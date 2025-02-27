package easy;

public class DivideArrayIntoEqualPairs2206 {
    public boolean divideArray(int[] nums) {
        int[] counts = new int[501];
        for(int num : nums){
            counts[num]++;
        }
        for(int num : counts){
            if(num%2!=0) return false;
        }
        return true;
    }
}
