package easy;

public class ConcaterationOfArray1929 {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }

    //    Best solution
//    public int[] getConcatenation(int[] nums) {
//        int n = nums.length;
//        int[] ans = new int[2 * n];
//        System.arraycopy(nums, 0, ans, 0, n);
//        System.arraycopy(nums, 0, ans, n, n);
//        return ans;
//    }
}
