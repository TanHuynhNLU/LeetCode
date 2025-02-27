package easy;

import java.util.ArrayList;
import java.util.List;

public class NarrayTreePostorderTraversal590 {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        traversal(root,res);
        return res;
    }
    public void traversal(Node root, List<Integer> res){
        if(root==null) return;
        for (Node node: root.children){
            traversal(node,res);
        }
        res.add(root.val);
    }

}
