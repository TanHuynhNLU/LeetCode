package easy;

public class CountTheNumberOfConsistentStrings1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for(char c : word.toCharArray()){
                if(allowed.indexOf(c)==-1){
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent) count++;
        }
        return count;
    }

//    Best solution
//public int countConsistentStrings(String allowed, String[] words) {
//    boolean[] s = new boolean[26];
//    for (char c : allowed.toCharArray()) {
//        s[c - 'a'] = true;
//    }
//    int ans = 0;
//    for (String w : words) {
//        if (check(w, s)) {
//            ++ans;
//        }
//    }
//    return ans;
//}
//
//    private boolean check(String w, boolean[] s) {
//        for (int i = 0; i < w.length(); ++i) {
//            if (!s[w.charAt(i) - 'a']) {
//                return false;
//            }
//        }
//        return true;
//    }
}
