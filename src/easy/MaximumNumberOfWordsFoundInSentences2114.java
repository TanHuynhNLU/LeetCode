package easy;

public class MaximumNumberOfWordsFoundInSentences2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            String[] words = s.split(" ");
            max = Math.max(max, words.length);
        }
        return max;
    }

    //    Best Solution
//    public int countSen(String s) {
//        int count = 1;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ' ') {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public int mostWordsFound(String[] sentences) {
//        int max = 0;
//        for (int i = 0; i < sentences.length; i++) {
//            String s = sentences[i];
//            max = Math.max(max, countSen(s));
//        }
//        return max;
//    }
}
