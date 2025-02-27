package easy;

import java.util.Map;
import java.util.TreeMap;

public class MergeTwo2DArraysBySummingValues2570 {
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i][0], map.getOrDefault(nums1[i][0], 0) + nums1[i][1]);
        }
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i][0], map.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
        }
        int[][] res = new int[map.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res[i][0] = entry.getKey();
            res[i][1] = entry.getValue();
            i++;
        }
        return res;
    }

    //    Best solution
//    public int[][] mergeArrays(int[][] arr1, int[][] arr2) {
//        int n1 = arr1.length, n2 = arr2.length;
//        List<int[]> result = new ArrayList<>();
//
//        int i = 0, j = 0;
//
//        while (i < n1 && j < n2) {
//            if (arr1[i][0] == arr2[j][0]) {
//                result.add(new int[]{arr1[i][0], arr1[i][1] + arr2[j][1]});
//                i++;
//                j++;
//            } else if (arr1[i][0] < arr2[j][0]) {
//                result.add(arr1[i]);
//                i++;
//            } else {
//                result.add(arr2[j]);
//                j++;
//            }
//        }
//
//        while (i < n1) {
//            result.add(arr1[i]);
//            i++;
//        }
//
//        while (j < n2) {
//            result.add(arr2[j]);
//            j++;
//        }
//
//        return result.toArray(new int[][]{});
//    }

    public static void main(String[] args) {
        int[][] nums1 = {{1, 2}, {2, 3}, {4, 5}};
        int[][] nums2 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] res = mergeArrays(nums1, nums2);
    }
}

