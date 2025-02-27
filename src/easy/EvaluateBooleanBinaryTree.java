package easy;

public class EvaluateBooleanBinaryTree {
    public boolean evaluateTree(TreeNode root) {
        return traversal(root);
    }

    public boolean traversal(TreeNode root) {
        if (root.val == 0) return false;
        if (root.val == 1) return true;
        if (root.val == 2) return traversal(root.left) || traversal(root.right);
        if (root.val == 3) return traversal(root.left) && traversal(root.right);
        return false;
    }
}


class TreeNode {
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

