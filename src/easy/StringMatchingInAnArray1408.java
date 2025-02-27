package easy;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray1408 {
    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) continue;
                if (words[j].indexOf(words[i]) != -1) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
}
