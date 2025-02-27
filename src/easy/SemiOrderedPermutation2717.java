package easy;

public class SemiOrderedPermutation2717 {
    public int semiOrderedPermutation(int[] nums) {
        int min = 51;
        int max = 0;
        int minIndex = 0;
        int maxIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        return minIndex > maxIndex ? minIndex + nums.length - maxIndex - 2 : minIndex + nums.length - maxIndex - 1;
    }
}
