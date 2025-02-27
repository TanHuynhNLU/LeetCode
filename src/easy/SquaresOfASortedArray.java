package easy;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        int index = nums.length-1;
        while (start<=end&&index>=0){
            if(Math.abs(nums[start])<nums[end]){
                res[index] = nums[end] * nums[end];
                end--;
            }else {
                res[index] = nums[start] * nums[start];
                start++;
            }
            index--;
        }
        return res;
    }
}
