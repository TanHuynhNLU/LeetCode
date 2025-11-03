package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NondecreasingSubsequences491 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        backtrack(res, new ArrayList<>(),  nums, 0);
        return new ArrayList<>(res);
    }

    public void backtrack(Set<List<Integer>> res, List<Integer> list, int[] nums, int start) {
        if (list.size() >= 2) {
            List<Integer> copy = new ArrayList<>(list);
            res.add(copy);
        }
        for (int i = start; i < nums.length; i++) {
            if (i != 0 && !list.isEmpty() && nums[i] < list.get(list.size() - 1)) continue;
            list.add(nums[i]);
            backtrack(res, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
    // Best Solution
//    class Solution extends java.util.AbstractList<List<Integer>>{
//        List<List<Integer>> lists;
//        int[] nums;
//        public List<List<Integer>> findSubsequences(int[] nums) {
//            this.nums = nums;
//            return this;
//        }
//        public void backtrack(Set<List<Integer>> res, List<Integer> curr, int i) {
//            if(curr.size() >= 2) {
//                res.add(new ArrayList<>(curr));
//            }
//            for(int j = i; j < nums.length; j++) {
//                if(curr.size() == 0 || nums[j] >= curr.get(curr.size() - 1)) {
//                    curr.add(nums[j]);
//                    backtrack(res, curr, j + 1);
//                    curr.remove(curr.size() - 1);
//                }
//            }
//        }
//        @Override
//        public List<Integer> get(int index) {
//            if(lists == null) {
//                this.size();
//            }
//            return lists.get(index);
//        }
//        @Override
//        public int size() {
//            if(lists == null) {
//                HashSet<List<Integer>> set = new HashSet<>();
//                backtrack(set, new ArrayList<>(), 0);
//                lists = new ArrayList<>(set);
//            }
//            return lists.size();
//        }
//    }
}
