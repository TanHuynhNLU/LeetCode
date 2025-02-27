package easy;

public class RemoveLinkedListElements203 {
    public ListNode removeElements(ListNode head, int val) {
       if(head==null) return null;
       ListNode current = head;
       ListNode nextNode = current.next;
       while (nextNode!=null){
           if(nextNode.val==val){
               current.next = nextNode.next;
           }else {
               current = nextNode;
           }
           nextNode = nextNode.next;
       }
       if(head.val==val) return head.next;
       return head;
    }
}
