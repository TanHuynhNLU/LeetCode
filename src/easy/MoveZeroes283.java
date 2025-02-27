package easy;

import java.util.Arrays;

public class MoveZeroes283 {
    public static void moveZeroes(int[] nums) {
       int count =0;
       int n = 0;
       while (n<nums.length){
           if (nums[n]==0) {
               n++;
           }else {
               if (n != count) {
                   int tmp = nums[count];
                   nums[count] = nums[n];
                   nums[n] = tmp;
               }
               n++;
               count++;
           }
       }

//       Best solution
//        int index=0;
//        for (int num : nums){
//            if(num != 0){
//                nums[index] = num;
//                index++;
//            }
//        }
//
//        for (int i = index; i < nums.length; i++){
//            nums [index++] = 0;
//        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
