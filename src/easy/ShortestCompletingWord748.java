package easy;

public class ShortestCompletingWord748 {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String res = "";
        int min = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        for (char c: licensePlate.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        for (String word:words){
            if(word.length()<sb.toString().length()||word.length()>=min)
                continue;
            boolean flag = true;
            String tmp = word;
            for (char c:sb.toString().toCharArray()){
                if(tmp.indexOf(c)==-1){
                    flag=false;
                    break;
                }else {
                   tmp= tmp.replaceFirst(String.valueOf(c),"");
                }
            }
            if(flag){
                res=word;
                min=res.length();
            }
        }
        return res;
    }
//    Best solution
//public String shortestCompletingWord(String licensePlate, String[] words) {
//    String ans = "****************";
//    int[] count = new int[26];
//
//    for (char c : licensePlate.toCharArray())
//        if (Character.isLetter(c))
//            ++count[Character.toLowerCase(c) - 'a'];
//
//    for (final String word : words)
//        if (word.length() < ans.length() && isComplete(count, getCount(word)))
//            ans = word;
//
//    return ans;
//}
//
//    // Check if c1 is a subset of c2
//    private boolean isComplete(int[] c1, int[] c2) {
//        for (int i = 0; i < 26; ++i)
//            if (c1[i] > c2[i])
//                return false;
//        return true;
//    }
//
//    private int[] getCount(final String word) {
//        int[] count = new int[26];
//        for (final char c : word.toCharArray())
//            ++count[c - 'a'];
//        return count;
//    }

    public static void main(String[] args) {
        String [] words = {"step","steps","stripe","stepple"};
        System.out.println(shortestCompletingWord("1s3 PSt",words));
    }
}
