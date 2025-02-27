package easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllKDistantIndicesInAnArray2200 {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int[] counts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                for (int j = i; j >= i - k && j >= 0; j--) {
                    counts[j]++;
                }
                for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                    counts[j]++;
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                result.add(i);
            }
        }
        return result;
    }

    //    Best Solution
//    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
//        ArrayList<Integer> indexes = new ArrayList<Integer>();
//        ArrayList<Integer> positions = new ArrayList<Integer>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == key) {
//                positions.add(i);
//            }
//        }
//
//        if (positions.size() > 0) {
//            int pos = positions.get(0);
//            int posIn = 0;
//            for (int i = 0; i < nums.length; i++) {
//                if (k + pos < i) {
//                    posIn++;
//                    if (posIn < positions.size()) {
//                        pos = positions.get(posIn);
//                    } else {
//                        break;
//                    }
//                }
//
//                if (Math.abs(i - pos) <= k) indexes.add(i);
//
//            }
//        }
//
//
//        return indexes;
//    }
}
