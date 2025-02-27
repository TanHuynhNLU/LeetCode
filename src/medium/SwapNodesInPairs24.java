package medium;

public class SwapNodesInPairs24 {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            ListNode nextNode = currNode.next;
            int tmp = currNode.val;
            currNode.val = nextNode.val;
            nextNode.val = tmp;
            currNode = nextNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        swapPairs(n1);
    }
}
