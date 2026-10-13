package medium;

public class InsertIntoABinarySearchTree701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        TreeNode curr = root;
        while (curr != null) {
            if (val > curr.val) {
                if (curr.right == null) {
                    curr.right = new TreeNode(val);
                    return root;
                } else {
                    curr = curr.right;
                }
            } else {
                if (curr.left == null) {
                    curr.left = new TreeNode(val);
                    return root;
                } else {
                    curr = curr.left;
                }
            }
        }
        return root;
    }

    //Another solution
//    public TreeNode insertIntoBST(TreeNode root, int val) {
//        if(root==null)
//            return new TreeNode(val);
//        if(root.val>val){
//            root.left=insertIntoBST(root.left,val);
//        }
//        else
//            root.right=insertIntoBST(root.right,val);
//        return root;
//    }
}
