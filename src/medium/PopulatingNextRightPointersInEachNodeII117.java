package medium;

import java.util.HashMap;
import java.util.Map;

public class PopulatingNextRightPointersInEachNodeII117 {
    Map<Integer, Node> map = new HashMap<>();

    public Node connect(Node root) {
        if (root == null) return null;
        traverse(root, 1);
        return root;
    }

    public void traverse(Node root, int level) {
        if (root == null) return;
        System.out.print(root.val + ",");
        root.next = map.getOrDefault(level, null);
        map.put(level, root);

        traverse(root.right, level + 1);
        traverse(root.left, level + 1);
    }
}
