package medium;

import java.util.ArrayList;
import java.util.List;

public class LongestWordInDictionaryThroughDeleting524 {
    public String findLongestWord(String s, List<String> dictionary) {
        dictionary.sort((o1, o2) -> {
            if (o1.length() != o2.length())
                return Integer.compare(o2.length(), o1.length());
            else return o1.compareTo(o2);
        });
        for (String s1 : dictionary) {
            if (helper(s1, s)) return s1;
        }
        return "";
    }

    public boolean helper(String s1, String s2) {
        int start = 0;
        for (char c : s1.toCharArray()) {
            int idx = s2.indexOf(c, start);
            if (idx == -1) return false;
            start = idx + 1;
        }
        return true;
    }

    //Best Solution
//    public String findLongestWord(String s, List<String> dictionary) {
//        int[][] nextChar = preprocess(s);
//        String output = null;
//        for(String word : dictionary)
//            if(found(nextChar, word) && (output==null || output.length() < word.length() || (output.length() == word.length() && output.compareTo(word)>0)))
//                output = word;
//        return (output==null)?"":output;
//    }
//    private boolean found(int[][] nextChar, String word) {
//        int ind=nextChar[0][word.charAt(0)-'a']+1;
//        for(int i=1;i<word.length();i++) {
//            if(ind==0)return false;
//            ind = nextChar[ind][word.charAt(i)-'a']+1;
//        }
//        return ind!=0;
//    }
//    private int[][] preprocess(String s) {
//        int n = s.length();
//        int[][] nextChar = new int[n+1][26];
//        Arrays.fill(nextChar[n], -1);
//        for(int i=n-1;i>=0;i--) {
//            for(int j=0;j<26;j++)
//                nextChar[i][j] = nextChar[i+1][j];
//            nextChar[i][s.charAt(i)-'a'] = i;
//        }
//        return nextChar;
//    }
}
