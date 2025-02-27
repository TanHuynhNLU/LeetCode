package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters1002 {
    public static List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        for (char c : words[0].toCharArray()) {
            res.add(String.valueOf(c));
        }
        for (int i = 1; i < words.length; i++) {
            List<String> tmp = new ArrayList<>();
            char[] word = words[i].toCharArray();
            for (char c: word){
                if(res.contains(String.valueOf(c))){
                    res.remove(String.valueOf(c));
                    tmp.add(String.valueOf(c));
                }
            }
            res = tmp;
        }
        return res;
    }
//    Best solution
//public List<String> commonChars(String[] A) {
//    int[] last = count(A[0]);
//    for (int i = 1; i < A.length; i++) {
//        last = intersection(last, count(A[i]));
//    }
//    List<String> arr = new ArrayList<>();
//    for (int i = 0; i < 26; i++) {
//        if (last[i] != 0) {
//            char a = 'a';
//            a += i;
//            String s = String.valueOf(a);
//            while (last[i] > 0) {
//                arr.add(s);
//                last[i]--;
//            }
//        }
//    }
//    return arr;
//}
//    int[] intersection(int[] a, int[] b) {
//        int[] t = new int[26];
//        for (int i = 0; i < 26; i++) {
//            t[i] = Math.min(a[i], b[i]);
//        }
//        return t;
//    }
//    int[] count(String str) {
//        int[] t = new int[26];
//        for (char c : str.toCharArray()) t[c - 'a']++;
//        return t;
//    }
//    Another Solution
//    List<String> ans = new ArrayList<>();
//    int[] count = new int[26];
//        Arrays.fill(count, Integer.MAX_VALUE);
//        for (String str : A) {
//        int[] cnt = new int[26];
//        str.chars().forEach(c -> ++cnt[c - 'a']); // count each char's frequency in string str.
//        for (int i = 0; i < 26; ++i) { count[i] = Math.min(cnt[i], count[i]); } // update minimum frequency.
//    }
//        for (char c = 'a'; c <= 'z'; ++c) {
//        while (count[c - 'a']-- > 0) { ans.add("" + c); }
//    }
//        return ans;

    public static void main(String[] args) {
       String[] words = {"bella","label","roller"};

        System.out.println(commonChars(words));
    }
}
