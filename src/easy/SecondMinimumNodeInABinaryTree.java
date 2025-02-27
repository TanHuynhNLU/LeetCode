package easy;

public class SecondMinimumNodeInABinaryTree {
    double firstMin = Double.MAX_VALUE, secondMin = Double.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        traversal(root);
        return secondMin==Double.MAX_VALUE?-1: (int) secondMin;
    }
    public void traversal(TreeNode root){
        if (root==null) return;
        if(root.val<firstMin){
            secondMin = firstMin;
            firstMin = root.val;
        }else if(root.val!=firstMin&&root.val<secondMin) secondMin = root.val;
        traversal(root.left);
        traversal(root.right);
    }
}
