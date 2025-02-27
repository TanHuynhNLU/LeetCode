package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    list.add(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            if (!list.isEmpty()) res.add(list);
        }
        return res;
    }

    //    Best Solution
//    List<List<Integer>> result = new ArrayList<>();
//
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        helper(root, 0);
//        return result;
//    }
//
//    public void helper(TreeNode root, Integer level) {
//        if (root == null) {
//            return;
//        }
//        if (result.size() <= level) {
//            result.add(new ArrayList<Integer>());
//        }
//        result.get(level).add(root.val);
//        helper(root.left, level + 1);
//        helper(root.right, level + 1);
//    }
}
