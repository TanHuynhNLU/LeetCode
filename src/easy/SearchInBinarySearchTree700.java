package easy;

public class SearchInBinarySearchTree700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root==null) return null;
        if(root.val==val) return root;
        if(val>root.val) return searchBST(root.right,val);
        else return searchBST(root.left,val);
    }
}
