package easy;

import java.util.Arrays;

public class MinimumAverageOfSmallestAndLargestElements3194 {
    public double minimumAverage(int[] nums) {
        double res = 51;
        Arrays.sort(nums);
        int i =0;
        int j = nums.length-1;
        while(i<j){
            double avg = (double)(nums[i]+nums[j])/2;
            res = Math.min(res,avg);
            i++;
            j--;
        }
        return res;
    }
}
