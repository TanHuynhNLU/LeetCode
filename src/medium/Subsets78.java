package medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(new ArrayList<>(), nums, new boolean[nums.length], 0, nums.length);
        return res;
    }

    public void backtrack(List<Integer> list, int[] nums, boolean[] visited, int initial, int n) {
        List<Integer> newList = new ArrayList<>(list);
        res.add(newList);
        if (list.size() == n) return;
        for (int i = initial; i < n; i++) {
            if (visited[i]) continue;
            list.add(nums[i]);
            visited[i] = true;
            backtrack(list, nums, visited, i + 1, n);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
}
