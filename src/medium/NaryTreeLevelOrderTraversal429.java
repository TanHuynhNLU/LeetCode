package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int size = 1;
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int tmp = 0;
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                queue.addAll(curr.children);
                list.add(curr.val);
                tmp += curr.children.size();
            }
            size = tmp;
            res.add(list);
        }
        return res;
    }

    // Best Solution
//    public List<List<Integer>> levelOrder(Node root) {
//        List<List<Integer>> res = new ArrayList<>();
//        if(root == null) return res;
//        dfs(root, 0, res);
//        return res;
//    }
//
//    public void dfs(Node root, int depth, List<List<Integer>> res)
//    {
//        if(root == null) return;
//        if(depth == res.size()) res.add(new ArrayList<Integer>());
//        res.get(depth).add(root.val);
//        for(Node child: root.children)
//        {
//            dfs(child, depth + 1, res);
//        }
//    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}
