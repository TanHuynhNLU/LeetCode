package medium;

import java.util.ArrayList;
import java.util.List;

public class GrayCode89 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            res.add(i ^ (i >> 1));
        }
        return res;
    }

    //    Best Solution
//    public List<Integer> grayCode(int n) {
//        return new AbstractList<Integer>() {
//            public Integer get(int i) {
//                return i ^ i >> 1;
//            }
//
//            public int size() {
//                return 1 << n;
//            }
//        };
//    }
}
