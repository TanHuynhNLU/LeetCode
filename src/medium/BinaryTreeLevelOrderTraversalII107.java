package medium;

import java.util.*;

public class BinaryTreeLevelOrderTraversalII107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur != null) {
                    level.add(cur.val);
                    queue.add(cur.left);
                    queue.add(cur.right);
                }
            }
            if (!level.isEmpty()) result.add(level);
        }
        Collections.reverse(result);
        return result;
    }

    //    Best solution
//    private void levelOrder(TreeNode node, int level, List<List<Integer>> nodesByLevel) {
//        if (node == null) return;
//        if (level == nodesByLevel.size()) nodesByLevel.add(new ArrayList<>());
//        levelOrder(node.left, level + 1, nodesByLevel);
//        levelOrder(node.right, level + 1, nodesByLevel);
//        nodesByLevel.get(level).add(node.val);
//    }
//
//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        List<List<Integer>> nodesByLevel = new ArrayList<>();
//        levelOrder(root, 0, nodesByLevel);
//        Collections.reverse(nodesByLevel);
//        return nodesByLevel;
//    }
}
