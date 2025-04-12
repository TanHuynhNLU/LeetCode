package medium;

import java.util.*;

public class RepeatedDNASequences187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String subString = s.substring(i, i + 10);
            if (set.contains(subString)) {
                result.add(subString);
            } else {
                set.add(subString);
            }
        }
        return new ArrayList<>(result);
    }

    // Best Solution
//    public List<String> findRepeatedDnaSequences(String s) {
//        int seq = 10;
//        if (s.length() <= 10 || s.length() > 10000) return new ArrayList<>();
//        Set<String> seen = new HashSet<>();
//        Set<String> repeated = new HashSet<>();
//        for (int i = 0; i <= s.length() - seq; i++) {
//            String sub = s.substring(i, i + seq);
//            if (!seen.add(sub)) {
//                repeated.add(sub);
//            }
//        }
//        return new ArrayList(repeated);
//    }
}
