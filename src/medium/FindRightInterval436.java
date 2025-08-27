package medium;

import java.util.Arrays;

public class FindRightInterval436 {
    public int[] findRightInterval(int[][] intervals) {
        int m = intervals.length;
        int[][] positions = new int[m][2];
        int[] res = new int[m];

        for (int i = 0; i < m; i++) {
            positions[i] = new int[]{intervals[i][0], i};
        }
        Arrays.sort(positions, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < m; i++) {
            res[i] = binarySearch(positions, 0, m - 1, intervals[i][1]);
        }
        return res;
    }

    public int binarySearch(int[][] positions, int start, int end, int target) {
        if (positions[end][0] < target) return -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (positions[mid][0] == target) return positions[mid][1];
            else if (positions[mid][0] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return positions[start][1];
    }

    //Best solution
//    public int[] findRightInterval(int[][] intervals) {
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        // min and max of the intervals
//        for (int[] interval : intervals) {
//            min = Math.min(min, interval[0]);
//            max = Math.max(max, interval[1]);
//        }
//        int[] range = new int[max - min + 1];
//        Arrays.fill(range, -1);
//        // Track the index of each element
//        for (int index = 0; index < intervals.length; index++) {
//            range[intervals[index][0] - min] = index;
//        }
//        // fill the range from right to left for the index
//        for (int index = range.length - 2; index >= 0; index--) {
//            if (range[index] == -1) {
//                range[index] = range[index + 1];
//            }
//        }
//
//        // for each interval - get the results
//        int[] result = new int[intervals.length];
//        for (int index = 0; index < intervals.length; index++) {
//            result[index] = range[intervals[index][1] - min];
//        }
//        return result;
//    }
}
