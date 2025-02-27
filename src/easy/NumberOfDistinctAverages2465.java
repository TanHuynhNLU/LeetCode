package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAverages2465 {
    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int i= 0;
        int j = nums.length-1;
        Set<Double> set = new HashSet<>();
        while(i<j){
            double avg = (double) (nums[i]+nums[j])/2;
            if(!set.contains(avg)){
                count++;
                set.add(avg);
            }
            i++;
            j--;
        }
        return count;
    }

    public static void main(String[] args) {
        distinctAverages(new int[]{9,5,7,8,7,9,8,2,0,7});
    }
}
