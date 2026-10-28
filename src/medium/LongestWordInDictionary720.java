package medium;

import java.util.*;

public class LongestWordInDictionary720 {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Map<String, Boolean> map = new HashMap<>();
        String res = "";
        for (String word : words) {
            if (word.length() == 1) {
                map.put(word, true);
                if (res.equals("")) res = word;
                else if (word.compareTo(res) < 0) res = word;
                continue;
            }
            String s = word.substring(0, word.length() - 1);
            if (map.containsKey(s) && map.get(s)) {
                map.put(word, true);
                if (word.length() > res.length()) {
                    res = word;
                }
                if (word.length() == res.length() && word.compareTo(res) < 0) res = word;
            } else {
                map.put(word, false);
            }
        }
        return res;
    }
    //Best solution
//    public String longestWord(String[] words) {
//        TrieNode root = new TrieNode();
//        for (String i : words)
//            insert(root, i);
//
//        String ans[] = new String[] { "" };
//        solve(root, ans);
//        return ans[0];
//    }
//
//    public void solve(TrieNode root, String ans[]) {
//        for (TrieNode node : root.arr) {
//            if (node != null && node.s != null) {
//                if (node.s.length() > ans[0].length())
//                    ans[0] = node.s;
//
//                solve(node, ans);
//            }
//        }
//    }
//
//    public void insert(TrieNode root, String s) {
//        TrieNode cur = root;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (cur.arr[ch - 'a'] == null)
//                cur.arr[ch - 'a'] = new TrieNode();
//
//            cur = cur.arr[ch - 'a'];
//        }
//        cur.s = s;
//    }
//    class TrieNode {
//        TrieNode arr[];
//        String s;
//
//        TrieNode() {
//            this.arr = new TrieNode[26];
//            this.s = null;
//        }
//    }
}
