package easy;

public class SymmetricTree101 {
    public static boolean isSymmetric(TreeNode root){
        return check(root.left,root.right);
    }

    public static boolean check(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null||right==null) return false;
        if(left.val!=right.val) return false;
        return check(left.left,right.right)&&check(left.right,right.left);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        n1.left = n2;
        n1.right = n3;
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(4);
        n2.left = n4;
        n2.right = n5;
        TreeNode n6 = new TreeNode(4);
        TreeNode n7 = new TreeNode(5);
        n3.left = n6;
        n3.right = n7;

        System.out.println(isSymmetric(n1));
    }
}
