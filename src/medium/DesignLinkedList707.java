package medium;

public class DesignLinkedList707 {
    private MyNode head;
    private MyNode tail;
    private int size;

    public DesignLinkedList707() {
        this.size = 0;
    }

    public int get(int index) {
        MyNode curr = head;
        for (int i = 0; i < index; i++) {
            if (curr == null) return -1;
            curr = curr.next;
        }
        if (curr == null) return -1;
        else return curr.val;
    }

    public void addAtHead(int val) {
        MyNode node = new MyNode(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addAtTail(int val) {
        MyNode node = new MyNode(val);
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        MyNode curr = head;
        for (int i = 0; i < index; i++) {
            if (curr == null) return;
            curr = curr.next;
        }
        if (curr == null) return;
        MyNode prev = curr.prev;
        MyNode node = new MyNode(val);
        prev.next = node;
        node.next = curr;
        node.prev = prev;
        curr.prev = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size) return;
        if (index == 0) {
            deleteAtHead();
            return;
        }
        if (index == size - 1) {
            deleteAtTail();
            return;
        }
        MyNode curr = head;
        for (int i = 0; i < index; i++) {
            if (curr == null) return;
            curr = curr.next;
        }
        if (curr == null) return;
        MyNode prev = curr.prev;
        MyNode next = curr.next;
        prev.next = next;
        next.prev = prev;
        size--;
    }

    private void deleteAtHead() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        MyNode next = head.next;
        next.prev = null;
        head = next;
    }

    private void deleteAtTail() {
        if (tail == null) return;
        if (tail.prev == null) {
            head = null;
            tail = null;
            return;
        }
        MyNode prev = tail.prev;
        prev.next = null;
        tail = prev;
    }

    class MyNode {
        int val;
        MyNode prev;
        MyNode next;

        public MyNode(int val) {
            this.val = val;
        }
    }

}
// Solution
//    class MyLinkedList {
//
//        class Node {
//            int val;
//            Node next;
//
//            Node(int val) {
//                this.val = val;
//            }
//        }
//
//        private Node dummy;
//        private int size;
//
//        public MyLinkedList() {
//            dummy = new Node(0);
//            size = 0;
//        }
//
//        public int get(int index) {
//            if (index < 0 || index >= size) {
//                return -1;
//            }
//
//            Node curr = dummy.next;
//
//            for (int i = 0; i < index; i++) {
//                curr = curr.next;
//            }
//
//            return curr.val;
//        }
//
//        public void addAtHead(int val) {
//            addAtIndex(0, val);
//        }
//
//        public void addAtTail(int val) {
//            addAtIndex(size, val);
//        }
//
//        public void addAtIndex(int index, int val) {
//            if (index < 0) {
//                index = 0;
//            }
//
//            if (index > size) {
//                return;
//            }
//
//            Node prev = dummy;
//
//            for (int i = 0; i < index; i++) {
//                prev = prev.next;
//            }
//
//            Node node = new Node(val);
//            node.next = prev.next;
//            prev.next = node;
//
//            size++;
//        }
//
//        public void deleteAtIndex(int index) {
//            if (index < 0 || index >= size) {
//                return;
//            }
//
//            Node prev = dummy;
//
//            for (int i = 0; i < index; i++) {
//                prev = prev.next;
//            }
//
//            prev.next = prev.next.next;
//            size--;
//        }
//    }
