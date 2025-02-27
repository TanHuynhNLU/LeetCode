package easy;

public class InvertBinaryTree226 {
    public static TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;

        TreeNode invertRoot = invertTree(root);
        System.out.println(invertRoot.right.val);
    }
}
