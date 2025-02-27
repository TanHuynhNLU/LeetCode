package easy;

public class BinaryTreeTilt563 {
    int sum;
    public int findTilt(TreeNode root) {
       traversal(root);
       return sum;
    }
    public int traversal(TreeNode root){
        if (root==null) return 0;
        int left = traversal(root.left);
        int right = traversal(root.right);
        sum+=Math.abs(left-right);
        return root.val+left+right;
    }
}
