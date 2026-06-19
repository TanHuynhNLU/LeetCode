package medium;

public class AddOneRowToTree623 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (root == null) return null;
        if (depth - 1 == 0) {
            TreeNode curr = new TreeNode(val);
            curr.left = root;
            return curr;
        }
        if (depth - 1 == 1) {
            TreeNode currLeft = new TreeNode(val);
            TreeNode currRight = new TreeNode(val);
            currLeft.left = root.left;
            currRight.right = root.right;
            root.left = currLeft;
            root.right = currRight;
            return root;
        }
        addOneRow(root.left, val, depth - 1);
        addOneRow(root.right, val, depth - 1);
        return root;
    }
}
