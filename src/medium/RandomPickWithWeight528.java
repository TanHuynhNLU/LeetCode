package medium;

import java.util.Random;

public class RandomPickWithWeight528 {
    private Random rd;
    private int[] prefixSum;
    private int[] w;

    public RandomPickWithWeight528(int[] w) {
        this.w = w;
        this.prefixSum = new int[w.length];
        rd = new Random();
        init(w);
    }

    public void init(int[] w) {
        int sum = 0;
        for (int i = 0; i < prefixSum.length; i++) {
            sum += w[i];
            prefixSum[i] = sum;
        }
    }

    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else return mid;
        }
        return left;
    }

    public int pickIndex() {
        int value = rd.nextInt(prefixSum[prefixSum.length - 1]) + 1;
        return binarySearch(prefixSum, value);
    }
}

//Best Solution
//class Solution {
//
//    int[] w;
//    int index = 0;
//    int value = 0;
//
//    public Solution(int[] w) {
//        double total = 0.0;
//        for (int val : w) {
//            total += val;
//        }
//        for (int i = 0; i < w.length; i++) {
//            int prop = (int) Math.ceil((w[i] / total) * 100);
//            w[i] = prop;
//        }
//        this.w = w;
//    }
//
//    public int pickIndex() {
//        int result = index;
//        ++value;
//        if (w[result] == value) {
//            index++;
//            value = 0;
//            if (index == w.length) {
//                index = 0;
//            }
//        }
//        return result;
//    }
//}
