package easy;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int n = num.length - 1;
        int r = 0;
        while (n >= 0 && k != 0) {
            r += num[n] + k % 10;
            res.add(r % 10);
            r /= 10;
            k /= 10;
            n--;
        }
        for (int i = n; i >= 0; i--) {
            r += num[i];
            res.add(r % 10);
            r /= 10;
        }
        while (k != 0) {
            r += k % 10;
            res.add(r % 10);
            k /= 10;
            r /= 10;
        }
        if (r != 0) res.add(r % 10);
        Collections.reverse(res);
        return res;
    }
//    Best Solution
//    int carry = 0;
//    int index = num.length - 1;
//
//         while (index >= 0 && (k != 0 || carry != 0)) {
//        int x = k % 10;
//        int y = num[index];
//        int sum = (x + y + carry) % 10;
//        carry = (x + y + carry) / 10;
//
//        num[index] = sum;
//        k /=10;
//        index--;
//    }
//
//
//    List<Integer> result = new ArrayList<Integer>();
//
//    k += carry;
//
//        while (k != 0) {
//        result.add(0, k %10);
//        k /= 10;
//    }
//
//
//
//        for(int x: num)
//            result.add(x);
//
//        return result;
}
