package medium;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeIterator173 {
    List<Integer> list;
    int currIndex;

    public BinarySearchTreeIterator173(TreeNode root) {
        list = new ArrayList<>();
        inorder(root);
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public int next() {
        return list.get(currIndex++);
    }

    public boolean hasNext() {
        return currIndex < list.size();
    }
}
