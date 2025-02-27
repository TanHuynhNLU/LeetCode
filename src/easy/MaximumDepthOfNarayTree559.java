package easy;

import java.util.List;

public class MaximumDepthOfNarayTree559 {
    int max = 0;
    public int maxDepth(Node root) {
        depth(root,0);
        return max;
    }
    public void depth(Node root, int d){
        if(root==null) return ;
        if(d+1>max) max = d+1;
        for (Node n : root.children){
            depth(n,d+1);
        }
    }
//    Best solution
//public int maxDepth(Node root) {
//    if(root==null)
//        return 0;
//    int depth=0;
//    for(int i=0;i<root.children.size();i++){
//        depth=Math.max(depth,maxDepth(root.children.get(i)));
//    }
//    return depth+1;
//}

}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
