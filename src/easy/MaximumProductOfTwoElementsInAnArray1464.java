package easy;

import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray1464 {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
//        Best solution
//        int max=0;
//        int smax=0;
//        for(int i=0;i<nums.length;i++){
//            if(max<nums[i]){
//                smax=max;
//                max=nums[i];
//
//            }else if(smax<nums[i]){
//                smax=nums[i];
//
//            }
//        }
//        int ans=(smax-1)*(max-1);
//        return ans;
    }
}
