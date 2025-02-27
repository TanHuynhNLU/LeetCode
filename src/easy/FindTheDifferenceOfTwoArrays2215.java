package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }
        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }
        res.add(list1);
        res.add(list2);
        return res;
    }

    //    Best solution
//    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//        return new AbstractList<List<Integer>>() {
//            List<Integer> first = null;
//            List<Integer> second = null;
//
//            @Override
//            public List<Integer> get(int i) {
//                if (first == null) {
//                    process();
//                }
//                return (i == 0) ? first : second;
//            }
//
//            @Override
//            public int size() {
//                return 2;
//            }
//
//            private void process() {
//                first = new ArrayList<>();
//                second = new ArrayList<>();
//                byte[] m1 = new byte[2001];
//                byte[] m2 = new byte[2001];
//                for (int i : nums2) {
//                    m1[i + 1000] = 0b1;
//                }
//                for (int i : nums1) {
//                    int x = i + 1000;
//                    if (m1[x] != 0b1) {
//                        m1[x] = 0b1;
//                        first.add(i);
//                    }
//                    m2[x] = 0b1;
//                }
//                for (int i : nums2) {
//                    int x = i + 1000;
//                    if (m2[x] != 0b1) {
//                        m2[x] = 0b1;
//                        second.add(i);
//                    }
//                }
//
//            }
//        };
//    }
}
