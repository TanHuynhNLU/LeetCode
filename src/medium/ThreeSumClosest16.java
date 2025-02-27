package medium;

import java.util.Arrays;

public class ThreeSumClosest16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == target) return sum;
                    if (sum > target && Math.abs(sum - target) > minDiff) break;
                    if (Math.abs(sum - target) < minDiff) {
                        minDiff = Math.abs(sum - target);
                        res = sum;
                    }
                }
            }
        }
        return res;
    }

    //Popular solution
//    public int threeSumClosest(int[] nums, int target) {
//        Arrays.sort(nums);
//        int closestSum = nums[0] + nums[1] + nums[2];
//
//        for (int i = 0; i < nums.length - 2; i++) {
//            int left = i + 1, right = nums.length - 1;
//            while (left < right) {
//                int currentSum = nums[i] + nums[left] + nums[right];
//                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
//                    closestSum = currentSum;
//                }
//                if (currentSum < target) {
//                    left++;
//                } else if (currentSum > target) {
//                    right--;
//                } else {
//                    return currentSum;
//                }
//            }
//        }
//        return closestSum;
//    }

    public static void main(String[] args) {
        threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
    }
}
