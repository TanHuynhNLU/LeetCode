package medium;

import java.util.TreeMap;

public class MyCalendarI729 {
    TreeMap<Integer, Integer> map;

    public MyCalendarI729() {
        map = new TreeMap<>();
    }

    public boolean book(int startTime, int endTime) {
        Integer prevKey = map.floorKey(startTime);
        Integer nextKey = map.ceilingKey(startTime);
        if ((prevKey == null || startTime >= map.get(prevKey)) && (nextKey == null || endTime <= nextKey)) {
            map.put(startTime, endTime);
            return true;
        }
        return false;
    }

    //Best Solution
//    private Node root;
//
//    public MyCalendar() {
//        root = null;
//    }
//
//    public boolean book(int startTime, int endTime) {
//        if (root == null) {
//            root = new Node(startTime, endTime);
//            return true;
//        }
//
//        Node curr = root;
//        while (true) {
//            if (endTime <= curr.start) {
//                if (curr.left == null) {
//                    curr.left = new Node(startTime, endTime);
//                    return true;
//                }
//                curr = curr.left;
//            } else if (startTime >= curr.end) {
//                if (curr.right == null) {
//                    curr.right = new Node(startTime, endTime);
//                    return true;
//                }
//                curr = curr.right;
//            } else {
//                return false;
//            }
//        }
//    }
//}
//
//class Node {
//    int start, end;
//    Node left, right;
//
//    Node(int start, int end) {
//        this.start = start;
//        this.end = end;
//    }
}
