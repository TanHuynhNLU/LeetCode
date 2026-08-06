package medium;

import java.util.ArrayList;
import java.util.List;

public class PrintBinaryTree655 {
    public List<List<String>> printTree(TreeNode root) {
        int height = height(root);
        int m = height + 1;
        int n = (int) (Math.pow(2, height + 1) - 1);
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add("");
            }
            res.add(list);
        }
        helper(root, res, 0, (n - 1) / 2, height);
        return res;
    }

    public void helper(TreeNode root, List<List<String>> res, int row, int col, int height) {
        res.get(row).set(col, String.valueOf(root.val));
        if (root.left != null) {
            int colLeft = col - (int) Math.pow(2, height - row - 1);
            helper(root.left, res, row + 1, colLeft, height);
        }
        if (root.right != null) {
            int colRight = col + (int) Math.pow(2, height - row - 1);
            helper(root.right, res, row + 1, colRight, height);
        }
    }

    public int height(TreeNode root) {
        if (root == null) return -1;
        int left = height(root.left);
        int right = height(root.right);
        return 1 + Math.max(left, right);
    }
}
