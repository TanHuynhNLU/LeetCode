package easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int n = nums.length;
        for (; i < n; i++) {
            if(map.containsKey(nums[i])&&(i-map.get(nums[i])<=k)) return true;
            map.put(nums[i],i);

        }
        return false;
    }
}
