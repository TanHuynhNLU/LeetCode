package easy;

import java.util.Arrays;
import java.util.Collections;

public class LargestPerimeterTriangle976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
           int a = nums[i];
           int b = nums[i-1];
           int c = nums[i-2];
           if(b+c>a) return a+b+c;
        }
        return 0;
    }
//    Best solution
//public static int max(int[] arr,int start,int end){
//    int max = 0;
//    for(int i = start; i <= end; i++) {
//        if(arr[max] < arr[i]) {
//            max = i;
//        }
//    }
//    return max;
//}
//    public void swap(int[] nums,int a,int b){
//        int temp=nums[a];
//        nums[a]=nums[b];
//        nums[b]=temp;
//    }
//
//    public int largestPerimeter(int[] nums) {
//        int count=1;
//        int side1=0;
//        int side2=0;
//        int side3=0;
//        for(int i=0;i<nums.length;i++){
//            int lastIdx=nums.length-1-i;
//            int maxIdx=max(nums,0,lastIdx);
//            if(count==1){
//                side1=nums[maxIdx];
//                count++;
//            }
//            else if(count==2){
//                side2=nums[maxIdx];
//                count++;
//            }
//            else if(count>=3){
//                side3=nums[maxIdx];
//                count++;
//
//            }
//
//
//            if(side2+side3>side1){
//
//
//                return side1+side2+side3;
//            }
//            else if(count>3){
//                side1=side2;
//                side2=side3;
//
//            }
//            swap(nums,maxIdx,lastIdx);
//
//
//
//        }
//        return 0;
//
//
//    }
}
