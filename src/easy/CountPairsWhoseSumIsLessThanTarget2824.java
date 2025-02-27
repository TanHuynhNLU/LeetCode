package easy;

import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget2824 {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int[] arr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            arr[i] = nums.get(i);
        }
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (arr[i] + arr[j] < target) count++;
            }
        }
        return count;
    }
}
