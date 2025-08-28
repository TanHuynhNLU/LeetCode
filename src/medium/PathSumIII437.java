package medium;

import java.util.ArrayList;
import java.util.List;

public class PathSumIII437 {
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        preorder(root, targetSum, new ArrayList<>());
        return count;
    }

    public void preorder(TreeNode root, int targetSum, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        long sum = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i);
            if (sum == targetSum) count++;
        }
        preorder(root.left, targetSum, list);
        preorder(root.right, targetSum, list);
        list.remove(list.size() - 1);
    }

    // Popular Solution
//    public int pathSum(TreeNode root, int targetSum) {
//        HashMap<Long, Integer> map = new HashMap<>();
//        map.put(0L, 1);
//        return solve(root, 0L, (long) targetSum, map);
//    }

    //Prefix sum approach

//    public int solve(TreeNode node, long prefixSum, long k, HashMap<Long, Integer> map) {
//        if (node == null) return 0;
//
//        prefixSum += node.val;
//        int count = 0;
//        if (map.containsKey(prefixSum - k))
//            count += map.get(prefixSum - k);
//
//        // add current prefixSum to map
//        map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
//
//        // recurse left & right
//        count += solve(node.left, prefixSum, k, map);
//        count += solve(node.right, prefixSum, k, map);
//
//        // backtrack: remove one occurrence of this prefixSum
//        map.put(prefixSum, map.get(prefixSum) - 1);
//        if (map.get(prefixSum) == 0) map.remove(prefixSum);
//
//
//        return count;
//
//    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
