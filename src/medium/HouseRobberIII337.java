package medium;

public class HouseRobberIII337 {
//    public int rob(TreeNode root) {
//        int[] dfs = dfs(root);
//        return Math.max(dfs[0], dfs[1]);
//    }
//
//    //0=rod,1=notRob
//    public int[] dfs(TreeNode root) {
//        if (root == null) return new int[]{0, 0};
//        int[] left = dfs(root.left);
//        int[] right = dfs(root.right);
//        int rob = root.val + left[1] + right[1];
//        int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
//        return new int[]{rob, notRob};
//    }
}
