package easy;

public class MergeTwoBinaryTrees617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null) return null;
        if(root1==null) {
            root1=root2;
            return root1;
        }
        else if(root2==null) {
            return root1;
        }else {
            root1.val+= root2.val;
            root1.left = mergeTrees(root1.left,root2.left);
            root1.right =mergeTrees(root1.right,root2.right);
        }
        return root1;
//        Best solution
        // if both are null, return null
//        if(root1 == null && root2 == null) return null;
//
//        // if root1 is null, then return root2
//        if(root1 == null) return root2;
//
//        // if root2 is null then return root1
//        if(root2 == null) return root1;
//
//        // if both are present, then create a new node with both value
//        TreeNode root = new TreeNode(root1.val + root2.val);
//
//        // call for left side, whatever gets add it to the left side of the root
//        root.left = mergeTrees(root1.left, root2.left);
//
//        // call for right side, whatever gets add it to the right side of the root
//        root.right = mergeTrees(root1.right, root2.right);
//
//        // return root
//        return root;
    }
}
