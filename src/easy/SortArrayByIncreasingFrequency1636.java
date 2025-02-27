package easy;

import java.util.*;

public class SortArrayByIncreasingFrequency1636 {
    public int[] frequencySort(int[] nums) {
         int[] count = new int[201];
         List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]+100]++;
            list.add(nums[i]);
        }
        Comparator<Integer> myComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (count[o2 + 100] != count[o1 + 100]) {
                    return count[o1 + 100] - count[o2 + 100];
                } else {
                    return o2 - o1;
                }
            }
        };
        Collections.sort(list,myComparator);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}

