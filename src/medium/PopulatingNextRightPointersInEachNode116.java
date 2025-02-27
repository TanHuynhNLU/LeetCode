package medium;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode116 {
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                if (!queue.isEmpty() && i != size - 1) node.next = queue.peek();
            }
        }
        return root;
    }

    //    Best Solution
//    public Node connect(Node root) {
//        if (root == null) return null;
//
//        Node leftmost = root;
//
//        while (leftmost.left != null) {
//            Node current = leftmost;
//
//            while (current != null) {
//                current.left.next = current.right;
//                if (current.next != null) {
//                    current.right.next = current.next.left;
//                }
//                current = current.next;
//            }
//            leftmost = leftmost.left;
//        }
//        return root;
//    }
}
