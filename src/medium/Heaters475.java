package medium;

import java.util.Arrays;

public class Heaters475 {
    public int findRadius(int[] houses, int[] heaters) {
        int res = 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        for (int house : houses) {
            int idx = binarySearch(house, heaters);
            if (idx > 0) {
                int min = Math.min(Math.abs(heaters[idx] - house), Math.abs(house - heaters[idx - 1]));
                res = Math.max(min, res);
            } else res = Math.max(Math.abs(heaters[idx] - house), res);
        }
        return res;
    }

    public int binarySearch(int target, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) right = mid - 1;
            if (arr[mid] < target) left = mid + 1;
        }
        return left < arr.length ? left : arr.length - 1;
    }

    // Best Solution
//    public int findRadius(int[] houses, int[] heaters) {
//        Arrays.sort(houses);
//        Arrays.sort(heaters);
//        int n = houses.length;
//        int m = heaters.length;
//        int r = Math.max(heaters[0] - houses[0], houses[n - 1] - heaters[m - 1]);
//        int j = 0;
//
//        for (int i = 1; i < m; i++) {
//            if (heaters[i - 1] + r >= heaters[i] - r) {
//                continue;
//            }
//            while (j < n && houses[j] <= heaters[i - 1] + r) j++;
//
//            while (j < n && houses[j] > heaters[i - 1] + r && houses[j] < heaters[i] - r) {
//                r += Math.min(houses[j] - (heaters[i - 1] + r), (heaters[i] - r) - houses[j]);
//                j++;
//            }
//        }
//
//        return r;
//    }
}
