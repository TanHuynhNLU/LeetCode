package easy;

import java.util.HashSet;
import java.util.Stack;

public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (slowPointer!=null&&fastPointer!=null&&fastPointer.next!=null){
            stack.push(slowPointer.val);
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
        if (stack.isEmpty()) return true;
        while (slowPointer!=null){
            if(slowPointer.val==stack.peek()) stack.pop();
            slowPointer=slowPointer.next;
        }
        return stack.isEmpty();
//        Best solution
//        if(head==null || head.next==null){
//            return true;
//        }
//        //s1 find mid
//        ListNode fast=head;
//        ListNode slow =head;
//        while(fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        //mid is slow
//
//        //s2 reverse half part
//        ListNode next;
//        ListNode prev=null;
//        ListNode curr=slow;
//        while(curr!=null){
//            next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//        }
//
//        //s3 compare
//        ListNode right=prev;
//        ListNode left = head;
//        while(right!=null){
//            if(left.val!=right.val){
//                return false;
//            }
//            right=right.next;
//            left=left.next;
//        }
//        return true;
    }
}
