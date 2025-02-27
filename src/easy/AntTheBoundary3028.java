package easy;

public class AntTheBoundary3028 {
    public int returnToBoundaryCount(int[] nums) {
        int start = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            start += nums[i];
            if (start == 0) res++;
        }
        return res;
    }
}
