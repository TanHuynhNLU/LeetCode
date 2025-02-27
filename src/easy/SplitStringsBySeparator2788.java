package easy;

import java.util.ArrayList;
import java.util.List;

public class SplitStringsBySeparator2788 {
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder("\\");
        sb.append(separator);
        for (String word : words) {
            String[] split = word.split(sb.toString());
            for (String s : split) {
                if (s.length() > 0) {
                    res.add(s);
                }
            }
        }
        return res;
    }

    //    Best Solution
//    public List<String> splitWordsBySeparator(List<String> words, char separator) {
//        ArrayList<String> output = new ArrayList<>();
//        for (String word : words) {
//            int start = 0;
//            int size = word.length();
//
//            for (int i = 0; i < size; i++) {
//                if (word.charAt(i) == separator) {
//                    if (start != i) output.add(word.substring(start, i));
//                    start = i + 1;
//                }
//            }
//
//            if (start < word.length())
//                output.add(word.substring(start));
//        }
//
//        return output;
//    }

    public static void main(String[] args) {
        List<String> words = List.of("one.two.three", "four.five", "six");
        splitWordsBySeparator(words, '.');
    }
}
