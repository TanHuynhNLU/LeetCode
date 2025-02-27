package easy;

public class UnivaluedBinaryTree965 {
    int unique = -1;
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        if(unique==-1) unique = root.val;
        if(root.val!=unique) return false;
        return isUnivalTree(root.left)&&isUnivalTree(root.right);
    }
}
