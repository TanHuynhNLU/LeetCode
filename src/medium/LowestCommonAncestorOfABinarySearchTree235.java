package medium;

public class LowestCommonAncestorOfABinarySearchTree235 {
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

    // Best solution
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
//        if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
//        return root;
//    }
}
