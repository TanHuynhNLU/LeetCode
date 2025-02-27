package easy;

public class MiddleOfTheLinkedList876 {
    public ListNode middleNode(ListNode head) {
        ListNode sPointer=head;
        ListNode fPointer = head;
        while (fPointer!=null&&fPointer.next!=null){
            sPointer = sPointer.next;
            fPointer = fPointer.next.next;
        }
        return sPointer;
    }
}
