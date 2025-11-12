package medium;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftTreeValue513 {
    public int findBottomLeftValue(TreeNode root) {
        int left = root.val;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size = 1;

        while (!queue.isEmpty()) {
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == 0) left = node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            size = queue.size();
        }
        return left;
    }

    // Best Solution
//    public int max = Integer.MIN_VALUE, res = 0;
//    public int findBottomLeftValue(TreeNode root) {
//        dfs(root, 1);
//        return res;
//    }
//
//    public void dfs(TreeNode root, int depth) {
//        if (root == null) return;
//
//        if (max < depth) {
//            max = depth;
//            res = root.val;
//        }
//
//        dfs(root.left, depth + 1);
//        dfs(root.right, depth + 1);
//    }
}
