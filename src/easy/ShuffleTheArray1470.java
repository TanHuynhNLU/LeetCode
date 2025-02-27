package easy;

public class ShuffleTheArray1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int count=0;
        for (int i = 0; i < nums.length/2; i++) {
            res[count++]=nums[i];
            res[count++] = nums[n++];
        }
        return res;
    }


}
