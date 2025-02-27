package medium;

public class RotateList61 {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int size = 1;
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
            size++;
        }
        k = k % size;
        if(k == 0) return head;
        ListNode fPointer = head;
        ListNode sPointer = head;
        for (int i = 0; i < k; i++) {
            sPointer = sPointer.next;
        }
        while (sPointer.next != null) {
            fPointer = fPointer.next;
            sPointer = sPointer.next;
        }
        ListNode newHead = fPointer.next;
        fPointer.next = null;
        sPointer.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        n1.next = n2;
        n2.next = n3;
        rotateRight(n1, 4);
    }

    static class ListNode {
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
}

