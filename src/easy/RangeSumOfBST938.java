package easy;

public class RangeSumOfBST938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (root.val >= low && root.val <= high) {
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        } else {
            return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
//        Best solution
//        int sum = 0; // Make sum a local variable
//
//        if (root == null) {
//            return 0;
//        }
//
//        if (root.val >= low && root.val <= high) {
//            sum += root.val;
//        }
//
//        if (root.val > low) {
//            sum += rangeSumBST(root.left, low, high);
//        }
//
//        if (root.val < high) {
//            sum += rangeSumBST(root.right, low, high);
//        }
//
//        return sum;
    }
}
