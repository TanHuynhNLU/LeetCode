package easy;

import java.util.HashSet;
import java.util.Set;

public class FindSubarraysWithEqualSum2395 {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i]+nums[i+1];
            if (set.contains(sum)) return true;
            else set.add(sum);
        }
        return false;
    }
}
