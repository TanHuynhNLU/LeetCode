package easy;

public class MinimumDistanceBetweenBSTNode783 {
    static int min = Integer.MAX_VALUE;
    static int prev =-1;
    public static int minDiffInBST(TreeNode root) {
        if(root==null) return min;
        minDiffInBST(root.left);
        if(prev!=-1)
        min = Math.min(min,root.val-prev);
        prev = root.val;
        minDiffInBST(root.right);
        return min;
    }
//    public void  traversal (TreeNode root){
//        if(root==null) return;
//        traversal(root.left);
//        min = Math.min(min,root.val-prev);
//        prev = root.val;
//        traversal(root.right);
//    }
public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    TreeNode n1 = new TreeNode(0);
    TreeNode n2 = new TreeNode(48);
    TreeNode n3 = new TreeNode(12);
    TreeNode n4 = new TreeNode(49);
    root.left = n1;
    root.right = n2;
    n2.left = n3;
    n2.right = n4;
    System.out.println(minDiffInBST(root));
}
}
