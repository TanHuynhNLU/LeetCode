package easy;

import java.util.List;

public class AdjacentIncreasingSubarraysDetectionI3349 {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int[] arr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            arr[i] = nums.get(i);
        }
        for (int i = 0; i <= nums.size() - k * 2; i++) {
            if (isIncreasing(arr, i, k) && isIncreasing(arr, i + k, k)) return true;
        }
        return false;
    }

    public boolean isIncreasing(int[] arr, int start, int k) {
        for (int i = start = 1; i < start + k; i++) {
            if (arr[i] <= arr[i - 1]) return false;
        }
        return true;
    }

    //    Best solution
//    private int minLengthOfIncreasingSubarray;
//
//    public boolean hasIncreasingSubarrays(List<Integer> input, int minLengthOfIncreasingSubarray) {
//        this.minLengthOfIncreasingSubarray = minLengthOfIncreasingSubarray;
//        int currentIncreasingCount = 1;
//        int previousIncreasingCount = 0;
//
//        for (int i = 1; i < input.size(); ++i) {
//            if (foundTwoAdjacentIncreasingSubarraysWithMinLength(currentIncreasingCount, previousIncreasingCount)) {
//                return true;
//            }
//
//            if (input.get(i - 1) >= input.get(i)) {
//                previousIncreasingCount = currentIncreasingCount;
//                currentIncreasingCount = 1;
//                continue;
//            }
//            ++currentIncreasingCount;
//        }
//        return foundTwoAdjacentIncreasingSubarraysWithMinLength(currentIncreasingCount, previousIncreasingCount);
//    }
//
//    private boolean foundTwoAdjacentIncreasingSubarraysWithMinLength(int currentIncreasingCount, int previousIncreasingCount) {
//        return currentIncreasingCount >= 2 * minLengthOfIncreasingSubarray
//                || (currentIncreasingCount >= minLengthOfIncreasingSubarray
//                && previousIncreasingCount >= minLengthOfIncreasingSubarray);
//    }
}
