package easy;

public class MaximumNumberOfWordsYouCanType1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        char[] chars = brokenLetters.toCharArray();
        int count = 0;
        for (String word : words) {
            for (char c : chars) {
                if (word.contains(String.valueOf(c))) {
                    count++;
                    break;
                }
            }
        }
        return words.length - count;
    }

    //    Best Solution
//    int ans = 0;
//
//    public int canBeTypedWords(String text, String brokenLetters) {
//        Set<Character> set = new HashSet();
//        for (char c : brokenLetters.toCharArray()) set.add(c);
//
//        String[] arr = text.split(" ");
//
//        for (int i = 0; i < arr.length; i++) traverse(arr[i], set);
//        return ans;
//    }
//
//    public void traverse(String s, Set<Character> set) {
//        for (int i = 0; i < s.length(); i++)
//            if (set.contains(s.charAt(i))) return;
//        ans++;
//    }
}
