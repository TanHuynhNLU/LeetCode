package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumberAfterDigitSwapsByParity2231 {
    public static int largestInteger(int num) {
        int res = 0;
        String s = String.valueOf(num);
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        boolean[] flagEvens = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (Character.getNumericValue(s.charAt(i)) % 2 == 0) {
                evens.add(Character.getNumericValue(s.charAt(i)));
                flagEvens[i] = true;
            } else {
                odds.add(Character.getNumericValue(s.charAt(i)));
            }
        }
        Collections.sort(evens, Collections.reverseOrder());
        Collections.sort(odds, Collections.reverseOrder());
        int j = 0;
        int k = 0;
        for (int i = 0; i < flagEvens.length; i++) {
            if (flagEvens[i])
                res = res * 10 + evens.get(j++);
            else
                res = res * 10 + odds.get(k++);
        }
        return res;
    }
//    Best solution
//    public int largestInteger(int num) {
//    int run = num;
//    int len = 0;
//    int[] arr = new int[10];
//    while (run > 0) {
//        arr[run % 10]++;
//        run /= 10;
//        len++;
//    }
//
//    int res = 0;
//    int pos = 0;
//    while (pos < len) {
//        if ((num % 10) % 2 == 0) {
//            for (int i = 0; i < 10; i += 2) {
//                if (arr[i] > 0) {
//                    res += Math.pow(10, pos) * i;
//                    arr[i]--;
//                    break;
//                }
//            }
//        } else {
//            for (int i = 1; i < 10; i += 2) {
//                if (arr[i] > 0) {
//                    res += Math.pow(10, pos) * i;
//                    arr[i]--;
//                    break;
//                }
//            }
//        }
//        pos++;
//        num /= 10;
//    }
//    return res;
//}

    public static void main(String[] args) {
        largestInteger(1234);
    }
}
