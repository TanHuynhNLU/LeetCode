package easy;

import java.util.Arrays;

public class SplitWithMinimumSum2578 {
    public int splitNum(int num) {
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        int i = 0;
        for (char c : s.toCharArray()) {
            arr[i++] = Character.getNumericValue(c);
        }
        Arrays.sort(arr);
        int num1 = 0, num2 = 0;
        for (i = 0; i < arr.length; i += 2) {
            num1 = num1 * 10 + arr[i];
            if (i + 1 < arr.length)
                num2 = num2 * 10 + arr[i + 1];
        }
        return num1 + num2;
    }

    //    Best Solution
//    public int splitNum(int num) {
//
//        int[] arr = new int[10];
//        int c = 0;
//        int num1 = 0, num2 = 0;
//
//        while (num > 0) {
//            int d = num % 10;
//            arr[d]++;
//            num /= 10;
//        }
//
//        for (int i = 0; i < 10; i++) {
//            while (arr[i] > 0) {
//                if (c % 2 == 0) {
//                    num1 = num1 * 10 + i;
//                } else {
//                    num2 = num2 * 10 + i;
//                }
//                c++;
//                arr[i]--;
//            }
//        }
//
//        return num1 + num2;
//    }
}
