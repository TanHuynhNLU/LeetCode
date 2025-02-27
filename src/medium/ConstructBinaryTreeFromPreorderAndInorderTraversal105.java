package medium;

import java.util.Stack;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, inorder.length - 1, 0);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int start, int end, int parentIndex) {
        if (start > end || parentIndex > preorder.length) return null;
        int findIndex = start;
        for (int i = start; i <= end; i++) {
            if (inorder[i] == preorder[parentIndex]) findIndex = i;
        }
        TreeNode node = new TreeNode(preorder[parentIndex]);
        node.left = buildTree(preorder, inorder, start, findIndex - 1, parentIndex + 1);
        node.right = buildTree(preorder, inorder, findIndex + 1, end, parentIndex + (findIndex - start) + 1);
        return node;
    }

    //    Best solution
//    private int i = 0;
//    private int p = 0;
//
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        return build(preorder, inorder, Integer.MIN_VALUE);
//    }
//
//    private TreeNode build(int[] preorder, int[] inorder, int stop) {
//        if (p >= preorder.length) {
//            return null;
//        }
//        if (inorder[i] == stop) {
//            ++i;
//            return null;
//        }
//
//        TreeNode node = new TreeNode(preorder[p++]);
//        node.left = build(preorder, inorder, node.val);
//        node.right = build(preorder, inorder, stop);
//        return node;
//    }
}
