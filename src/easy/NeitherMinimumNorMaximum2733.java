package easy;

public class NeitherMinimumNorMaximum2733 {
    public static int findNonMinOrMax(int[] nums) {
        if (nums.length <= 2) return -1;
        int max = 0;
        int min = 101;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        for (int num : nums) {
            if (num != max && num != min)
                return num;
        }
        return -1;
    }

    //    Best Solution
//    public int findNonMinOrMax(int[] nums) {
//        if (nums.length < 3) return -1;
//
//        int a = Math.max(nums[0], nums[1]);
//        int b = Math.min(nums[0], nums[1]);
//        int c = nums[2];
//
//        if (c < a && c > b) return c;
//        if (c < b) return b;
//        if (c > a) return a;
//
//        return -1;
//    }

    public static void main(String[] args) {
        int[] nums = {3, 30, 24};
        findNonMinOrMax(nums);
    }
}
