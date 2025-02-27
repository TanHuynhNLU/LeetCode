package easy;

import java.util.Arrays;

public class MaximumOddBinaryNumber2864 {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if(chars[i] == '1') count1++;
        }
        Arrays.fill(chars,'0');
        chars[n-1] ='1';
        for (int i = 0; i < count1-1; i++) {
            chars[i] ='1';
        }
        return new String(chars);
    }
}
