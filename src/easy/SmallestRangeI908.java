package easy;

public class SmallestRangeI908 {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min,nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max,nums[i]);
        }
        min+=k;
        max-=k;
        return (max-min)>0?max-min:0;
    }
}
