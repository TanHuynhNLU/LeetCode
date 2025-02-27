package medium;

public class RecoverBinarySearchTree99 {
    public static void recoverTree(TreeNode root) {
        if (root == null) return;
        TreeNode maxLeft = root.left != null ? findMax(root.left) : null;
        TreeNode minRight = root.right != null ? findMin(root.right) : null;
        if (maxLeft != null && maxLeft.val > root.val) {
            int temp = root.val;
            root.val = maxLeft.val;
            maxLeft.val = temp;
            return;
        }
        if (minRight != null && maxLeft != null && maxLeft.val > minRight.val) {
            int temp = maxLeft.val;
            maxLeft.val = minRight.val;
            minRight.val = temp;
            return;
        }
        if (minRight != null && minRight.val < root.val) {
            int temp = root.val;
            root.val = minRight.val;
            minRight.val = temp;
            return;
        }
        if (minRight != null && minRight.val < root.val) {
            int temp = root.val;
            root.val = minRight.val;
            minRight.val = temp;
            return;
        }
        recoverTree(root.left);
        recoverTree(root.right);
    }

    public static TreeNode findMax(TreeNode root) {
        if (root == null) return null;
        TreeNode maxNode = root;
        TreeNode maxLeft = root.left != null ? findMax(root.left) : null;
        TreeNode maxRight = root.right != null ? findMax(root.right) : null;
        if (maxLeft != null && maxLeft.val > maxNode.val) {
            maxNode = maxLeft;
        }
        if (maxRight != null && maxRight.val > maxNode.val) {
            maxNode = maxRight;
        }
        return maxNode;
    }

    public static TreeNode findMin(TreeNode root) {
        if (root == null) return null;
        TreeNode minNode = root;
        TreeNode minLeft = root.left != null ? findMin(root.left) : null;
        TreeNode minRight = root.right != null ? findMin(root.right) : null;
        if (minLeft != null && minLeft.val < minNode.val) {
            minNode = minLeft;
        }
        if (minRight != null && minRight.val < minNode.val) {
            minNode = minRight;
        }
        return minNode;
    }

    //    Best Solution
//    TreeNode prev = null, first = null, second = null;
//
//    public void inorder(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        inorder(root.left);
//        // Detect swapped nodes
//        if (prev != null && root.val < prev.val) {
//            if (first == null) {
//                first = prev;  // First incorrect node
//            }
//            second = root;  // Second incorrect node
//        }
//
//        prev = root;  // Move prev pointer to the current node
//        //prev = root;
//        inorder(root.right);
//    }
//
//    public void recoverTree(TreeNode root) {
//
//        if (root == null) {
//            return;
//        }
//        inorder(root);
//        if (first != null && second != null) {
//            int temp = first.val;
//            first.val = second.val;
//            second.val = temp;
//        }
//    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4, new TreeNode(2), null);

        System.out.println(findMin(root.right).val);
    }
}
