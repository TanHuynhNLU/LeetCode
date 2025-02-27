package medium;

public class RemoveNthNodeFromEndOfList19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        int size = 1;
        while (fast != null && fast.next != null && count < n) {
            fast = fast.next;
            count++;
            size++;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
            size++;
        }
        if (size == n) return head.next;
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        removeNthFromEnd(head, 2);
    }
}

