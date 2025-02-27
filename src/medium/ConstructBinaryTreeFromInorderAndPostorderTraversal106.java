package medium;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, postorder, 0, inorder.length - 1, postorder.length - 1);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder, int start, int end, int parentIndex) {
        if (start > end || parentIndex < 0) return null;
        int findIndex = start;
        for (int i = start; i <= end; i++) {
            if (inorder[i] == postorder[parentIndex]) {
                findIndex = i;
                break;
            }
        }
        TreeNode node = new TreeNode(postorder[parentIndex]);
        node.right = buildTree(inorder, postorder, findIndex + 1, end, parentIndex - 1);
        node.left = buildTree(inorder, postorder, start, findIndex - 1, parentIndex - (end - findIndex) - 1);
        return node;
    }

    //    Best Solution
//    int i = 0, j = 0;
//
//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        i = inorder.length - 1;
//        j = i;
//        return buildTree(inorder, postorder, -3001);
//    }
//
//    public TreeNode buildTree(int[] inorder, int[] postorder, int x) {
//        if (i < 0)
//            return null;
//        if (inorder[j] == x) {
//            j--;
//            return null;
//        }
//        TreeNode cur = new TreeNode(postorder[i--]);
//        cur.right = buildTree(inorder, postorder, cur.val);
//        cur.left = buildTree(inorder, postorder, x);
//        return cur;
//    }
}
