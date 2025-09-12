package medium;

public class DeleteNodeInABST450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val < key) root.right = deleteNode(root.right, key);
        if (root.val > key) root.left = deleteNode(root.left, key);
        if (root.val == key) {
            if (root.left == null && root.right == null) return null;
            if (root.left != null && root.right != null) {
                TreeNode node = findMinRight(root.right);
                root.val = node.val;
                root.right = deleteNode(root.right, node.val);
                return root;
            }
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
        }
        return root;
    }

    public TreeNode findMinRight(TreeNode root) {
        TreeNode curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

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
