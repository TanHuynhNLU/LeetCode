package easy;

public class MinimumDistanceToTheTargetElement1848 {
    public int getMinDistance(int[] nums, int target, int start) {
        int i = start, j = start;
        while (i >= 0 && j < nums.length) {
            if (nums[i] == target || nums[j] == target) return j - start;
            i++;
            j++;
        }
        while (i >= 0) {
            if (nums[i] == target) return start - i;
            i--;
        }
        while (j < nums.length) {
            if (nums[j] == target) return j - start;
            j++;
        }
        return 0;
    }
}
