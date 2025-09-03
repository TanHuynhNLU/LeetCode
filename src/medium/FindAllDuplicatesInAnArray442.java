package medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        boolean[] counter = new boolean[100001];
        for (int num : nums) {
            if (counter[num]) {
                res.add(num);
            } else counter[num] = true;
        }
        return res;
    }

    //Best Solution
//    public List<Integer> findDuplicates(int[] nums) {
//        return new Skibidi(nums);
//    }
//
//    public class Skibidi extends ArrayList<Integer> {
//        private int[] n;
//        private boolean processed = false;
//
//        public Skibidi(int[] n) {
//            this.n = n;
//        }
//
//        @Override
//        public int size() {
//            if (!processed) {
//                process();
//                processed = true;
//            }
//            return super.size();
//        }
//
//        private void process() {
//            int size = n.length;
//            int[] temp = new int[size + 1];
//            for (int i : n) {
//                temp[i]++;
//            }
//
//            for (int i = 1; i <= size; i++) {
//                if (temp[i] == 2) {
//                    super.add(i);
//                }
//            }
//        }
//    }
}
