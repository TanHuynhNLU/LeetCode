package medium;

public class PartitionList86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        ListNode small = new ListNode(0);
        ListNode currSmall = small;
        ListNode large = new ListNode(0);
        ListNode currLarge = large;

        ListNode tmp = head;
        while (tmp != null) {
            if (tmp.val < x) {
                currSmall.next = new ListNode(tmp.val);
                currSmall = currSmall.next;
            } else {
                currLarge.next = new ListNode(tmp.val);
                currLarge = currLarge.next;
            }
            tmp = tmp.next;
        }
        currSmall.next = large.next;
        head = small.next;
        return head;
    }
}
