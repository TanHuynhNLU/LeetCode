package medium;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberII137 {
    public int singleNumber(int[] nums) {
        Set<Integer> foundNumb = new HashSet<>();
        Set<Integer> single = new HashSet<>();
        for (int num : nums) {
            if (foundNumb.contains(num)) {
                single.remove(num);
            } else {
                single.add(num);
                foundNumb.add(num);
            }
        }
        return single.iterator().next();
    }

    //    Best Solution
//    public int singleNumber(int[] nums) {
//        int ones = 0, twos = 0;
//        for (int num : nums) {
//            ones = (ones ^ num) & ~twos;
//            twos = (twos ^ num) & ~ones;
//        }
//        return ones;
//    }

    //    Popular Solution
//    public int singleNumber(int[] nums) {
//        int ans = 0;
//
//        for (int i = 0; i < 32; ++i) {
//            int sum = 0;
//            for (final int num : nums)
//                sum += num >> i & 1;
//            sum %= 3;
//            ans |= sum << i;
//        }
//
//        return ans;
//    }
}
