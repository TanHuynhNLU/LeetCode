package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MergeIntervals56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < intervals.length; i++) {
            if (!stack.isEmpty()) {
                int[] top = stack.peek();
                int start = intervals[i][0];
                int end = intervals[i][1];
                if (start >= top[0] && start <= top[1]) {
                    stack.pop();
                    stack.push(new int[]{Math.min(start, top[0]), Math.max(end, top[1])});
                } else {
                    stack.push(new int[]{start, end});
                }
            } else {
                stack.push(intervals[i]);
            }
        }
        int[][] res = new int[stack.size()][2];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }

    //    Best solution
//    public int[][] merge(int[][] intervals) {
//        int max = 0;
//        for (int i = 0; i < intervals.length; i++) {
//            max = Math.max(intervals[i][0], max);
//        }
//        int[] mp = new int[max + 1];
//        for (int i = 0; i < intervals.length; i++) {
//            int start = intervals[i][0];
//            int end = intervals[i][1];
//            mp[start] = Math.max(end + 1, mp[start]);
//        }
//        int r = 0;
//        int initialStart = -1;
//        int have = -1;
//        for (int i = 0; i < mp.length; i++) {
//            if (mp[i] != 0) {
//                if (initialStart == -1)
//                    initialStart = i;
//                have = Math.max(mp[i] - 1, have);
//            }
//            if (have == i) {
//                intervals[r++] = new int[]{initialStart, have};
//                initialStart = -1;
//                have = -1;
//            }
//        }
//        if (initialStart != -1) {
//            intervals[r++] = new int[]{initialStart, have};
//        }
//        if (intervals.length == r) {
//            return intervals;
//        }
//        int[][] res = new int[r][];
//        for (int i = 0; i < r; i++) {
//            res[i] = intervals[i];
//        }
//        return res;
//    }
}
