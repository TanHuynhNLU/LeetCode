package easy;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits){
        int length = digits.length;
        int r= 1;
       for(int i = length-1;i>=0;i--){
           int tmp = digits[i]+r;
           if(tmp==10&&i==0){
               int[] newArray = new int[length+1];
               newArray[0] = 1;
               return newArray;
           }
           if(tmp!=10) {
               digits[i] = tmp;
               return digits;
           }
           else {
               digits[i] = 0;
           }
       }
       return digits;
       //Best Solution
//        for (int i = digits.length - 1; i >= 0; i--) {
//            if (digits[i] < 9) {
//                digits[i]++;
//                return digits;
//            }
//            digits[i] = 0;
//        }
//
//        digits = new int[digits.length + 1];
//        digits[0] = 1;
//        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1,9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}
