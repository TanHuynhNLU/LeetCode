package easy;

import java.util.LinkedList;
import java.util.Queue;

public class ReformatTheString1417 {
    public String reformat(String s) {
        int countLetters = 0;
        int countDigits = 0;
        Queue<Character> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                countDigits++;
                queue.add(c);
            } else {
                countLetters++;
                sb.append(c);
            }
        }
        if (Math.abs(countDigits - countLetters) > 1) return "";
        int i = 0;
        if (countLetters > countDigits) {
            i = 1;
        }
        while (!queue.isEmpty()) {
            sb.insert(i, queue.poll());
            i+=2;
        }
        return sb.toString();
//        Best solution
//        char [] c = s.toCharArray();
//
//        int digits = 0;
//        int letter = 0;
//
//        for(int i = 0; i < c.length; i++) {
//            if(c[i] >= '0' && c[i] <= '9') {
//                ++digits;
//            }
//            else {
//                ++letter;
//            }
//        }
//
//        if(digits != letter && digits + 1 != letter && letter + 1 != digits) {
//            return "";
//        }
//
//        char [] ans = new char[c.length];
//
//        if(digits > letter) {
//            digits = 0;
//            letter = 1;
//        }
//
//        else {
//            digits = 1;
//            letter = 0;
//        }
//
//        for(int i = 0; i < c.length; i++) {
//            if(c[i] >='0' && c[i] <= '9') {
//                ans[digits] = c[i];
//                digits += 2;
//            }
//            else {
//                ans[letter] = c[i];
//                letter += 2;
//            }
//        }
//        return new String(ans);
    }
}
