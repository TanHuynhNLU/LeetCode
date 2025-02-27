package easy;

public class ConvertSortedArrayToBinarySearchTree108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBTS(nums, 0, nums.length - 1);
    }

    public TreeNode createBTS(int[] nums, int l, int r) {
        if (l > r) return null;
        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBTS(nums, l, mid - 1);
        root.right = createBTS(nums, mid + 1, r);
        return root;
    }


    public static void main(String[] args) {

    }
}
