package medium;

public class MaximumBinaryTree654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int start, int end) {
        if (start > end) return null;
        int max = -1;
        int idx = -1;
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                idx = i;
            }
        }
        TreeNode leftNode = helper(nums, start, idx - 1);
        TreeNode rightNode = helper(nums, idx + 1, end);
        return new TreeNode(max, leftNode, rightNode);
    }
}
