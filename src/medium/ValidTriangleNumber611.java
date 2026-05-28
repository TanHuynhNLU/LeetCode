package medium;

import java.util.Arrays;

public class ValidTriangleNumber611 {
    public int triangleNumber(int[] nums) {
        int count = 0;
        if (nums.length < 3) return 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] > nums[k]) count++;
                    else break;
                }
            }
        }
        return count;
    }

    //Solution 1
//    public int triangleNumber(int[] nums) {
//        Arrays.sort(nums); // sort the array first
//        int n = nums.length;
//        int count = 0;
//
//        // fix the largest side nums[i]
//        for (int i = n - 1; i >= 2; i--) {
//            int left = 0;
//            int right = i - 1;
//
//            // use two pointers to find valid pairs
//            while (left < right) {
//                if (nums[left] + nums[right] > nums[i]) {
//                    // all pairs between left and right are valid
//                    count += right - left;
//                    right--;
//                } else {
//                    left++;
//                }
//            }
//        }
//
//        return count;
//    }
    // Best solution
//    public int triangleNumber(int[] nums) {
//        int n;
//        int max = 0;
//        int[] count = new int[1001];
//        for (int i : nums) {
//            count[i]++;
//            max = Math.max(max, i);
//        }
//        count[0] = 0;
//        int idx = 0;
//        for (int i = 1; i <= max; ++i) {
//            for (int j = 0; j < count[i]; ++j, ++idx) {
//                nums[idx] = i;
//            }
//            count[i] += count[i - 1];
//        }
//        n = idx;
//        int r = 0;
//        for (int i = 0; i < n - 2; ++i) {
//            for (int j = i + 1; j < n - 1; ++j) {
//                if (nums[i] + nums[j] > max) {
//                    r += (n - j) * (n - j - 1) / 2;
//                    break;
//                }
//                r += count[nums[i] + nums[j] - 1] - j - 1;
//            }
//        }
//        return r;
//    }
}
