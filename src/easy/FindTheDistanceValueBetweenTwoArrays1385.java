package easy;

import java.util.Arrays;
import java.util.Map;

public class FindTheDistanceValueBetweenTwoArrays1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            int minD = minDistance(arr2, arr1[i]);
            if (minD > d) count++;
        }
        return count;
    }

    public int minDistance(int[] arr, int target) {
        int min = 3000;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            min = Math.min(min, Math.abs(target - arr[mid]));
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return min;
    }
//    Best Solution
//    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
//        int cnt = 0;
//        for(int value : arr1)
//            if(find(arr2, value, d)) cnt++;
//        return cnt;
//    }
//
//    public boolean find(int[] arr2, int value, int d){
//        for(int num : arr2)
//            if(-d + num <= value && value <= num + d) return false;
//        return true;
//    }
}
