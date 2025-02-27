package medium;

import java.util.Arrays;
import java.util.HashMap;

public class NextPermutation31 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        for (; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                int j = nums.length - 1;
                while (j>i) {
                    if (nums[j]>nums[i]) {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        reverseArray(nums, i + 1, nums.length-1);
                        return;
                    }
                   j--;
                }
            }
        }
        reverseArray(nums,0,nums.length-1);
    }

    public void reverseArray(int[] arr , int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;

            right--;
        }
    }

    //    Best solution
//    static void reverse(int[] arr, int i, int j) {
//        int temp;
//        while (i < j) {
//            temp = arr[j];
//            arr[j] = arr[i];
//            arr[i] = temp;
//            i++;
//            j--;
//        }
//    }
//
//    public void nextPermutation(int[] nums) {
//        int n = nums.length - 1;
//        int index = -1;
//
//        for (int i = n - 1; i >= 0; i--) {
//            if (nums[i] < nums[i + 1]) {
//                int j = n;
//                while (j <= n) {
//                    if (nums[j] > 0 && nums[i] < nums[j]) {
//                        int temp = nums[j];
//                        nums[j] = nums[i];
//                        nums[i] = temp;
//                        break;
//                    }
//                    j--;
//                }
//                index = i + 1;
//                break;
//            }
//
//        }
//        if (index == -1) {
//            reverse(nums, 0, n);
//        } else {
//            reverse(nums, index, n);
//        }
//
//    }
}
