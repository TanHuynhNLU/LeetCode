package medium;

public class FindPeakElement162 {
    int res = -1;

    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        binarySearch(nums, 0, nums.length - 1);
        return res;
    }

    public void binarySearch(int[] nums, int left, int right) {
        if (res != -1 || left > right) return;
        int mid = left + (right - left) / 2;
        if (mid > 0 && mid < nums.length - 1 && nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
            res = mid;
        } else if (mid == 0 && nums[mid] > nums[mid + 1]) {
            res = mid;
        } else if (mid == nums.length - 1 && nums[mid] > nums[mid - 1]) {
            res = mid;
        } else {
            binarySearch(nums, left, mid - 1);
            binarySearch(nums, mid + 1, right);
        }
    }

    // Best Solution
//    public int findPeakElement(int[] nums) {
//        int left = 0;
//        int right = nums.length - 1;
//
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] > nums[mid + 1]) {
//                right = mid;
//            } else {
//                left = mid + 1;
//            }
//        }
//
//        return left;
//    }
}
