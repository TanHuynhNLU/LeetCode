package easy;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        traversal(root1,leaf1);
        traversal(root2,leaf2);

        return leaf1.equals(leaf2);
    }

    public void traversal(TreeNode root, List leaf){
        if(root==null) return;
        if(root.left==null&&root.right==null){
            leaf.add(root.val);
            return;
        }
        traversal(root.left,leaf);
        traversal(root.right,leaf);
    }
}
