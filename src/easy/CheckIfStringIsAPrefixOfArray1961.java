package easy;

public class CheckIfStringIsAPrefixOfArray1961 {
    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            if(!s.contains(word)) return false;
            sb.append(word);
            if(sb.length() == s.length()) break;
        }
        return sb.toString().equals(s);
    }

    public static void main(String[] args) {
        isPrefixString("iloveleetcode", new String[]{"i", "love", "leetcode","Apples"});
    }
}
