package easy;

public class NumberOfGoodPairs1512 {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        int[] counts = new int[101];
        for (int i = 0; i < nums.length; i++) {
            if(counts[nums[i]]==0) counts[nums[i]]++;
            else {
                res+=counts[nums[i]];
                counts[nums[i]]++;
            }
        }
        return res;
    }
}
