package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset368 {
    // Dynamic Programming
//    public static List<Integer> largestDivisibleSubset(int[] nums) {
//        Arrays.sort(nums);
//        int[] dp = new int[nums.length];
//        int[] prev = new int[nums.length];
//        int maxi = 0;
//
//        Arrays.fill(dp, 1);
//        Arrays.fill(prev, -1);
//        for (int i = 1; i < nums.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (nums[i] % nums[j] == 0 && dp[i] <= dp[j]) {
//                    dp[i] = dp[j] + 1;
//                    prev[i] = j;
//                }
//            }
//            if (dp[i] > dp[maxi]) maxi = i;
//        }
//        List<Integer> res = new ArrayList<>();
//        while (maxi != -1) {
//            res.add(nums[maxi]);
//            maxi = prev[maxi];
//        }
//        return res;
//    }
}
