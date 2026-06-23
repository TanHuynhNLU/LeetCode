package medium;

import java.util.List;

public class MaximumDistanceInArrays624 {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = 0;
        int max = 0;
        int res = 0;
        for (int i = 0; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            if (i == 0) {
                min = array.get(0);
                max = array.get(array.size() - 1);
            } else {
                res = Math.max(Math.abs(max - array.get(0)), res);
                res = Math.max(Math.abs(array.get(array.size() - 1) - min), res);
                max = Math.max(max, array.get(array.size() - 1));
                min = Math.min(min, array.get(0));
            }
        }
        return res;
    }
    // Best Solution
//    public int maxDistance(List<List<Integer>> arrays) {
//        int globalMin = Integer.MAX_VALUE;
//        int globalMax = Integer.MIN_VALUE;
//        int minIdx = -1, maxIdx = -1;
//        int secondMin = Integer.MAX_VALUE;
//        int secondMax = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arrays.size(); i++) {
//            List<Integer> arr = arrays.get(i);
//            int curMin = arr.get(0);
//            int curMax = arr.get(arr.size() - 1);
//
//            // Update global max and second max
//            if (curMax > globalMax) {
//                secondMax = globalMax;
//                globalMax = curMax;
//                maxIdx = i;
//            } else if (curMax > secondMax) {
//                secondMax = curMax;
//            }
//
//            // Update global min and second min
//            if (curMin < globalMin) {
//                secondMin = globalMin;
//                globalMin = curMin;
//                minIdx = i;
//            } else if (curMin < secondMin) {
//                secondMin = curMin;
//            }
//        }
//
//        if (minIdx != maxIdx) {
//            return globalMax - globalMin;
//        }
//        return Math.max(globalMax - secondMin, secondMax - globalMin);
//    }
}
