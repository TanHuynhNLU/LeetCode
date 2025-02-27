package medium;

public class RemoveDuplicatesFromSortedListII82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode cur = head;
        ListNode prev = res;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                prev.next = cur.next;
            } else {
                prev = prev.next;
            }
            cur = cur.next;
        }
        return res.next;
    }

}
