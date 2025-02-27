package easy;

public class PermutationDifferenceBetweenTwoStrings3146 {
    public int findPermutationDifference(String s, String t) {
        int[] charsS = new int[26];
        int[] charsT = new int[26];
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            charsS[c1-'a']=i;
            charsT[c2-'a']=i;
        }
        for (int i = 0; i < 26; i++) {
            res += Math.abs(charsS[i] - charsT[i]);
        }
        return res;
    }
}
