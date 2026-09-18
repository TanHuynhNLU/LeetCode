package medium;

public class LongestUnivaluePath687 {
    int res = 0;

    public int longestUnivaluePath(TreeNode root) {
        helper(root, -1001);
        return res;
    }

    public int helper(TreeNode root, int parent) {
        if (root == null) return 0;
        int left = helper(root.left, root.val);
        int right = helper(root.right, root.val);

        int ans = Math.max(left, right);
        res = Math.max(res, left + right);
        return root.val == parent ? 1 + ans : 0;
    }

    //Best solution
//    private int maxLen = 0;
//
//    public int longestUnivaluePath(TreeNode root) {
//        if (root == null) return 0;
//        dfs(root);
//        return maxLen;
//    }
//
//    private int dfs(TreeNode node) {
//        if (node == null) return 0;
//
//        int leftLen = 0, rightLen = 0;
//
//        if (node.left != null) {
//            int left = dfs(node.left);
//            if (node.left.val == node.val) {
//                leftLen = left + 1;   // edge from node to left child
//            }
//        }
//        if (node.right != null) {
//            int right = dfs(node.right);
//            if (node.right.val == node.val) {
//                rightLen = right + 1;
//            }
//        }
//
//        // Path passing through node
//        maxLen = Math.max(maxLen, leftLen + rightLen);
//
//        // Return the longer downward path to parent
//        return Math.max(leftLen, rightLen);
//    }
}
