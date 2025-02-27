package easy;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumberFollowingKeyInAnArray2190 {
    public int mostFrequent(int[] nums, int key) {
        int max = 0;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                map.put(nums[i + 1], map.getOrDefault(nums[i + 1], 0) + 1);
                if (map.get(nums[i + 1]) > max) {
                    max = map.get(nums[i + 1]);
                    ans = nums[i + 1];
                }
            }
        }
        return ans;
    }

    //    Best Solution
//    public int mostFrequent(int[] nums, int key) {
//        int result[] = new int[1000];
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == key) {
//                result[nums[i + 1] - 1]++;
//            }
//        }
//        int max = Integer.MIN_VALUE;
//        int ans = 0;
//        for (int i = 0; i < 1000; i++) {
//            if (result[i] > max) {
//                max = result[i];
//                ans = i + 1;
//            }
//        }
//        return ans;
//
//    }
}
