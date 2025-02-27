package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNon_IncreasingOrder {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int sum1 = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            res.add(nums[i]);
            sum1 += nums[i];
            sum -= nums[i];
            if (sum1 > sum) return res;
        }
        return res;
//        Best solution
//        int[] backup_freq = new int[101];
//        List<Integer> l = new ArrayList<Integer>();
//        int sum=0,r=0;
//        for(int n: nums){
//            backup_freq[n]++;
//            sum+=n;
//        }
//
//        for(int i=100; i>=0; i--){
//            if(backup_freq[i]>0){
//                int count=backup_freq[i];
//                while(count>0){
//                    if(r>sum)   return l;
//                    l.add(i);
//                    r+=i;
//                    sum-=i;
//                    count--;
//                }
//            }
//        }
//
//        return l;
    }
}
