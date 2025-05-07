package medium;

public class LowestCommonAncestorOfABinaryTree236 {
    TreeNode res;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        postOrder(root, p, q);
        return res;
    }

    public boolean postOrder(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean left = postOrder(root.left, p, q);
        boolean right = postOrder(root.right, p, q);
        if (res == null) {
            if (left && right)
                res = root;
            if ((left || right) && (root.val == p.val || root.val == q.val)) res = root;
        }
        if (root.val == p.val || root.val == q.val) return true;
        return left || right;
    }

    // Best Solution
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (root == null || root == p || root == q) return root;
//
//        TreeNode left = lowestCommonAncestor(root.left, p, q);
//        TreeNode right = lowestCommonAncestor(root.right, p, q);
//
//        if (left != null && right != null) return root;
//
//        if (left != null) return left;
//        else return right;
//    }
}
