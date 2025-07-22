package medium;

import java.util.*;

public class RandomPickIndex398 {
    private Map<Integer, List<Integer>> map;
    private Random rd ;

    public RandomPickIndex398(int[] nums) {
        map = new HashMap<>();
        rd = new Random();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
            list.add(i);
            map.put(nums[i], list);
        }
    }

    public int pick(int target) {
        List<Integer> list = map.get(target);
        int rdIndex = rd.nextInt(list.size());
        return list.get(rdIndex);
    }
}
