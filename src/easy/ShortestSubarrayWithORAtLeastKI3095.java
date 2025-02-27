package easy;

public class ShortestSubarrayWithORAtLeastKI3095 {
    public static int minimumSubarrayLength(int[] nums, int k) {
        for (int i = 1; i <= nums.length; i++) {
            int res = slidingWindow(nums, i, k);
            if (res != -1) return i;
        }
        return -1;
    }

    public static int slidingWindow(int[] nums, int size, int k) {
        for (int i = 0; i < nums.length - size + 1; i++) {
            int calc = 0;
            for (int j = i; j < i + size; j++) {
                calc |= nums[j];
            }
            if (calc >= k) return calc;
        }
        return -1;
    }

    //    Best Solution
//    public int minimumSubarrayLength(int[] nums, int k) {
//        int n = nums.length;
//        int ans = Integer.MAX_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            int val = 0;
//
//            for (int j = i; j < n; j++) {
//                if (nums[j] >= k) return 1;
//                val |= nums[j];
//
//                if (val >= k) {
//                    ans = Math.min(ans, j - i + 1);
//                    break;
//                }
//            }
//        }
//
//        return ans == Integer.MAX_VALUE ? -1 : ans;
//
//    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        System.out.println(minimumSubarrayLength(nums, 2));
    }
}
