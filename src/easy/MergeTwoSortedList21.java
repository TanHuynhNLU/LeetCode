package easy;

class ListNode {
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

public class MergeTwoSortedList21 {

    private static ListNode l1;

    public static ListNode mergeTwoList(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode tmp;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            head = new ListNode(list1.val);
            tmp = head;
            list1 = list1.next;
        } else {
            head = new ListNode(list2.val);
            tmp = head;
            list2 = list2.next;
        }

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tmp.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                tmp.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            tmp = tmp.next;
        }
        while (list1!=null){
            tmp.next = new ListNode(list1.val);
            list1 = list1.next;
            tmp = tmp.next;
        }
        while (list2!=null){
            tmp.next = new ListNode(list2.val);
            list2 = list2.next;
            tmp = tmp.next;
        }
        return head;
    }

    public static void printNode(ListNode l) {
        ListNode node = l;
        while (node != null) {
            System.out.print(node.val + "=>");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;


        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(5);
        l4.next = l5;
        l5.next = l6;
        ListNode mergeTwoList = mergeTwoList(l1, l4);
        printNode(mergeTwoList);
    }
}
