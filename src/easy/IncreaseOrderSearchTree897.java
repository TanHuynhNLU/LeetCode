package easy;

public class IncreaseOrderSearchTree897 {
    TreeNode head, current;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode res = null;
        inorder(root);
        return head;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (head == null) {
            head = new TreeNode(root.val);
            current = head;
        } else {
            current.right = new TreeNode(root.val);
            current = current.right;
        }
        inorder(root.right);
    }
}
