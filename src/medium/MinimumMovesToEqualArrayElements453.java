package medium;

public class MinimumMovesToEqualArrayElements453 {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(num, min);
        }
        int res = 0;
        for (int num : nums) {
            res += num - min;
        }
        return res;
    }

    //Best solution
//    static {
//        int[] n = {1, 2, 1};
//        for (int i = 0; i < 250; i++) minMoves(n);
//    }
//
//    public static int minMoves(int[] nums) {
//        int sum = 0;
//        int min = Integer.MAX_VALUE;
//        for (int i : nums) {
//            sum += i;
//            if (i < min) min = i;
//        }
//        return sum - nums.length * min;
//    }
}
