package medium;

public class JumpGame55 {
    public boolean canJump(int[] nums) {
        int last = nums.length - 1;
        if(nums.length == 1) return true;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= last) {
                last = i;
                if (i == 0) return true;
            } else {
                if (i == 0) return false;
            }
        }
        return false;
    }
//    Best solution
//    public boolean canJump(int[] nums) {
//        int min = nums.length-1;
//        for (int i = nums.length-2; i >= 0; i--) {
//            if (i + nums[i] >= min) {
//                min = i;
//            }
//        }
//        return min == 0;
//    }
}
