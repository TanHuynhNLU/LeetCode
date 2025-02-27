package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NArayTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        preorderTraversal(root,res);
        return res;
    }
    public void preorderTraversal(Node root, List<Integer> res){
        if (root == null) return;
        res.add(root.val);
        for(Node node:root.children){
            preorderTraversal(node,res);
        }
    }
}
