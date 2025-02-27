package easy;

import java.util.HashSet;

public class IntersectionOfTwoLinkedList160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> setListNode = new HashSet<>();
        while (headA != null || headB != null) {
            if (headA != null){
                if (setListNode.contains(headA)) return headA;
                else setListNode.add(headA);
                headA=headA.next;
            }

            if(headB!=null){
                if (setListNode.contains(headB)) return headB;
                else setListNode.add(headB);
                headB=headB.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(2);
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(8);
        headB.next = n1;
        n1.next = n2;
        n2.next = n3;

        ListNode result = getIntersectionNode(headA,headB);
    }
}
