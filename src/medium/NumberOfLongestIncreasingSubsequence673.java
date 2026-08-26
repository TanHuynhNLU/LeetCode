package medium;

import java.util.Arrays;

public class NumberOfLongestIncreasingSubsequence673 {
    public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int[] counters = new int[nums.length];
        dp[0] = 1;
        Arrays.fill(counters, 1);
        int maxL = 1;
        for (int i = 1; i < nums.length; i++) {
            int max = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    if (max < dp[j] + 1) {
                        max = dp[j] + 1;
                        counters[i] = counters[j];
                    } else if (max == dp[j] + 1) {
                        counters[i] += counters[j];
                    }
                }
            }
            dp[i] = max;
            maxL = Math.max(maxL, max);
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i] == maxL) {
                res += counters[i];
            }
        }
        return res;
    }

    // Best solution
//    private int bSearchLength(int ele,List<int[]>[] dp,int right){
//        int left = 0;
//        while(left<right){
//            int mid = (right-left)/2 + left;
//            if(ele>dp[mid].get(dp[mid].size()-1)[0]) left = mid+1;
//            else right = mid;
//        }
//        return left;
//    }
//    private int bSearchIdx(List<int[]> t,int ele){
//        int left = 0,right = t.size()-1;;
//        while(left<right){
//            int mid = (right-left)/2 + left;
//            if(ele<=t.get(mid)[0]) left = mid+1;
//            else right = mid;
//        }
//        return left;
//    }
//    public int findNumberOfLIS(int[] nums) {
//        int n = nums.length;
//        if(n==1) return 1;
//        List<int[]>[] dp = new ArrayList[n];
//        for(int i=0;i<n;i++){
//            dp[i] = new ArrayList<>();
//        }
//
//        int len = 0;
//
//        for(int ele:nums){
//            int idx = bSearchLength(ele,dp,len);
//            int count = 1;
//
//            if(idx>0){
//                List<int[]> t = dp[idx-1];
//                int p = bSearchIdx(t,ele);
//                count = t.get(t.size()-1)[1] - (p==0 ? 0 : t.get(p-1)[1]);
//            }
//            if(dp[idx].size()==0){
//                dp[idx].add(new int[]{ele,count});
//                len++;
//            }else{
//                List<int[]> t = dp[idx];
//                int[] last = t.get(t.size()-1);
//                if(last[0]==ele){
//                    last[1] += count;
//                }else{
//                    t.add(new int[]{ele,last[1]+count});
//                }
//            }
//        }
//
//        return dp[len-1].get(dp[len-1].size()-1)[1];
//    }
}
