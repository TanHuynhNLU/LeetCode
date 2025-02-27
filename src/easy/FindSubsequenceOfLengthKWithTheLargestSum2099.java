package easy;

import java.util.*;

public class FindSubsequenceOfLengthKWithTheLargestSum2099 {
    public int[] maxSubsequence(int[] nums, int k) {
       List<Pair> list = new ArrayList<>();
       List<Pair> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(new Pair(nums[i], i));
        }
        list.sort(new ValueComparator());
        for (int i = 0; i < k; i++) {
            list1.add(list.get(i));
        }
        list1.sort(new IndexComparator());
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list1.get(i).value;
        }
        return ans;
    }
    class Pair {
        int value;
        int index;
        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
    class IndexComparator implements Comparator<Pair> {
        public int compare(Pair o1, Pair o2) {
            return o1.index - o2.index;
        }
    }
    class ValueComparator implements Comparator<Pair> {
        public int compare(Pair o1, Pair o2) {
            return o2.value - o1.value;
        }
    }

    public static void main(String[] args) {
        FindSubsequenceOfLengthKWithTheLargestSum2099 f = new FindSubsequenceOfLengthKWithTheLargestSum2099();
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        f.maxSubsequence(nums,3);
    }
}
