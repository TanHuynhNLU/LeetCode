package medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddTwoNumbersII445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<ListNode> stack1 = new ArrayDeque<>();
        Deque<ListNode> stack2 = new ArrayDeque<>();
        ListNode curr = l1;
        while (curr != null) {
            stack1.add(curr);
            curr = curr.next;
        }
        curr = l2;
        while (curr != null) {
            stack2.add(curr);
            curr = curr.next;
        }
        if (stack1.size() < stack2.size()) {
            return helper(stack2, stack1);
        } else {
            return helper(stack1, stack2);
        }
    }

    public ListNode helper(Deque<ListNode> stack1, Deque<ListNode> stack2) {
        int r = 0;
        ListNode res = stack1.peekFirst();
        while (!stack2.isEmpty()) {
            ListNode node1 = stack1.removeLast();
            ListNode node2 = stack2.removeLast();
            int sum = r + node1.val + node2.val;
            node1.val = sum % 10;
            r = sum / 10;
        }
        while (!stack1.isEmpty()) {
            ListNode node1 = stack1.removeLast();
            int sum = r + node1.val;
            node1.val = sum % 10;
            r = sum / 10;
        }
        if (r != 0) {
            ListNode node = new ListNode(r);
            node.next = res;
            return node;
        }
        return res;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    //Best solution
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        l1 = rev(l1);
//        l2 = rev(l2);
//        int carry = 0, sum = 0;
//        ListNode head = new ListNode(0);
//        ListNode temp = head;
//        while (l1 != null || l2 != null || carry != 0) {
//            int d1 = l1 != null ? l1.val : 0;
//            int d2 = l2 != null ? l2.val : 0;
//            sum = d1 + d2 + carry;
//            carry = sum / 10;
//            sum = sum % 10;
//
//            temp.next = new ListNode(sum);
//            temp = temp.next;
//            l1 = (l1 != null) ? l1.next : null;
//            l2 = (l2 != null) ? l2.next : null;
//        }
//        ListNode res = head.next;
//        res = rev(res);
//        return res;
//    }
//
//    ListNode rev(ListNode head) {
//        if (head == null || head.next == null)
//            return head;
//        ListNode prev = null, curr = head, next;
//        while (curr != null) {
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }
}
