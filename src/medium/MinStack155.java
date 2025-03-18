package medium;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MinStack155 {
    private Stack<Integer> stack;
    private PriorityQueue<Integer> queue;

    public MinStack155() {
        stack = new Stack<>();
        queue = new PriorityQueue<>();
    }

    public void push(int val) {
        stack.push(val);
        queue.add(val);
    }

    public void pop() {
        int val = stack.pop();
        queue.remove(val);
    }

    public int top() {
        return stack.lastElement();
    }

    public int getMin() {
        return queue.peek();
    }

    // Best Solution
//    private Node head;
//
//    /**
//     * initialize your data structure here.
//     */
//    public MinStack() {
//
//    }
//
//    public void push(int val) {
//        if (head == null) {
//            head = new Node(val, val, null);
//        } else {
//            head = new Node(val, Math.min(val, head.min), head);
//        }
//    }
//
//    public void pop() {
//        head = head.next;
//    }
//
//    public int top() {
//        return head.val;
//    }
//
//    public int getMin() {
//        return head.min;
//    }
//
//    private class Node {
//        int val;
//        int min;
//        Node next;
//
//        Node(int val, int min, Node next) {
//            this.val = val;
//            this.min = min;
//            this.next = next;
//        }
//    }
}
