package medium;

public class OddEvenLinkedList328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode headOdd = new ListNode(0);
        ListNode headEven = new ListNode(0);

        ListNode currOdd = headOdd;
        ListNode currEven = headEven;

        ListNode currNode = head.next;

        while (currNode != null) {
            currEven.next = new ListNode(currNode.val);
            currEven = currEven.next;
            if(currNode.next==null) break;
            currNode = currNode.next.next;
        }
        currNode = head;

        while (currNode != null) {
            currOdd.next = new ListNode(currNode.val);
            currOdd = currOdd.next;
            if(currNode.next==null) break;
            currNode = currNode.next.next;
        }

        currOdd.next = headEven.next;

        return headOdd.next;
    }
    //Best solution
//    public ListNode oddEvenList(ListNode head) {
//        if(head == null) return null;
//
//        ListNode odd = head, even = head.next;
//        ListNode evenHead = even;
//
//        while(even != null && even.next != null){
//            odd.next = even.next;
//            odd = odd.next;
//            even.next = odd.next;
//            even = even.next;
//        }
//
//        odd.next = evenHead;
//
//        // System.out.println(even.val);
//        return head;
//    }
}
