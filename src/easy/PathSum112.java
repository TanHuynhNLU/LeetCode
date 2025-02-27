package easy;

import java.util.Stack;

public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();
        stack.push(root);
        sumStack.push(root.val);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            int sum = sumStack.pop();
            if(sum == targetSum&&(node.left==null&&node.right==null)) return true;
            if(node.right!=null) {
                stack.push(node.right);
                sumStack.push(sum+node.right.val);
            }
            if(node.left!=null) {
                stack.push(node.left);
                sumStack.push(sum+node.left.val);
            }
        }
        return false;
    }

    //Best Solution
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if (root == null) return false;
//        return sumPath(root, 0, targetSum);
//    }
//
//    private boolean sumPath(TreeNode root, int curVal, int targetSum) {
//        if (root == null) return false;
//        if (root.left == null && root.right == null && curVal + root.val == targetSum)
//            return true;
//        return sumPath(root.left, curVal+root.val, targetSum) || sumPath(root.right, curVal+root.val, targetSum);
//    }
}
