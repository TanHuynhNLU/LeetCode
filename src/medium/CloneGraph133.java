package medium;

import java.util.*;

public class CloneGraph133 {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Queue<Node> queue = new LinkedList<>();
        HashMap<Node, Node> map = new HashMap<>();
        queue.add(node);
        map.put(node, new Node(node.val));
        while (!queue.isEmpty()) {
            Node currNode = queue.poll();
            Node clonedNode = map.get(currNode);
            List<Node> clonedNeighbours = new ArrayList<>();
            for (Node neighbor : currNode.neighbors) {
                if (!map.containsKey(neighbor)) {
                    Node newNode = new Node(neighbor.val);
                    map.put(neighbor, newNode);
                    clonedNeighbours.add(newNode);
                    queue.add(neighbor);
                } else {
                    clonedNeighbours.add(map.get(neighbor));
                }
            }
            clonedNode.neighbors = clonedNeighbours;
        }
        return map.get(node);
    }

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

//    public Node cloneGraph(Node node) {
//        if (node == null) return null;
//        return cloneNode(node, new HashMap<>());
//    }
//
//    private Node cloneNode(Node node, Map<Node, Node> visited) {
//        if (visited.containsKey(node)) {
//            return visited.get(node);
//        }
//        Node clone = new Node(node.val);
//        visited.put(node, clone);
//        for (Node neighbor : node.neighbors) {
//            clone.neighbors.add(cloneNode(neighbor, visited));
//        }
//        return clone;
//    }
}
