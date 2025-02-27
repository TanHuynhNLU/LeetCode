package easy;

public class ApplyOperationsToAnArray2460 {
    public int[] applyOperations(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) continue;
            if (nums[i] == nums[i + 1]) {
                nums[i + 1] = 0;
                result[count++] = nums[i] * 2;
            } else result[count++] = nums[i];
        }
        if(nums[nums.length - 1] != 0) result[count] = nums[nums.length - 1];
        return result;
    }
}
