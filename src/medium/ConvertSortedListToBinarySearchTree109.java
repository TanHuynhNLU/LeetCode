package medium;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListToBinarySearchTree109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        int[] arr = new int[size];
        cur = head;
        for (int i = 0; i < size; i++) {
            arr[i] = cur.val;
            cur = cur.next;
        }
        return sortedListToBST(arr, 0, arr.length - 1);
    }

    public TreeNode sortedListToBST(int[] arr, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = sortedListToBST(arr, start, mid - 1);
        root.right = sortedListToBST(arr, mid + 1, end);
        return root;
    }

    //    Best Solution
//    public TreeNode sortedListToBST(ListNode head) {
//        if (head == null)
//            return null;
//        if (head.next == null)
//            return new TreeNode(head.val);
//        ListNode slow = head;
//        ListNode fast = head.next.next;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        TreeNode res = new TreeNode(slow.next.val);
//        ListNode righthalf = slow.next.next;
//        slow.next = null;
//        res.left = sortedListToBST(head);
//        res.right = sortedListToBST(righthalf);
//        return res;
//    }
}
