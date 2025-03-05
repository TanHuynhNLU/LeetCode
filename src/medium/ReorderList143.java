package medium;

import java.util.Stack;

public class ReorderList143 {
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode reverseListNode = reverse(slow);
        ListNode currReverse = reverseListNode;
        ListNode currNode = head;
        ListNode tail = head;
        while (currNode != null && currReverse != null) {
            tail = currReverse;
            ListNode nextNode = currNode.next;
            ListNode nextReverseNode = currReverse.next;
            currNode.next = currReverse;
            currReverse.next = nextNode;
            currNode = nextNode;
            currReverse = nextReverseNode;
        }
        if (currReverse != null && tail != null) {
            tail.next = currReverse;
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode currNode = head;
        ListNode nextNode = currNode.next;
        while (nextNode != null) {
            currNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
            nextNode = currNode.next;
        }
        return head;
    }

    //    Best Solution
//    static {
//        ListNode empty = null;
//        for (int i = 0; i < 500; i++) {
//            reorderList(empty);
//        }
//    }
//
//    public static void reorderList(ListNode head) {
//        if (head == null || head.next == null) {
//            return;
//        }
//
//        ListNode slow = head, fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        ListNode curr = slow.next, prev = null;
//        slow.next = null;
//        while (curr != null) {
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//
//        ListNode head1 = head, head2 = prev;
//        while (head2 != null) {
//            ListNode next1 = head1.next;
//            ListNode next2 = head2.next;
//
//            head1.next = head2;
//            head2.next = next1;
//            head1 = next1;
//            head2 = next2;
//        }
//
//    }
}
