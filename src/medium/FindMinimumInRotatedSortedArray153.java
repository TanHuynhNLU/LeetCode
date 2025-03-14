package medium;

public class FindMinimumInRotatedSortedArray153 {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = nums[n - 1];
        if (nums[0] < nums[n - 1]) {
            return nums[0];
        } else {
            for (int i = n - 2; i >= 0; i--) {
                if (nums[i] < min) min = nums[i];
                else return min;
            }
        }
        return min;
    }

    //Binary Search Solution
//    public int findMin(int[] nums) {
//        int start = 0;
//        int last = nums.length - 1;
//
//        while (start < last) {
//            int mid = start + (last - start) / 2;
//            if (nums[mid] > nums[last]) {
//                start = mid + 1;
//            } else {
//                last = mid;
//            }
//        }
//        return nums[start];
//    }
}
