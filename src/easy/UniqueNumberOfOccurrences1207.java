package easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurrences1207 {
    public boolean uniqueOccurrences(int[] arr) {
        int[] nums = new int[2001];

        for (int i = 0; i < arr.length; i++) {
            nums[arr[i]+1000]++;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 2001; i++) {
            if(nums[i]==0) continue;
            if(set.contains(nums[i])) return false;
            else set.add(nums[i]);
        }
        return true;
    }
//    Best Solution
//    int min = Integer.MAX_VALUE;
//    int max = Integer.MIN_VALUE;
//    int n = arr.length;
//        for (int j : arr) {
//        if (j < min) min = j;
//        if (j > max) max = j;
//    }
//    int[] freq = new int[max - min + 1];
//    int[] count = new int[n + 1];
//        for (int j : arr) {
//        freq[j - min]++;
//    }
//        for (int j : freq) {
//        if (j != 0) count[j]++;
//        if (count[j] >= 2) return false;
//    }
//        return true;
}
