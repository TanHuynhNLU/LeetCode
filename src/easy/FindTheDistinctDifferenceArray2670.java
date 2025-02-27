package easy;

import java.util.Arrays;

public class FindTheDistinctDifferenceArray2670 {
    public static int[] distinctDifferenceArray(int[] nums) {
        int[] count = new int[51];
        int[] diff1 = new int[nums.length];
        int[] diff2 = new int[nums.length];
        int[] res = new int[nums.length];
        int c = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (count[nums[i]] == 0) {
                c++;
            }
            diff1[i] = c;
            count[nums[i]]++;
        }
        Arrays.fill(count, 0);
        c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count[nums[i]] == 0) {
                c++;
            }
            diff2[i] = c;
            count[nums[i]]++;
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            int end = i == nums.length - 1 ? 0 : diff1[i + 1];
            int start = diff2[i];
            res[i] = start - end;
        }
        return res;
    }

    //    Best Solution
//    public int[] distinctDifferenceArray(int[] nums) {
//        int n = nums.length;
//        int[] result = new int[n];
//        int[] prefix = new int[n];
//        boolean[] prefixSeen = new boolean[51];  // Assuming nums[i] is between 1 and 50
//        boolean[] suffixSeen = new boolean[51];
//        int prefixCount = 0, suffixCount = 0;
//        for (int i = 0; i < n; i++) {
//            if (!prefixSeen[nums[i]]) {
//                prefixCount++;
//                prefixSeen[nums[i]] = true;
//            }
//            prefix[i] = prefixCount;
//        }
//
//        for (int i = n - 1; i >= 0; i--) {
//            result[i] = prefix[i] - suffixCount;
//            if (!suffixSeen[nums[i]]) {
//                suffixCount++;
//                suffixSeen[nums[i]] = true;
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 4, 2};
        distinctDifferenceArray(nums);
    }
}
