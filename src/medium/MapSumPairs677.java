package medium;

import java.util.HashMap;
import java.util.Map;

public class MapSumPairs677 {
    Map<String, Integer> map;

    public MapSumPairs677() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for (String key : map.keySet()) {
            if (key.startsWith(prefix)) sum += map.get(key);
        }
        return sum;
    }
}

// Best solution
//class TrieNode {
//    TrieNode[] children = new TrieNode[26];
//    int score = 0;
//}
//
//class MapSum {
//
//    TrieNode root;
//    HashMap<String, Integer> map;
//
//    public MapSum() {
//        root = new TrieNode();
//        map = new HashMap<>();
//    }
//
//    public void insert(String key, int val) {
//
//        int delta = val - map.getOrDefault(key, 0);
//        map.put(key, val);
//
//        TrieNode node = root;
//
//        for (char ch : key.toCharArray()) {
//            int idx = ch - 'a';
//
//            if (node.children[idx] == null)
//                node.children[idx] = new TrieNode();
//
//            node = node.children[idx];
//            node.score += delta;
//        }
//    }
//
//    public int sum(String prefix) {
//
//        TrieNode node = root;
//
//        for (char ch : prefix.toCharArray()) {
//            int idx = ch - 'a';
//
//            if (node.children[idx] == null)
//                return 0;
//
//            node = node.children[idx];
//        }
//
//        return node.score;
//    }
//}
