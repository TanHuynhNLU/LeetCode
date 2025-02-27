package easy;

public class CousinsInBinaryTree993 {
    int depthX = 0;
    int depthY = 0;
    int parentX = 0;
    int parentY = 0;

    public boolean isCousins(TreeNode root, int x, int y) {
        traversal(root, x, y, 0, 0);
        return depthX == depthY && parentX != parentY;
    }

    public void traversal(TreeNode root, int x, int y, int depth, int parent) {
        if (root == null) return;
        if (root.val == x) {
            depthX = depth;
            parentX = parent;
        }
        if (root.val == y) {
            depthY = depth;
            parentY = parent;
        }
        traversal(root.left, x, y, depth + 1, root.val);
        traversal(root.right, x, y, depth + 1, root.val);
    }
}
