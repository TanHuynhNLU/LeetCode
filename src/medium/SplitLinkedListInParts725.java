package medium;

public class SplitLinkedListInParts725 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        int count = 0;
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        int d = size / k;
        int r = size % k;
        ListNode tmpHead = head;
        curr = head;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= d; j++) {
                if (curr == null) continue;
                if (j == d) {
                    ListNode next = curr.next;
                    curr.next = null;
                    curr = next;
                } else
                    curr = curr.next;
            }
            res[count++] = tmpHead;
            tmpHead = curr;
        }
        for (int i = 0; i < k - r; i++) {
            for (int j = 0; j < d; j++) {
                if (curr == null) continue;
                if (j == d - 1) {
                    ListNode next = curr.next;
                    curr.next = null;
                    curr = next;
                } else
                    curr = curr.next;
            }
            res[count++] = tmpHead;
            tmpHead = curr;
        }
        return res;
    }
    // Another Solution
//    public ListNode[] splitListToParts(ListNode head, int k) {
//        // Step 1: Find the total length of the linked list
//        int length = 0;
//        ListNode current = head;
//        while (current != null) {
//            length++;
//            current = current.next;
//        }
//
//        // Step 2: Determine the base size of each part and the number of parts with an extra node
//        int baseSize = length / k;
//        int extraNodes = length % k;
//
//        ListNode[] result = new ListNode[k];
//        current = head;
//
//        for (int i = 0; i < k; i++) {
//            result[i] = current;
//
//            // Current part size: baseSize + 1 (if there are remaining extra nodes to distribute)
//            int currentPartSize = baseSize + (i < extraNodes ? 1 : 0);
//
//            // Traverse to the end of the current part
//            ListNode previous = null;
//            for (int j = 0; j < currentPartSize; j++) {
//                previous = current;
//                if (current != null) {
//                    current = current.next;
//                }
//            }
//
//            // Cut off the rest of the list for the next part
//            if (previous != null) {
//                previous.next = null;
//            }
//        }
//
//        return result;
//    }
}
