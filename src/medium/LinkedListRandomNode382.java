package medium;

public class LinkedListRandomNode382 {
    ListNode[] listNodes = new ListNode[10000];
    int size;

    public LinkedListRandomNode382(ListNode head) {
        ListNode node = head;
        while (node != null) {
            listNodes[size++] = node;
            node = node.next;
        }
    }

    public int getRandom() {
        int randomIndex = (int) (Math.random() * size);
        return listNodes[randomIndex].val;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(10);
        node.next = new ListNode(1);
        node.next.next = new ListNode(10);
        node.next.next.next = new ListNode(20);
        node.next.next.next.next = new ListNode(100);
        LinkedListRandomNode382 randomNode382 = new LinkedListRandomNode382(node);
        randomNode382.getRandom();
    }
}
