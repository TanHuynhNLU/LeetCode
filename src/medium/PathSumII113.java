package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PathSumII113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        backtrack(root, targetSum, 0, new ArrayList<>(), res);
        return res;
    }

    public void backtrack(TreeNode root, int targetSum, int sum, List<Integer> path, List<List<Integer>> res) {
        path.add(root.val);
        sum += root.val;
        if (sum == targetSum && root.left == null && root.right == null) {
            res.add(new ArrayList(path));
            return;
        }
        if (root.left != null) {
            backtrack(root.left, targetSum, sum, path, res);
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            backtrack(root.right, targetSum, sum, path, res);
            path.remove(path.size() - 1);

        }
    }
}
