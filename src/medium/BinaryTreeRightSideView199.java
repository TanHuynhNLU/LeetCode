package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    if (i == size - 1) list.add(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }
        }
        return list;
    }

    // Best Solution
//    public List<Integer> rightView = new ArrayList<>();
//
//    public List<Integer> rightSideView(TreeNode root) {
//        traverse(root, 1);
//        return rightView;
//    }
//
//    private void traverse(TreeNode node, int level) {
//        if (node == null) return;
//
//        if (rightView.size() < level) {
//            rightView.add(node.val);
//        } else {
//            rightView.set(level - 1, node.val);
//        }
//        traverse(node.left, level + 1);
//        traverse(node.right, level + 1);
//    }
}
