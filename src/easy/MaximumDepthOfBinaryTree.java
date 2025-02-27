package easy;

public class MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root){
        if(root==null) return 0;
        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        n1.left = n2;
        n1.right = n3;

        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);
        n3.left = n4;
        n3.right = n5;

        System.out.println(maxDepth(n1));
    }
}
