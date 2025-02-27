package medium;

public class SumRootToLeafNumbers129 {
    public int sumNumbers(TreeNode root) {
        return preorderTraversal(root, 0);
    }

    public int preorderTraversal(TreeNode root, int sum) {
        if (root == null) return 0;
        sum += root.val;
        if (root.left == null && root.right == null) return sum;
        return preorderTraversal(root.left, sum * 10) + preorderTraversal(root.right, sum * 10);
    }
}
