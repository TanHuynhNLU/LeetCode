package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfPairsWithAbsoluteDifferenceK2006 {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) count += map.get(num);
            map.put(num - k, map.getOrDefault(num - k, 0) + 1);
            map.put(num + k, map.getOrDefault(num + k, 0) + 1);
        }
        return count;
    }

    //  Best Solution
//    public int countKDifference(int[] nums, int k) {
//        int[] count = new int[101];
//        for (int num : nums) count[num]++;
//        int cnt = 0;
//        for (int i = 0; i < 101 - k; i++) {
//            if (count[i] > 0 && count[i + k] > 0) cnt += (count[i] * count[i + k]);
//        }
//        return cnt;
//    }
}
