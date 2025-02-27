package easy;

public class SumOfRootToLeafBinaryNumbers1022 {
    public int sumRootToLeaf(TreeNode root) {
        return traversal(root,0);
    }

    public int traversal(TreeNode root, int num) {
        int sum = num * 2 + root.val;
        if (root.left == null && root.right == null) return sum;
        if (root.left == null) return traversal(root.right, sum);
        if (root.right == null) return traversal(root.left, sum);
        return traversal(root.left,sum) +traversal(root.right,sum);
    }
}
