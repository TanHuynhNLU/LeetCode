package easy;

import java.util.Arrays;

public class MakeTwoArraysEqualByReversingSubarrays1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if(target[i]!=arr[i]) return false;
        }
        return true;

//        int[] nums = new int[1001];
//        for(int i = 0; i < arr.length; i++){
//            nums[arr[i]]++;
//            nums[target[i]]--;
//        }
//
//        for(int i = 0; i < 1001; i++){
//            if(nums[i] != 0){
//                return false;
//            }
//        }
//        return true;
    }
}
