package easy;

import java.util.ArrayList;
import java.util.List;

public class MinimumRightShiftToSortTheArray2855 {
    public static int minimumRightShifts(List<Integer> nums) {
        int count = 0;
        int pivotIndex = 0;
        int prev = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            int curr = nums.get(i);
            if (curr < prev) {
                pivotIndex = i;
                count++;
            }
            prev = curr;
        }
        if (count == 0) return 0;
        if (count > 1) return -1;
        int i = 1;
        prev = nums.get(pivotIndex);
        while (i < nums.size()) {
            int curr = nums.get((pivotIndex + i) % nums.size());
            if (curr < prev) return -1;
            i++;
            prev = curr;
        }
        return nums.size() - pivotIndex;
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(3,4,5,1,2);
        minimumRightShifts(nums);
    }
}
