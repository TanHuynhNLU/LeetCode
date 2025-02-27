package medium;

import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTreeToLinkedList114 {
    List<Integer> list = new ArrayList<>();

    public void flatten(TreeNode root) {
        if (root == null) return;
        preOrder(root);
        TreeNode cur = root;
        for (int i = 0; i < list.size(); i++) {
            cur.val = list.get(i);
            cur.left = null;
            if (cur.right == null && i != list.size() - 1)
                cur.right = new TreeNode(0);
            cur = cur.right;
        }
    }

    public void preOrder(TreeNode root) {
        if (root == null) return;
        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    //    Best Solution
//    TreeNode head = null;
//
//    public void flatten(TreeNode root) {
//        if (root != null) revPreOrder(root);
//    }
//
//    private void revPreOrder(TreeNode node) {
//        if (node.right != null) revPreOrder(node.right);
//        if (node.left != null) revPreOrder(node.left);
//        node.right = head;
//        node.left = null;
//        head = node;
//    }
    
}
