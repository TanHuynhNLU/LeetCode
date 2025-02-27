package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountCommonWordsWithOneOccurrence2085 {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (String word : words1) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }
        for (String word : words2) {
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }
        for (String key2 : map2.keySet()) {
            if (map2.get(key2) == 1 && map1.get(key2) != null && map1.get(key2) == 1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words1 = {"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = {"amazing", "leetcode", "is"};
    }
}
