package medium;

public class TrimABinarySearchTree669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        if (root.val < low || root.val > high) return deleteNode(root, root.val);
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val < key) root.right = deleteNode(root.right, key);
        if (root.val > key) root.left = deleteNode(root.left, key);
        if (root.val == key) {
            if (root.left == null && root.right == null) return null;
            if (root.left != null && root.right != null) {
                TreeNode node = findMinRight(root.right);
                root.val = node.val;
                root.right = deleteNode(root.right, node.val);
                return root;
            }
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
        }
        return root;
    }

    public TreeNode findMinRight(TreeNode root) {
        TreeNode curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    //Best solution
//    public TreeNode trimBST(TreeNode root, int low, int high) {
//        if(root==null)return null;
//        if(root.val<low){
//            return trimBST(root.right,low,high);
//        }
//
//        if(root.val>high){
//            return trimBST(root.left,low,high);
//        }
//        root.left = trimBST(root.left, low, high);
//        root.right = trimBST(root.right, low, high);
//
//        return root;
//    }
}
