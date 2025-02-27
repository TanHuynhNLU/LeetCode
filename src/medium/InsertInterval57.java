package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) return new int[][]{newInterval};
        int[][] newIntervals = new int[intervals.length + 1][2];
        System.arraycopy(intervals, 0, newIntervals, 0, intervals.length);
        newIntervals[intervals.length] = newInterval;
        intervals = newIntervals;
        int max = -1;
        for (int i = 0; i < intervals.length; i++) {
            max = Math.max(max, intervals[i][0]);
        }
        int[] ranges = new int[max + 1];
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            ranges[start] = Math.max(ranges[start], end + 1);
        }
        int tmpRange = -1;
        int count = 0;
        int start = -1;
        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i] > 0) {
                if (start == -1) {
                    start = i;
                }
                tmpRange = Math.max(tmpRange, ranges[i] - 1);
            }
            if (tmpRange == i) {
                intervals[count++] = new int[]{start, tmpRange};
                start = -1;
                tmpRange = -1;
            }
        }
        if (start != -1) {
            intervals[count++] = new int[]{start, tmpRange};
        }
        int[][] result = new int[count][2];
        for (int i = 0; i < count; i++) {
            result[i] = intervals[i];
        }
        return result;
    }


    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
//        insert(intervals, new int[]{9, 11});
    }
}
