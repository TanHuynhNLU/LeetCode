package easy;

import java.util.HashSet;
import java.util.Set;

public class LargestPositiveIntegerThatExistsWithItsNegative2441 {
    public int findMaxK(int[] nums) {
        int max = -1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(-num) && Math.abs(num) > max) max = Math.abs(num);
            set.add(num);
        }
        return max;
    }
//    Best solution
//    public int findMaxK(int[] nums) {
//        boolean[] vis = new boolean[2001];
//        int ans = -1;
//
//        for (int el : nums) {
//            if (vis[-el + 1000]) ans = Math.max(ans, Math.abs(el));
//            vis[el + 1000] = true;
//        }
//
//        return ans;
//
//    }
}
