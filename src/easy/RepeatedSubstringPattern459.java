package easy;

import java.util.LinkedList;
import java.util.Queue;

public class RepeatedSubstringPattern459 {
    public static boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length()/2; i++) {
            sb.append(s.charAt(i));
            count=i+1;
            if (s.length() % sb.length() == 0) {
                while (count!=s.length()&&s.indexOf(sb.toString(), count) == count) {
                    count += sb.length();
                }
                if(count==s.length()) return true;
                else count=i+1;
            }
        }
        return false;
//        Best solution
//        int len = s.length();
//
//
//        for(int i = len / 2; i > 0; i--){
//            if(len % i == 0 && s.charAt(i - 1) == s.charAt(len - 1)){
//                String ss = s.substring(0, i);
//                int repeat = len / i;
//                if(ss.repeat(repeat).equals(s)){
//                    return true;
//                }
//            }
//        }
//        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
    }
}
