package easy;

import java.util.Arrays;
import java.util.Collections;

public class MaximumProductOfThreeNumber628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int p1 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        if(nums[0]<0&&nums[1]<0){
            int p2 = nums[0]*nums[1]*nums[nums.length-1];
            return Math.max(p1,p2);
        }else {
           return p1;
        }
//        Best solution
//        if (nums.length == 3) {
//            return nums[0] * nums[1] * nums[2];
//        }
//
//        int max1 = Integer.MIN_VALUE;
//        int max2 = Integer.MIN_VALUE;
//        int max3 = Integer.MIN_VALUE;
//        int min1 = Integer.MAX_VALUE;
//        int min2 = Integer.MAX_VALUE;
//
//        for (int num : nums) {
//            if (num > max3) {
//                if (num > max1) {
//                    max3 = max2;
//                    max2 = max1;
//                    max1 = num;
//                } else if (num > max2) {
//                    max3 = max2;
//                    max2 = num;
//                } else {
//                    max3 = num;
//                }
//            }
//            if (num < min2) {
//                if (num < min1) {
//                    min2 = min1;
//                    min1 = num;
//                } else {
//                    min2 = num;
//                }
//            }
//        }
//        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
