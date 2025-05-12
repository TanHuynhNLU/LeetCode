package medium;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberIII260 {
    public int[] singleNumber(int[] nums) {
        Set<Integer> foundNums = new HashSet<>();
        Set<Integer> single = new HashSet<>();

        for (int num : nums) {
            if (foundNums.contains(num)) {
                single.remove(num);
            } else {
                foundNums.add(num);
                single.add(num);
            }
        }
        int[] res = new int[2];
        int i = 0;
        for (int num : single) {
            res[i++] = num;
        }
        return res;
    }

    //Popular Solution
//    public int[] singleNumber(int[] nums) {
//
//        if (nums.length <= 2) return nums;
//        int xor = 0;
//        for (int a : nums) {
//            xor ^= a;
//        }
//
//        int rb = xor & -xor;
//
//        int ans1 = 0, ans2 = 0;
//        for (int a : nums) {
//            if ((rb & a) > 0) {
//                ans1 ^= a;
//            } else {
//                ans2 ^= a;
//            }
//        }
//
//        return new int[]{ans1, ans2};
//    }
}
