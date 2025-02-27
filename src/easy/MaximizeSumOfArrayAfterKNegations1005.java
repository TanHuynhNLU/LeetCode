package easy;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations1005 {
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && count < k) {
                nums[i] = -nums[i];
                count++;
            } else break;
        }
        if (count < k) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if ((k - count) % 2 != 0) nums[i] = -nums[i];
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
//      Best Solution
//        int n = nums.length;
//        quickSort(nums,0,n - 1);
//        int i = 0;
//        while(i < n && nums[i] < 0 && k > 0){
//            k--;
//            nums[i++] *= -1;
//        }
//        int ans = 0;
//        int min = Integer.MAX_VALUE;
//        for(int j : nums){
//            ans += j;
//            min = Math.min(min,j);
//        }
//        if((k & 1) != 0) ans -= 2 * min;
//        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,-1,0,2};
        System.out.println(largestSumAfterKNegations(nums,3));
    }
}
