package medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LRUCache146 {
    int capacity;
    HashMap<Integer, Integer> map;
    LinkedList<Integer> list;

    public LRUCache146(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.list = new LinkedList<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            list.remove(Integer.valueOf(key));
            list.addFirst(key);
            return map.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            list.remove(Integer.valueOf(key));
            list.addFirst(key);
            map.put(key, value);
        } else {
            if (map.size() < capacity) {
                list.addFirst(key);
            } else {
                int lastKey = list.getLast();
                map.remove(lastKey);
                list.removeLast();
                list.addFirst(key);
            }
            map.put(key, value);
        }
    }

    //    Best Solution
//    class Node {
//        int key;
//        int value;
//        Node prev;
//        Node next;
//        Node(int key, int value) {
//            this.key = key;
//            this.value = value;
//        }
//    }
//
//    public Node[] map;
//    public int count, capacity;
//    public Node head, tail;
//
//    public LRUCache(int capacity) {
//        this.capacity = capacity;
//        count = 0;
//        map = new Node[10_000 + 1];
//        head = new Node(0, 0);
//        tail = new Node(0, 0);
//        head.next = tail;
//        tail.prev = head;
//        head.prev = null;
//        tail.next = null;
//    }
//
//    public void deleteNode(Node node) {
//        node.prev.next = node.next;
//        node.next.prev = node.prev;
//        return;
//    }
//
//    public void addToHead(Node node) {
//        node.next = head.next;
//        node.next.prev = node;
//        node.prev = head;
//        head.next = node;
//
//        return;
//    }
//
//    public int get(int key) {
//        if (map[key] != null) {
//            Node node = map[key];
//            int nodeVal = node.value;
//            deleteNode(node);
//            addToHead(node);
//            return nodeVal;
//        } else
//            return -1;
//    }
//
//    public void put(int key, int value) {
//        if (map[key] != null) {
//            Node node = map[key];
//            node.value = value;
//            deleteNode(node);
//            addToHead(node);
//        } else {
//            Node node = new Node(key, value);
//            map[key] = node;
//            if (count < capacity) {
//                count++;
//                addToHead(node);
//            } else {
//                map[tail.prev.key] = null;
//                deleteNode(tail.prev);
//                addToHead(node);
//            }
//        }
//
//        return;
//    }
}

