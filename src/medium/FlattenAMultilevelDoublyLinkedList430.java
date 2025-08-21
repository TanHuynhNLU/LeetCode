package medium;

public class FlattenAMultilevelDoublyLinkedList430 {
    Node prev;

    public Node flatten(Node head) {
        prev = new Node();
        prev.val = 0;
        Node res = prev;
        traversal(head);
        return res.next;
    }

    public void traversal(Node head) {
        if (head == null) return;
        Node node = new Node();
        node.val = head.val;
        if (prev.val != 0)
            node.prev = prev;

        prev.next = node;
        prev = prev.next;
        traversal(head.child);
        traversal(head.next);
    }

    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }
}
