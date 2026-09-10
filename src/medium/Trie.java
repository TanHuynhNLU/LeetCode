package medium;

public class Trie {
    TrieNode root;

    public Trie(TrieNode root) {
        this.root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String s) {
        TrieNode curr = root;
        for (char c : s.toCharArray()) {
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new TrieNode();
            }
            curr = curr.children[c - 'a'];
        }
        curr.isEndOfWord = true;
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (current.children[ch - 'a'] == null) {
                // Word not found
                return false;
            }

            current = current.children[ch - 'a'];
        }
        return current != null && current.isEndOfWord;
    }

    // Check if a given prefix exists in the Trie
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);

            if (current.children[ch - 'a'] == null) {
                // Prefix not found
                return false;
            }

            current = current.children[ch - 'a'];
        }
        return true;
    }

}

class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26];
        isEndOfWord = false;
    }
}

