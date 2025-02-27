package easy;

import java.util.HashSet;

public class KeepMultiplyingFoundValuesByTwo2154 {
    public int findFinalValue(int[] nums, int original) {
        int ans = original;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(ans)) {
            ans = ans * 2;
        }
        return ans;
    }

    //    Best solution
//    public boolean find(int[] nums, int original) {
//        for (int num : nums) {
//            if (num == original)
//                return true;
//        }
//        return false;
//    }
//
//    public int findFinalValue(int[] nums, int original) {
//        while (find(nums, original))
//            original *= 2;
//        return original;
//    }
}
