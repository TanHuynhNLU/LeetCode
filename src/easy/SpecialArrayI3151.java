package easy;

public class SpecialArrayI3151 {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length == 1) return true;
        boolean isEven = nums[0] % 2 == 0;
        for (int i = 1; i < nums.length; i++) {
            boolean even = nums[i] % 2 == 0;
            if (isEven == even) return false;
            isEven = !isEven;
        }
        return true;
    }
}
