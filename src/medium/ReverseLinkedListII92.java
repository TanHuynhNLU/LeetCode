package medium;

public class ReverseLinkedListII92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        int count = 1;
        while (curr != null) {
            while (curr.next != null && count >= left && count <= right) {
                ListNode nextNode = curr.next;
                curr.next = nextNode.next;
                nextNode.next = prev.next;
                prev.next = nextNode;
                count++;
            }
            prev = curr;
            curr = curr.next;
            count++;
        }
        return dummy.next;
    }
}
