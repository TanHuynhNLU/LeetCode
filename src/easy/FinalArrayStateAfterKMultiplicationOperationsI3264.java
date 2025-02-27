package easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class FinalArrayStateAfterKMultiplicationOperationsI3264 {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int maxIndex = findMin(nums);
            nums[maxIndex] *= multiplier;
        }
        return nums;
    }

    public int findMin(int[] nums) {
        int minIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
