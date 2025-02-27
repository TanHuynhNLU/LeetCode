package easy;

import java.util.Arrays;

public class SpecialArrayWithXElements1608 {
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int x = nums.length - i;
            int prevNum = i>0?nums[i-1]:0;
                if (x <= nums[i] && x > prevNum) return x;

        }
        return -1;
    }

//    Best solution
//int length = nums.length;
//    int[] toAnswer = new int[length+1];
//        for (int num : nums) {
//        if (num >= length) toAnswer[length]++;
//        else toAnswer[num]++;
//    }
//
//    int count = 0;
//
//        for (int i = length; i > 0; i--) {
//        count += toAnswer[i];
//        if (count == i) return i;
//    }
//        return -1;

    public static void main(String[] args) {
        int[] nums = {3, 6, 7, 7, 0};
        specialArray(nums);
    }
}
