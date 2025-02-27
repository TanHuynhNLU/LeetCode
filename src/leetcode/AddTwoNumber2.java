package leetcode;

import java.util.List;
import java.util.Stack;

public class AddTwoNumber2 {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumber(ListNode l1, ListNode l2) {
        ListNode resultNode = null;
        ListNode tmp = resultNode;
        ListNode tmp1 = l1;
        ListNode tmp2 = l2;

        int r = 0;
        while (tmp1!=null && tmp2!=null){
            int sum = tmp1.val + tmp2.val+r;
            ListNode newNode = new ListNode(sum%10);
            r = sum/10;
            if(resultNode == null){
                resultNode = newNode;
                tmp = resultNode;
            }else {
                tmp.next = newNode;
                tmp = tmp.next;
            }
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }
        while (tmp1!=null){
            int sum = tmp1.val +r;
            ListNode newNode = new ListNode(sum%10);
            r = sum/10;
            tmp.next = newNode;
            tmp = tmp.next;
            tmp1 = tmp1.next;
        }
        while (tmp2!=null){
            int sum = tmp2.val +r;
            ListNode newNode = new ListNode(sum%10);
            r = sum/10;
            tmp.next = newNode;
            tmp = tmp.next;
            tmp2 = tmp2.next;

        }
        if(r!=0) tmp.next = new ListNode(r);
        return resultNode;
    }
    public static void printNode(ListNode l){
        ListNode tmp = l;
        while (tmp!=null){
            System.out.print(tmp.val);
            tmp = tmp.next;
            if(tmp!=null) System.out.print("=>");
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);

        l1.next = l2;
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);

        l4.next = l5;
        l5.next = l6;
        addTwoNumber(l1, l4);
        printNode(addTwoNumber(l1,l4));
    }
}
