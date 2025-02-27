package easy;

import java.util.HashSet;

public class TwoSumIV_InputIsABST {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet();
        return traversal(root,k,set);
    }
    public boolean traversal(TreeNode root, int k, HashSet<Integer> set){
        if(root==null) return false;
        if(set.contains(root.val)) return true;
        else set.add(k-root.val);
        return traversal(root.left,k,set)||traversal(root.right,k,set);
    }
//    Best solution
//public boolean findTarget(TreeNode root, int k) {
//    if(root == null) return false;
//    return preOrder(root, root, k);
//}
//
//    public boolean preOrder(TreeNode root, TreeNode node, int k) {
//        if(node == null) return false;
//        if(binarySearch(root, node, k - node.val)) return true;
//        if(preOrder(root, node.left, k)) return true;
//        if(preOrder(root, node.right, k)) return true;
//
//        return false;
//    }
//
//    public boolean binarySearch(TreeNode root, TreeNode node, int target) {
//        if(root == null) return false;
//        if(node != root && root.val == target) return true;
//        else if(root.val < target) return binarySearch(root.right, node, target);
//        else return binarySearch(root.left, node, target);
//    }
}
