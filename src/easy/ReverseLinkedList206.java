package easy;

public class ReverseLinkedList206 {
    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode current = head;
        ListNode nextNode = head.next;
        while (nextNode != null) {
            current.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
            nextNode = current.next;
        }
        return head;
    }

    public static void printListNode(ListNode head) {
        ListNode tmp = head;
        while (tmp != null) {
            System.out.print(tmp.val + "=>");
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;

        printListNode(reverseList(n1));
    }
}
