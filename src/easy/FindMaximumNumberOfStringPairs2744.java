package easy;

import java.util.HashSet;
import java.util.Set;

public class FindMaximumNumberOfStringPairs2744 {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int count = 0;
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            if (set.contains(sb.reverse().toString())) count++;
            else set.add(word);
        }
        return count;
    }

    //    Best Solution
//    public int maximumNumberOfStringPairs(String[] words) {
//        int count = 0;
//        int imax = words.length - 1;
//        int jmax = words.length;
//        for (int i = 0; i < imax; i++) {
//            for (int j = i + 1; j < jmax; j++) {
//                if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
//                    count++;
//                }
//            }
//        }
//        return count;
//
//    }
}
