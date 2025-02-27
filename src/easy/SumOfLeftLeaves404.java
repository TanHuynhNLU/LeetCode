package easy;

public class SumOfLeftLeaves404 {
    public static int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null) return sumOfLeftLeaves(root.right);
        TreeNode left = root.left;
        if(left.left==null &&left.right==null) return left.val + sumOfLeftLeaves(root.right);
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
//      Best solution
//        public int sumOfLeftLeaves(TreeNode root) {
//            return leafSum(root,false);
//        }
//        int leafSum(TreeNode root,boolean leaf){
//            if(root==null)  return 0;
//            if(root.left==null && root.right==null && leaf){
//                return root.val;
//            }
//            int ls=0,rs=0;
//            ls = ls + leafSum(root.left,true);
//            rs = rs + leafSum(root.right,false);
//
//            return ls+rs;
//        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        root.left = n1;
        root.right = n2;
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(5);
        n1.left = n3;
        n1.right = n4;
        System.out.println(sumOfLeftLeaves(root));
    }
}
