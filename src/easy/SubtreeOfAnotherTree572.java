package easy;

public class SubtreeOfAnotherTree572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (root.val == subRoot.val && isIdentical(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isIdentical(TreeNode r, TreeNode s) {
        if (r == null && s == null) return true;
        if (r == null && s != null || r != null && s == null || r.val != s.val) return false;
        return isIdentical(r.left, s.left) && isIdentical(r.right, s.right);
    }

    //    Best solution
//    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//        if (root == null && subRoot == null) return true;
//
//        if (root == null || subRoot == null) return false;
//
//        return isSame(root, subRoot) || isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);
//    }
//
//    boolean isSame(TreeNode root, TreeNode subRoot) {
//        if (root == null && subRoot == null) return true;
//
//        if (root == null || subRoot == null) return false;
//
//        if (root.val != subRoot.val) return false;
//
//        return isSame(root.left, subRoot.left) && isSubtree(root.right, subRoot.right);
//    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(2);
        n1.left = n2;
        n1.right = n3;

        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(1);
        TreeNode n7 = new TreeNode(2);
        n5.left = n6;
        n5.right = n7;

    }
}
