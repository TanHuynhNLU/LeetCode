package easy;

public class FindTheDifference389 {
    public char findTheDifference(String s, String t) {
       int[] chars = new int[26];
       for (char c : s.toCharArray()){
           chars[c-'a']++;
       }
       for (char c: t.toCharArray()){
           if(chars[c-'a']>0) chars[c-'a']--;
           else return c;
       }
       return ' ';
//       Best solution
//        int ans [] = new int[26];
//
//        for(char ch:t.toCharArray()) ans[ch-'a']++;
//        for(char ch:s.toCharArray()) ans[ch-'a']--;
//
//        for(int i=0;i<ans.length;i++){
//            if(ans[i] == 1){
//                return (char)(i+'a');
//            }
//        }
//        return ' ';
//        Solution using xor bitwise
//        char c = 0;
//        for(char cs : s.toCharArray()) c ^= cs;
//        for(char ct : t.toCharArray()) c ^= ct;
//        return c;
    }
}
