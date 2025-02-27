package medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations46 {
    static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> permute(int[] nums) {
        backtrack(nums,  new ArrayList<>(), new boolean[nums.length]);
        return result;
    }

    public static void backtrack(int[] nums, List<Integer> tmp, boolean[] visited) {
        if (tmp.size() == nums.length) {
            result.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                tmp.add(nums[i]);
                visited[i] = true;
                backtrack(nums, tmp, visited);
                tmp.remove(tmp.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        permute(new int[]{1, 2, 3});
    }
}
