package easy;

import java.util.HashMap;

public class RomanToInteger11 {
    public static int romanToInt(String s) {
        int total = 0;
        HashMap<Character, Integer> romansMap = new HashMap<>();
        romansMap.put('I', 1);
        romansMap.put('V', 5);
        romansMap.put('X', 10);
        romansMap.put('L', 50);
        romansMap.put('C', 100);
        romansMap.put('D', 500);
        romansMap.put('M', 1000);
        int i = 0;
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            char nc=' ';
            if(i+1<s.length())
             nc = s.charAt(i + 1);
            if (c == 'I' && (nc == 'V' || nc == 'X')) {
                total += romansMap.get(nc) - romansMap.get(c);
                i++;
            }
            else if (c == 'X' && (nc == 'L' || nc == 'C')) {
                total += romansMap.get(nc) - romansMap.get(c);
                i++;
            }
            else if (c == 'C' && (nc == 'D' || nc == 'M')) {
                total += romansMap.get(nc) - romansMap.get(c);
                i++;
            }
            else{
                total += romansMap.get(c);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("DCXXI"));
    }
}
