package easy;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParityII922 {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] % 2 != 0) odds.add(i);
        }

        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] == 0 || nums[i] % 2 == 0) evens.add(i);
        }
        for (int i = 0; i < odds.size(); i++) {
            int tmp = nums[odds.get(i)];
            nums[odds.get(i)]=nums[evens.get(i)];
            nums[evens.get(i)] = tmp;
        }
        return nums;
    }
//    Best solution
//int[] arr=new int[nums.length];
//    int placeEven=0;
//    int placeOdd=1;
//        for (int i = 0; i < nums.length; i++) {
//        if(nums[i]%2==0){
//            arr[placeEven]=nums[i];
//            placeEven+=2;
//        }else{
//            arr[placeOdd]=nums[i];
//            placeOdd+=2;
//        }
//    }
//        return arr;
}
