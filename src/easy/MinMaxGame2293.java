package easy;

public class MinMaxGame2293 {
    public int minMaxGame(int[] nums) {
        while (nums.length > 1) {
            int[] newNums = new int[nums.length / 2];
            for (int i = 0; i < newNums.length; i++) {
                if (i % 2 == 0) {
                    newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            nums = newNums;
        }
        return nums[0];
    }
    //    Best Solution
//    public int minMaxGame(int[] nums) {
//        int n = nums.length;
//        while (n > 1) {
//            fun(nums, n);
//            n /= 2;
//        }
//
//        return nums[0];
//
//    }
//
//    private void fun(int arr[], int n) {
//        int idx = 0;
//        for (int i = 0; i < n; i += 2) {
//            if (idx % 2 == 0)
//                arr[idx++] = Math.min(arr[i], arr[i + 1]);
//            else
//                arr[idx++] = Math.max(arr[i], arr[i + 1]);
//        }
//    }
}
