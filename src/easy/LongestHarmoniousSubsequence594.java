package easy;

import java.util.Arrays;
import java.util.HashMap;

public class LongestHarmoniousSubsequence594 {
    public static int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for (int n : nums){
            int val = map.get(n)==null?0:map.get(n);
            int next = map.get(n+1)==null?0:map.get(n+1);
            int prev = map.get(n-1)==null?0:map.get(n-1);
            if(next!=0) max = Math.max(max,val+1+next);
            if(prev!=0) max = Math.max(max,val+1+prev);
            map.put(n,val+1);
        }
        if(max<=1) return 0;
        return max;
//       Best solution
//        Arrays.sort(nums);
//        int i = 0;
//        int j = 1;
//        int n = nums.length;
//        int maxSubseq = 0;
//        while(j < n) {
//            if(nums[j]-nums[i]==1) {
//                maxSubseq = Math.max(maxSubseq, j-i+1);
//                j++;
//            }
//            else if(nums[j]-nums[i]==0) {
//                j++;
//            }
//            else {
//                if(i == j) {
//                    j++;
//                }
//                i++;
//            }
//        }
//        return maxSubseq;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}
