package medium;

import java.util.Arrays;

public class WiggleSortII324 {
    public void wiggleSort(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.sort(nums);
        int mid = (int) Math.ceil((double) nums.length / 2);

        int count = 1;
        for (int i = nums.length - 1; i >= mid; i--) {
            res[count] = nums[i];
            count += 2;
        }
        count = 0;
        for (int i = mid - 1; i >= 0; i--) {
            res[count] = nums[i];
            count += 2;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
    }

    // Best solution
//    public void wiggleSort(int[] nums) {
//        int[] count = new int[5001];
//        for (int num : nums)
//            count[num]++;
//
//        int index = 5000;
//        for (int i = 1; i < nums.length; i += 2) {
//            while (count[index] == 0) index--;
//            nums[i] = index;
//            count[index]--;
//        }
//
//        for (int i = 0; i < nums.length; i += 2) {
//            while (count[index] == 0) index--;
//            nums[i] = index;
//            count[index]--;
//        }
//    }
}
