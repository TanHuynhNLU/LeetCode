package medium;

import java.util.HashMap;
import java.util.Map;

public class ImplementTrie208 {
    TrieNode root;

    public ImplementTrie208() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            if (current.children[c - 'a'] == null) current.children[c - 'a'] = new TrieNode();
            current = current.children[c - 'a'];
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            TrieNode node = current.children[c - 'a'];
            if (node == null) return false;
            current = node;
        }
        return current.isWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            TrieNode node = current.children[c - 'a'];
            if (node == null) return false;
            current = node;
        }
        return true;
    }

    class TrieNode {
        TrieNode[] children;
        boolean isWord;

        public TrieNode() {
            this.children = new TrieNode[26];
        }
    }

    //Best Solution
//    Node root;
//
//    public Trie() {
//        root = new Node();
//    }
//
//    public void insert(String word) {
//        root.insert(word, 0);
//    }
//
//    public boolean search(String word) {
//        return root.search(word, 0);
//    }
//
//    public boolean startsWith(String prefix) {
//        return root.startsWith(prefix, 0);
//    }
//
//    class Node {
//        Node[] nodes;
//        boolean isEnd;
//
//        Node() {
//            nodes = new Node[26];
//        }
//
//        private void insert(String word, int idx) {
//            if (idx >= word.length()) return;
//            int i = word.charAt(idx) - 'a';
//            if (nodes[i] == null) {
//                nodes[i] = new Node();
//            }
//            if (idx == word.length() - 1) nodes[i].isEnd = true;
//            nodes[i].insert(word, idx + 1);
//        }
//
//        private boolean search(String word, int idx) {
//            if (idx >= word.length()) return false;
//            Node node = nodes[word.charAt(idx) - 'a'];
//            if (node == null) return false;
//
//            if (idx == word.length() - 1) {
//                return node.isEnd;
//            }
//            return node.search(word, idx + 1);
//        }
//
//        private boolean startsWith(String prefix, int idx) {
//            if (idx >= prefix.length()) return false;
//            Node node = nodes[prefix.charAt(idx) - 'a'];
//            if (node == null) return false;
//            if (idx == prefix.length() - 1) return true;
//
//            return node.startsWith(prefix, idx + 1);
//        }
//    }
}
