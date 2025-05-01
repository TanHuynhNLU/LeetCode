package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII229 {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            int value = map.getOrDefault(num, 0);
            if (value >= nums.length / 3 && !res.contains(num)) {
                res.add(num);
            }
            if (res.size() == 2) return res;
            map.put(num, value + 1);
        }
        return res;
    }

    //Best Solution
//    static {
//        for (int i = 0; i < 500; i++) {
//            majorityElement(null);
//        }
//    }
//
//    public static List<Integer> majorityElement(int[] nums) {
//        if (nums == null) return new ArrayList<>();
//        int cand1 = Integer.MIN_VALUE, cand2 = Integer.MIN_VALUE;
//        int c1 = 0, c2 = 0;
//        for (int num : nums) {
//            if (c1 == 0 && num != cand2) {
//                cand1 = num;
//                c1 = 1;
//            } else if (c2 == 0 && num != cand1) {
//                cand2 = num;
//                c2 = 1;
//            } else if (num == cand1) {
//                c1++;
//            } else if (num == cand2) {
//                c2++;
//            } else {
//                c1--;
//                c2--;
//            }
//        }
//        c1 = 0;
//        c2 = 0;
//        for (int num : nums) {
//            if (num == cand1) c1++;
//            else if (num == cand2) c2++;
//        }
//
//
//        List<Integer> result = new ArrayList<>();
//        int threshold = nums.length / 3;
//        if (c1 > threshold) result.add(cand1);
//        if (cand2 != cand1 && c2 > threshold) result.add(cand2);
//
//        return result;
//    }
}
