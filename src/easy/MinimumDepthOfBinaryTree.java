package easy;

public class MinimumDepthOfBinaryTree {
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (root.left == null && root.right == null) return 1;
        if (root.left == null) return 1 + right;
        if (root.right == null) return 1 + left;
        return 1 + Math.min(left, right);
    }


    public static void main(String[] args) {
        TreeNode n1=new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);
        n1.right = n2;
        n2.right = n3;
        System.out.println(minDepth(n1));
    }
}
