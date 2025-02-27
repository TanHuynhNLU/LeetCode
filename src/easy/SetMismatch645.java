package easy;

public class SetMismatch645 {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int[] counts = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            if(counts[nums[i]]++==1) {
                res[0] = nums[i];
            }
        }
        for (int i = 1; i <counts.length ; i++) {
            if(counts[i]==0){
                res[1] =i;
                return res;
            }
        }
        return res;

    }
}
