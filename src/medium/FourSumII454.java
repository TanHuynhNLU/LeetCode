package medium;

import java.util.HashMap;
import java.util.Map;

public class FourSumII454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Long, Integer> map = new HashMap<>();
        for (int num : nums1) {
            int value = map.getOrDefault((long) -num, 0);
            map.put((long) (-num), value + 1);
        }
        Map<Long, Integer> tmp = new HashMap<>();
        for (int num : nums2) {
            for (long key : map.keySet()) {
                int tmpValue = tmp.getOrDefault(key - num, 0);
                int mapValue = map.get(key);
                tmp.put(key - num, tmpValue + mapValue);
            }
        }
        map = tmp;
        tmp = new HashMap<>();
        for (int num : nums3) {
            for (long key : map.keySet()) {
                int tmpValue = tmp.getOrDefault(key - num, 0);
                int mapValue = map.get(key);
                tmp.put(key - num, tmpValue + mapValue);
            }
        }
        map = tmp;
        int res = 0;
        for (int num : nums4) {
            if (map.containsKey((long) num)) res += map.get((long) num);
        }
        return res;
    }

    // Best Solution
//    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
//        int tuplesCount = 0;
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        Arrays.sort(nums3);
//        Arrays.sort(nums4);
//
//        // Calculate min/max possible sums for early termination
//        int minSum34 = nums3[0] + nums4[0];
//        int maxSum34 = nums3[nums3.length - 1] + nums4[nums4.length - 1];
//
//        HashMap<Integer, Integer> map = new HashMap<>(nums1.length * nums2.length * 4 / 3);
//
//        for (int a : nums1) {
//            for (int b : nums2) {
//                int sum12 = a + b;
//                // Only store if there's a chance of finding complement
//                if (-sum12 >= minSum34 && -sum12 <= maxSum34) {
//                    map.merge(sum12, 1, Integer::sum);
//                }
//            }
//        }
//
//
//        for (int c : nums3) {
//            for (int d : nums4) {
//                tuplesCount += map.getOrDefault(-(c + d), 0);
//            }
//        }
//
//        return tuplesCount;
//    }
}
