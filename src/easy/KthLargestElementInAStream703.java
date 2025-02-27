package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class KthLargestElementInAStream703 {
    public int[] nums;
    public int k;

    public KthLargestElementInAStream703(int k, int[] nums) {
       this.nums = new int[k];
       this.k = k;
       Arrays.fill(this.nums,Integer.MIN_VALUE);
        for (int i = 0; i < nums.length ; i++) {
            add(nums[i]);
        }
    }

    public int add(int val) {
        for (int i = 0; i <nums.length ; i++) {
            if(val>nums[i]){
                for (int j = nums.length-1; j >=i+1 ; j--) {
                    nums[j]=nums[j-1];
                }
                nums[i] = val;
                break;
            }
        }
        return nums[k-1];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        KthLargestElementInAStream703 test = new KthLargestElementInAStream703(3, nums);
        System.out.println(test.add(3));
        System.out.println(test.add(5));
        System.out.println(test.add(10));
        System.out.println(test.add(9));
        System.out.println(test.add(4));
    }
}
