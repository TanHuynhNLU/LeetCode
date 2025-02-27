package easy;

import java.util.List;

public class MinimumPositiveSumSubarray3364 {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res = Integer.MAX_VALUE;
        int[] arr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            arr[i] = nums.get(i);
        }
        for (int i = l; i <= r; i++) {
            res = Math.min(res, slidingSumSubarray(arr, i));
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public int slidingSumSubarray(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k && i < arr.length; i++) {
            sum += arr[i];
        }
        int res = sum > 0 ? sum : Integer.MAX_VALUE;
        for (int i = 1; i <= arr.length - k; i++) {
            sum -= arr[i - 1];
            sum += arr[i + k - 1];
            if (sum > 0) res = Math.min(res, sum);
        }
        return res;
    }

    //    Best Solution
//    int result = Integer.MAX_VALUE;
//    boolean found = false;
//
//    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
//        int n = nums.size();
//        int[] prefixSum = new int[n + 1];
//
//        for (int i = 0; i < n; i++) {
//            prefixSum[i + 1] = prefixSum[i] + nums.get(i);
//        }
//
//        for (int ind = 0; ind < n; ind++) {
//            for (int size = l; size <= r; size++) {
//                int end = ind + size - 1;
//
//                if (end >= n) {
//                    break;
//                }
//                int sum = prefixSum[end + 1] - prefixSum[ind];
//                if (sum > 0) {
//                    found = true;
//                    result = Math.min(result, sum);
//                }
//            }
//        }
//
//        if (found)
//            return result;
//        else
//            return -1;
//    }
}
