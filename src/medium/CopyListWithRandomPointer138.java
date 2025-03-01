package medium;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer138 {
    public Node copyRandomList(Node head) {
        return copy(head, new HashMap<Node, Node>());
    }

    public Node copy(Node head, Map<Node, Node> map) {
        if (head == null) return null;
        Node copyNode = map.getOrDefault(head, new Node(head.val));
        map.put(head, copyNode);
        if (head.random != null) {
            Node copyRandomNode = map.getOrDefault(head.random, new Node(head.random.val));
            copyNode.random = copyRandomNode;
            map.put(head.random, copyRandomNode);
        }
        copyNode.next = copy(head.next, map);
        return copyNode;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
