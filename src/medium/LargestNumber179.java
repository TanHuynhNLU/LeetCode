package medium;

public class LargestNumber179 {
    public String largestNumber(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        StringBuilder sb = new StringBuilder();
        boolean isZero = true;
        for (int num : nums) {
            if (num != 0) isZero = false;
            sb.append(num);
        }
        if (isZero) return "";
        return sb.toString();
    }

    public void quickSort(int[] nums, int start, int end) {
        if (end <= start) return;
        int pivot = partition(nums, start, end);
        quickSort(nums, start, pivot - 1);
        quickSort(nums, pivot + 1, end);
    }

    public int partition(int[] nums, int start, int end) {
        int i = start - 1;
        int pivot = nums[end];
        for (int j = start; j < end; j++) {
            String s1 = String.valueOf(nums[j]) + pivot;
            String s2 = pivot + String.valueOf(nums[j]);
            if (s1.compareTo(s2) > 0) swap(nums, ++i, j);
        }
        swap(nums, ++i, end);
        return i;
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    // Best Solution
//    public String largestNumber(int[] nums) {
//        if (nums == null || nums.length == 0)
//            return "";
//
//        quickSort(nums, 0, nums.length - 1);
//        if (nums[0] == 0)
//            return "0";
//
//        StringBuilder sb = new StringBuilder();
//        for (int n : nums)
//            sb.append(n);
//
//        return sb.toString();
//    }
//
//    public void quickSort(int[] nums, int start, int end) {
//        if (start >= end)
//            return;
//
//        int pivot = nums[start];
//        int index = start;
//        for (int i = start + 1; i <= end; i++) {
//            long x = 10;
//            long y = 10;
//            while (nums[i] >= x) {
//                x *= 10;
//            }
//
//            while (pivot >= y) {
//                y *= 10;
//            }
//
//            if (nums[i] * y + pivot > nums[i] + pivot * x) {
//                index += 1;
//                swap(nums, index, i);
//            }
//        }
//        swap(nums, index, start);
//        quickSort(nums, start, index - 1);
//        quickSort(nums, index + 1, end);
//    }
//
//    public void swap(int[] nums, int i, int j) {
//        int t = nums[i];
//        nums[i] = nums[j];
//        nums[j] = t;
//    }
}
