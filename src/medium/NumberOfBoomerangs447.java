package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberOfBoomerangs447 {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Long, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (j == i) continue;
                long d = distance(points[j][0], points[j][1], points[i][0], points[i][1]);
                if (map.containsKey(d)) {
                    int val = map.get(d) + 2;
                    res += val;
                    map.put(d, val);
                } else {
                    map.put(d, 0);
                }
            }
        }
        return res;
    }

    public long distance(int x1, int y1, int x2, int y2) {
        long dx = (long) (x2 - x1) * (x2 - x1);
        long dy = (long) (y2 - y1) * (y2 - y1);
        return dx + dy;
    }

    // Best Solution
//    public int numberOfBoomerangs(int[][] points) {
//        HashMap<Integer, Integer> map = new HashMap();
//        int boomerangs = 0;
//        for (int[] p1 : points) {
//            for (int[] p2 : points)
//                boomerangs += map.merge((p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]), 1, Integer::sum) - 1;
//            map.clear();
//        }
//        return boomerangs * 2;
//    }
}
