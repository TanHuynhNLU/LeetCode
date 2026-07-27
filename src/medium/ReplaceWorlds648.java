package medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWorlds648 {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set = new HashSet<>(dictionary);
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        boolean f = false;
        for (char c : sentence.toCharArray()) {
            if (c == ' ') {
                if (!f) {
                    sb.append(tmp).append(" ");
                    tmp = new StringBuilder();
                }
                f = false;
            } else {
                if (f) continue;
                tmp.append(c);
                if (set.contains(tmp.toString())) {
                    sb.append(tmp).append(" ");
                    f = true;
                    tmp = new StringBuilder();
                }
            }
        }
        if (!tmp.isEmpty()) sb.append(tmp);
        return sb.toString().trim();
    }
    // Best Solution
//    public String replaceWords(List<String> dictionary, String sentence) {
//        Trie t = new Trie();
//        for(String s: dictionary) {
//            t.addWord(s);
//        }
//        StringBuilder sb = new StringBuilder();
//        String[] words = sentence.split(" ");
//        for(String word: words) {
//            String curr = t.searchPrefixAndReplace(word);
//            if(sb.length() > 0)
//                sb.append(" ");
//            sb.append(curr);
//        }
//        return sb.toString();
//    }
//
//    public class TrieNode {
//        TrieNode[] children;
//        boolean end;
//
//        public TrieNode() {
//            this.children = new TrieNode[26];
//            this.end = false;
//        }
//    }
//
//    public class Trie {
//        TrieNode root;
//
//        public Trie() {
//            this.root = new TrieNode();
//        }
//
//        public void addWord(String word) {
//            TrieNode curr = this.root;
//            for(char ch: word.toCharArray()) {
//                int index = ch - 'a';
//                if(curr.children[index] == null)
//                    curr.children[index] = new TrieNode();
//                curr = curr.children[index];
//            }
//            curr.end = true;
//        }
//
//        public String searchPrefixAndReplace(String word) {
//            return dfs(word, 0, this.root);
//        }
//
//        public String dfs(String word, int index, TrieNode node) {
//            if(index > word.length() - 1)
//                return word;
//            char ch = word.charAt(index);
//            int i = ch - 'a';
//            if(node.children[i] == null) {
//                return word;
//            }
//            node = node.children[i];
//            if(node.end)
//                return word.substring(0, index + 1);
//            return dfs(word, index + 1, node);
//        }
//    }
}
