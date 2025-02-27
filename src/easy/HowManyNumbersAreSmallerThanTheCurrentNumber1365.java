package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class HowManyNumbersAreSmallerThanTheCurrentNumber1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int min = 101;
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i],min);
            max = Math.max(nums[i],max);
        }
        int[] counts = new int[max-min+1];
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i] - min]++;
        }
        for (int i = 0; i < nums.length ; i++) {
            int count = 0;
            for (int j = 0; j < nums[i]-min; j++) {
                count+=counts[j];
            }
            nums[i] = count;
        }
        return nums;
//        Best solution
//        int[] frequency = new int[101];
//        int[] ans = new int[nums.length];
//
//        for(int i=0; i<nums.length; i++)
//            frequency[nums[i]]++;
//
//        int prev = 0;
//        int curr = 0;
//
//        for(int i=0; i<=100; i++)
//        {
//            if(frequency[i]>0)
//            {
//                curr = frequency[i];
//                frequency[i] = prev;
//                prev +=curr;
//
//            }
//        }
//
//        for(int i=0; i<nums.length; i++)
//        {
//            ans[i] = frequency[nums[i]];
//        }
//        return ans;
    }
}
