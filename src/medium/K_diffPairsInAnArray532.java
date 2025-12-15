package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class K_diffPairsInAnArray532 {
    public int findPairs(int[] nums, int k) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> pair = new HashSet<>();
        int res = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            if (visited.contains(num)) continue;
            if (pair.contains(num)) {
                res++;
                visited.add(num);
            }
            pair.add(num + k);
        }
        return res;
    }
    // Best Solution
//    static {
//        for (int i = 0; i < 500; i++) {
//            findPairs(new int[] { -1, 0 }, 0);
//        }
//    }
//
//    public static int findPairs(int[] nums, int k) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i : nums) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//        }
//        int cnt = 0;
//        for (int i : map.keySet()) {
//            if (k == 0) {
//                if (map.get(i) > 1)
//                    cnt++;
//            } else {
//                if (map.containsKey(i - k))
//                    cnt++;
//            }
//        }
//        return cnt;
//    }
}
