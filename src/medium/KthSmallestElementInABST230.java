package medium;

public class KthSmallestElementInABST230 {
    int res = 0;
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return res;
    }

    public void helper(TreeNode root, int k) {
        if (count > k || root == null) return;
        helper(root.left, k);
        count++;
        if (count == k) res = root.val;
        helper(root.right, k);
    }
}
