package medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            if(sum==k) count++;
            if (map.containsKey(sum - k)) count+=map.get(sum);
            int val = map.getOrDefault(sum, 0);
            map.put(sum, val + 1);
        }
        return count;
    }
}
