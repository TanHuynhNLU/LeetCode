package easy;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement2404 {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        int maxCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                if (map.get(num) > maxCount) {
                    maxCount = map.get(num);
                    ans = num;
                }
                if (map.get(num) == maxCount) {
                    if (num < ans) ans = num;
                }
            }
        }
        return ans;
    }

    //    Best Solution
//    public int mostFrequentEven(int[] nums) {
//        int n = nums.length;
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//        }
//        int[] count = new int[max + 1];
//        int maxCount = 0, val = -1;
//        for (int i = 0; i < n; i++) {
//            count[nums[i]]++;
//
//            if (count[nums[i]] > maxCount && nums[i] % 2 == 0) {
//                maxCount = count[nums[i]];
//                val = nums[i];
//            } else if (count[nums[i]] == maxCount && nums[i] < val && nums[i] % 2 == 0) {
//                val = nums[i];
//            }
//
//        }
//        return val;
//
//    }
}
