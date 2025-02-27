package easy;

import java.util.Arrays;

public class ReverseString344 {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        char tmp;
        while (left<right){
            tmp = s[left];
            s[left] =s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'a','b','c','d','e'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
