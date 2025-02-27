package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == min) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i - 1]);
                pair.add(arr[i]);
                res.add(pair);
            }
        }
        return res;
    }
//    Best Solution
//public List<List<Integer>> minimumAbsDifference(int[] arr) {
//    return new MyList(arr);
//}
//
//    class MyList extends ArrayList<List<Integer>> {
//        int[] arr;
//
//        public MyList(int[] arr) {
//            this.arr = arr;
//        }
//
//        public int size() {
//            if (arr != null){
//
//                System.out.println("size " +arr.length);
//                method();
//            }
//
//            return super.size();
//        }
//
//        private void method() {
//            int[] arr = this.arr;
//            int len;
//
//            if ((len = arr.length) == 2) {
//                this.add(List.of(arr[0], arr[1]));
//                this.arr = null;
//                return;
//            }
//
//            Arrays.sort(arr);
//
//            int min = Integer.MAX_VALUE;
//            for (int i = 1; i < len; i++) {
//                min = Math.min(min, arr[i] - arr[i - 1]);
//            }
//
//            for (int i = 1; i < len; i++) {
//                if (arr[i] - arr[i - 1]==min) {
//                    super.add(List.of(arr[i-1] ,arr[i]));
//                }
//            }
//            this.arr = null;
//        }
//    }
}
