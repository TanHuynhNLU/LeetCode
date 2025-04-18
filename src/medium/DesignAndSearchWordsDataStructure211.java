package medium;

public class DesignAndSearchWordsDataStructure211 {
    TrieNode root;

    public DesignAndSearchWordsDataStructure211() {
        this.root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            if (current.children[c - 'a'] == null) {
                current.children[c - 'a'] = new TrieNode();
            }
            current = current.children[c - 'a'];
        }
        current.isEnd = true;
    }

    public boolean search(String word) {
        return helper(this.root, word, 0);
    }

    public boolean helper(TrieNode node, String word, int index) {
        if (node.isEnd && index == word.length()) return true;
        if (index >= word.length()) return false;
        char c = word.charAt(index);
        if (c == '.') {
            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null && helper(node.children[i], word, index + 1)) return true;
            }
            return false;
        }
        if (node.children[c - 'a'] == null) return false;
        return helper(node.children[c - 'a'], word, index + 1);
    }

    class TrieNode {
        TrieNode[] children;
        boolean isEnd;

        public TrieNode() {
            children = new TrieNode[26];
        }
    }

    //Best Solution
//    public class TrieNode {
//
//        TrieNode[] children;
//        boolean word;
//
//        public TrieNode() {
//            children = new TrieNode[26];
//            word = false;
//        }
//    }
//
//    private TrieNode root;
//
//    public WordDictionary() {
//        root = new TrieNode();
//    }
//
//    public void addWord(String word) {
//        TrieNode cur = root;
//        for (char c : word.toCharArray()) {
//            if (cur.children[c - 'a'] == null) {
//                cur.children[c - 'a'] = new TrieNode();
//            }
//            cur = cur.children[c - 'a'];
//        }
//        cur.word = true;
//    }
//
//    public boolean search(String word) {
//        return dfs(word, 0, root);
//    }
//
//    private boolean dfs(String word, int j, TrieNode root) {
//        TrieNode cur = root;
//
//        for (int i = j; i < word.length(); i++) {
//            char c = word.charAt(i);
//            if (c == '.') {
//                for (TrieNode child : cur.children) {
//                    if (child != null && dfs(word, i + 1, child)) {
//                        return true;
//                    }
//                }
//                return false;
//            } else {
//                if (cur.children[c - 'a'] == null) {
//                    return false;
//                }
//                cur = cur.children[c - 'a'];
//            }
//        }
//        return cur.word;
//    }
}
