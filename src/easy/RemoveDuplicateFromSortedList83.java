package easy;

public class RemoveDuplicateFromSortedList83 {
    static class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode deleteDuplicates(ListNode head){
        if(head == null) return null;
        ListNode current = head;
        ListNode nextNode = current.next;
        while (nextNode!=null){
            if(nextNode.val== current.val){
                current.next = nextNode.next;
            }else {
                current = nextNode;
            }
            nextNode = nextNode.next;
        }
        return head;
    }

    public static void printListNode(ListNode head){
        ListNode tmp = head;
        while (tmp!=null){
            System.out.print(tmp.val+"=>");
            tmp= tmp.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode result = deleteDuplicates(l1);
        printListNode(l1);
    }
}

