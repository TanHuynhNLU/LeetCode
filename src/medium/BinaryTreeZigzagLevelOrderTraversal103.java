package medium;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal103 {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        boolean isReverse = false;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> temp = new Stack<>();
            if (!isReverse) {
                int size = stack.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = stack.pop();
                    if (node != null) {
                        list.add(node.val);
                        temp.push(node.left);
                        temp.push(node.right);
                    }
                }
            } else {
                int size = stack.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = stack.pop();
                    if (node != null) {
                        list.add(node.val);
                        temp.push(node.right);
                        temp.push(node.left);
                    }
                }
            }
            isReverse = !isReverse;
            stack = temp;
            if (!list.isEmpty()) res.add(list);
        }
        return res;
    }

    //    Best Solution
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//
//        if (root == null) return result;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        boolean zig = false; // Flag for zigzag order
//
//        while (!queue.isEmpty()) {
//            int levelSize = queue.size();
//            LinkedList<Integer> currentLevel = new LinkedList<>();
//
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode current = queue.poll();
//
//                // Add elements based on zigzag pattern
//                if (zig) {
//                    currentLevel.addFirst(current.val);  // Add at the beginning for reverse order
//                } else {
//                    currentLevel.addLast(current.val);   // Add at the end for normal order
//                }
//
//                // Always enqueue left first, then right (this order does not matter)
//                if (current.left != null) queue.offer(current.left);
//                if (current.right != null) queue.offer(current.right);
//            }
//
//            result.add(currentLevel);
//            zig = !zig; // Toggle zigzag order
//        }
//
//        return result;
//    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        zigzagLevelOrder(root);
    }
}
