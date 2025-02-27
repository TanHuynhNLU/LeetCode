package easy;

import java.util.Stack;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree1379 {
    TreeNode res = null;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        inOrder(cloned, target.val);
        return res;
    }

    public void inOrder(TreeNode root, int target) {
        if (root == null) return;
        inOrder(root.left, target);
        if (root.val == target) {
            res = root;
            return;
        }
        inOrder(root.right, target);
    }
}
