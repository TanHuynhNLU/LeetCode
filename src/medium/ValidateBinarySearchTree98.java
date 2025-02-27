package medium;

public class ValidateBinarySearchTree98 {
    Integer prevVal;

    public boolean isValidBST(TreeNode root) {
        return traverse(root);
    }

    public boolean traverse(TreeNode root) {
        if (root == null) return true;
        boolean left = traverse(root.left);
        if (prevVal != null && root.val < prevVal) return false;
        prevVal = root.val;
        boolean right = traverse(root.right);
        return left && right;
    }

    //    Best solution
//    public boolean isValidBST(TreeNode root) {
//        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
//    }
//
//    private boolean isValid(TreeNode node, long min, long max) {
//        if (node == null) return true;
//
//        if (node.val <= min || node.val >= max) return false; // Violation
//
//        return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
//    }
}
