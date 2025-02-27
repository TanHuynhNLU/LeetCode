package medium;

public class SearchInRotatedSortedArray33 {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public static int binarySearch(int[] nums, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            int left = -1;
            int right = -1;
            if (target >= nums[low] || target < nums[mid]) {
                left = binarySearch(nums, target, low, mid - 1);
            }
            if (target <= nums[high] || target > nums[mid]) {
                right = binarySearch(nums, target, mid + 1, high);
            }
            if (left != -1) return left;
            if (right != -1) return right;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        binarySearch(nums, 0, 0, nums.length - 1);
    }
}
