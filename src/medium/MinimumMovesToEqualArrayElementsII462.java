package medium;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsII462 {
    public int minMoves2(int[] nums) {
        int res = 0;
        int l = nums.length;
        Arrays.sort(nums);
        int median = 0;
        if (nums.length % 2 == 0) {
            median = (nums[l / 2 - 1] + nums[l / 2]) / 2;
        } else median = nums[l / 2];
        for (int num : nums) {
            res += Math.abs(num - median);
        }
        return res;
    }

    //Best solution
//    public int minMoves2(int[] nums) {
//        int median = findKth(nums, 0, nums.length - 1, nums.length >> 1);
//        int minMoves = 0;
//        for (int num : nums) {
//            minMoves += Math.abs(num - median);
//        }
//
//        return minMoves;
//    }
//
//    private int findKth(int[] arr, int l, int r, int k) {
//        while (l < r) {
//            int p = partition(arr, l, r);
//            if (p < k) {
//                l = p + 1;
//            } else {
//                r = p;
//            }
//        }
//        return arr[l];
//    }
//
//    private int partition(int[] arr, int l, int r) {
//        int mid = (l + r) / 2;
//        if (arr[mid] < arr[l]) {
//            swap(arr, mid, l);
//        }
//        if (arr[l] > arr[r]) {
//            swap(arr, l, r);
//        }
//        if (arr[mid] > arr[r]) {
//            swap(arr, mid, r);
//        }
//        int p = arr[mid], i = l - 1, j = r + 1;
//        while (true) {
//            do {
//                i++;
//            } while (arr[i] < p);
//
//            do {
//                j--;
//            } while (p < arr[j]);
//
//            if (i < j) {
//                swap(arr, i, j);
//            } else {
//                return j;
//            }
//        }
//    }
//
//    private void swap(int[] arr, int i, int j) {
//        int tmp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = tmp;
//    }
}
