package medium;

public class FindFirstAndLastPositionOfElementInSortedArray34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) {
                result[0] = searchLeft(nums,target,0,mid);
                result[1] = searchRight(nums,target,mid,nums.length-1);
                return result;
            }
            if(nums[mid] < target) {
                low = mid + 1;
            }
            if(nums[mid] > target) {
                high = mid - 1;
            }
        }
        return result;
    }

    public int searchLeft(int[] nums, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public int searchRight(int[] nums, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low-1;
    }

}
