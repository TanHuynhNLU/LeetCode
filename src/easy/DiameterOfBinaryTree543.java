package easy;

public class DiameterOfBinaryTree543 {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int tmp = maxDepth(root.left)+ maxDepth(root.right);
        if(tmp>max) max = tmp;
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return max;
    }
    public static int maxDepth(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
//    Best solution
//    int max = 0;
//    public int diameterOfBinaryTree(TreeNode root) {
//        getDepth(root);
//        return this.max;
//    }
//
//    private int getDepth(TreeNode root) {
//        if (root == null) return 0;
//        if (root.left == null && root.right == null) return 1;
//
//        int leftDepth = getDepth(root.left);
//        int rightDepth = getDepth(root.right);
//
//        this.max = Math.max(this.max, leftDepth + rightDepth);
//        return 1 + Math.max(leftDepth, rightDepth);
//    }
}
