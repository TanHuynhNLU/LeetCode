package easy;

import java.util.HashMap;
import java.util.HashSet;

public class CountPairsOfSimilarStrings2506 {
    public int similarPairs(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (String word : words) {
            int[] counts = new int[26];
            for (char c:word.toCharArray()) {
                counts[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (counts[i] > 0) {
                    sb.append((char)(i + 'a'));
                }
            }
            if(map.containsKey(sb.toString())){
                count += map.get(sb.toString());
            }
            map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
        }
        return count;
    }
}
