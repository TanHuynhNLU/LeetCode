package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertionSortList147 {
    public ListNode insertionSortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        Collections.sort(list);
        ListNode res = new ListNode(list.get(0));
        ListNode currNode = res;
        for (int i = 1; i < list.size(); i++) {
            currNode.next = new ListNode(list.get(i));
            currNode = currNode.next;
        }
        return res;
    }

    //    Popular Solution
//    public ListNode insertionSortList(ListNode head) {
//        ListNode dummy = new ListNode(0);
//        ListNode prev = dummy; // the last and thus largest of the sorted list
//
//        while (head != null) {       // the current inserting node
//            ListNode next = head.next; // Cache the next inserting node.
//            if (prev.val >= head.val)
//                prev = dummy; // Move `prev` to the front.
//            while (prev.next != null && prev.next.val < head.val)
//                prev = prev.next;
//            head.next = prev.next;
//            prev.next = head;
//            head = next; // Update the current inserting node.
//        }
//
//        return dummy.next;
//    }

    //    Best Solution
//    public ListNode insertionSortList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode slow = head;
//        ListNode fast = head;
//        ListNode prev = null;
//        while (fast != null && fast.next != null) {
//            prev = slow;
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        prev.next = null;
//
//        ListNode left = insertionSortList(head);
//        ListNode rigth = insertionSortList(slow);
//        ListNode dummy = new ListNode(0);
//        ListNode curr = dummy;
//
//        while (left != null && rigth != null) {
//            if (left.val < rigth.val) {
//                curr.next = left;
//                left = left.next;
//            } else {
//                curr.next = rigth;
//                rigth = rigth.next;
//            }
//            curr = curr.next;
//        }
//        if (left != null) {
//            curr.next = left;
//        } else if (rigth != null) {
//            curr.next = rigth;
//        }
//        return dummy.next;
//    }
}
