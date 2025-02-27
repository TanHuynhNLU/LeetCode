package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII90 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), 0);
        return res;
    }

    public void backtrack(int[] nums, List<Integer> tmp, int start) {
        res.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            tmp.add(nums[i]);
            backtrack(nums, tmp, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
