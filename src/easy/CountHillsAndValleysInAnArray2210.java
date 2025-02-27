package easy;

public class CountHillsAndValleysInAnArray2210 {
    public int countHillValley(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int start = i - 1;
            int end = i + 1;
            while (nums[i] == nums[end] && end < nums.length - 1) {
                end++;
                i++;
            }
            if ((nums[start] < nums[i] && nums[end] < nums[i]) || (nums[start] > nums[i] && nums[end] > nums[i])) {
                count++;
            }
        }
        return count;
    }
}
