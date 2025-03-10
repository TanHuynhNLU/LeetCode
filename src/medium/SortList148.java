package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList148 {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        List<Integer> list = new ArrayList<>();
        ListNode currNode = head;
        while (currNode != null) {
            list.add(currNode.val);
            currNode = currNode.next;
        }
        Collections.sort(list);
        ListNode res = new ListNode(list.get(0));
        currNode = res;
        for (int i = 1; i < list.size(); i++) {
            currNode.next = new ListNode(list.get(i));
            currNode = currNode.next;
        }
        return res;
    }

    //    Popular Solution
//    public ListNode sortList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode mid = getMiddle(head);
//        ListNode right = mid.next;
//        mid.next = null;
//
//        ListNode sortedLeft = sortList(head);
//        ListNode sortedRight = sortList(right);
//
//        return merge(sortedLeft, sortedRight);
//    }
//
//    private ListNode getMiddle(ListNode cur) {
//        ListNode tmp = cur.next;
//        while (tmp != null && tmp.next != null) {
//            cur = cur.next;
//            tmp = tmp.next.next;
//        }
//        return cur;
//    }
//
//    private ListNode merge(ListNode l, ListNode r) {
//        ListNode dummy = new ListNode();
//        ListNode cur = dummy;
//        while (l != null && r != null) {
//            if (l.val < r.val) {
//                cur.next = l;
//                l = l.next;
//            } else {
//                cur.next = r;
//                r = r.next;
//            }
//            cur = cur.next;
//
//        }
//        // no need for while loop since left and right only have at most 1 node difference
//        if (l != null) {
//            cur.next = l;
//        }
//        if (r != null) {
//            cur.next = r;
//        }
//        return dummy.next;
//
//    }

    //    Best solution
//    public ListNode sortList(ListNode head) {
//        if (head == null) return head;
//        return quickSort(head);
//    }
//
//    private ListNode quickSort(ListNode head) {
//        return quickSort(head, null);
//    }
//
//    private ListNode quickSort(ListNode head, ListNode stop) {
//        if (head == null || head.next == null || head == stop || head.next == stop) return head;
//        ListNode prev = head;
//        ListNode lowHead = head;
//        ListNode tail = head.next;
//        boolean isSorted = true;
//        while (tail != stop) {
//            isSorted = isSorted && prev.val <= tail.val;
//            if (tail.val < head.val) {
//                prev.next = tail.next;
//                tail.next = lowHead;
//                lowHead = tail;
//            } else {
//                prev = prev.next;
//            }
//            tail = prev.next;
//        }
//        if (isSorted) return head;
//        ListNode result = quickSort(lowHead, head);
//        head.next = quickSort(head.next, stop);
//        return result;
//    }
}
