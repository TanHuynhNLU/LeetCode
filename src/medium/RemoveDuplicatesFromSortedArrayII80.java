package medium;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII80 {
    public int removeDuplicates(int[] nums) {
        int res = nums.length;
        int prev = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != prev) {
                count = 1;
                prev = nums[i];
            } else {
                count++;
                if (count >= 3) {
                    nums[i] = Integer.MAX_VALUE;
                    res--;
                }
            }
        }
        Arrays.sort(nums);
        return res;
    }

    //    Best Solution
//    public int removeDuplicates(int[] nums) {
//        if (nums.length < 2) {
//            return 1;
//        }
//        int i = 2;
//        for (int j = i; j < nums.length; j++) {
//            if (nums[j] != nums[i - 2]) {
//                nums[i] = nums[j];
//                i++;
//            }
//        }
//        return i;
//    }
}
