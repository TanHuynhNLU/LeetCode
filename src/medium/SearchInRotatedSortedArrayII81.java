package medium;

public class SearchInRotatedSortedArrayII81 {
    public boolean search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public boolean binarySearch(int[] nums, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            boolean searchLeft = false;
            boolean searchRight = false;
            if (nums[mid] == target) {
                return true;
            }
            if (target < nums[mid] || target >= nums[low])
                searchLeft = binarySearch(nums, target, low, mid - 1);
            if (target > nums[mid] || target <= nums[high])
                searchRight = binarySearch(nums, target, mid + 1, high);
            if (searchLeft || searchRight) return true;
        }
        return false;
    }
}
