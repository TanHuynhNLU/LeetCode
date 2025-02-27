package medium;

import java.util.*;

public class PermutationsII47 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }

    public void backtrack(int[] nums, List<Integer> tmp, boolean[] visited) {
        if (tmp.size() == nums.length) {
            result.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
            if (!visited[i]) {
                tmp.add(nums[i]);
                visited[i] = true;
                backtrack(nums, tmp, visited);
                tmp.remove(tmp.size() - 1);
                visited[i] = false;
            }
        }
    }
}
