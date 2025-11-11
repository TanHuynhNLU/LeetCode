package medium;

import java.util.*;

public class MostFrequentSubtreeSum508 {
    Map<Integer, Integer> map = new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {
        postOrder(root);
        int max = 1;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                list = new ArrayList<>();
                list.add(entry.getKey());
            } else if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public int postOrder(TreeNode root) {
        if (root == null) return 0;
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        int sum = root.val + left + right;

        int val = map.getOrDefault(sum, 0);
        map.put(sum, val + 1);
        return sum;
    }
}

// Best solution
//class Solution {
//    int maxF = 0;
//    List<Integer> maxSumArr = new ArrayList<>();
//    Map<Integer, Integer> f = new HashMap<>();
//
//    public int[] findFrequentTreeSum(TreeNode root) {
//        solve(root);
//
//        int[] arr = new int[maxSumArr.size()];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = maxSumArr.get(i);
//        }
//        return arr;
//    }
//
//    public int solve(TreeNode root) {
//        if (root == null) return 0;
//
//        int sum = root.val + solve(root.left) + solve(root.right);
//        f.put(sum, f.getOrDefault(sum, 0) + 1);
//
//        if (f.get(sum) > maxF) {
//            maxSumArr.clear();
//            maxSumArr.add(sum);
//            maxF = f.get(sum);
//        } else if (f.get(sum) == maxF) {
//            maxSumArr.add(sum);
//        }
//
//        return sum;
//    }
//}
