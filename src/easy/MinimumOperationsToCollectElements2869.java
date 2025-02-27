package easy;

import java.util.List;

public class MinimumOperationsToCollectElements2869 {
    public int minOperations(List<Integer> nums, int k) {
        int[] counts = new int[k + 1];
        int c = 0;
        for (int i = nums.size() - 1; i >= 0; i--) {
            int current = nums.get(i);
            if (current <= k && counts[current] == 0) {
                c++;
                counts[current]++;
            }
            if (c == k) return nums.size() - i;
        }
        return -1;
    }
}
