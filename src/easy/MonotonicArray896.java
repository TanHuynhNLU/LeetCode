package easy;

public class MonotonicArray896 {
    public boolean isMonotonic(int[] nums) {
        if (nums.length <= 2) return true;
        boolean isIncrease = nums[0] <= nums[nums.length-1];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] && !isIncrease) return false;
            if (nums[i] < nums[i - 1] && isIncrease) return false;
        }
        return true;
//        Best Solution
//        public boolean isMonotonic(int[] nums) {
//            int prev = Integer.MIN_VALUE;
//            boolean result = true;
//            for(int n: nums) {
//                if(prev > n) {
//                    result = false;
//                    break;
//                }
//                prev = n;
//            }
//            if(result) {
//                return true;
//            }
//            prev = Integer.MAX_VALUE;
//            for(int n: nums) {
//                if(prev < n) {
//                    return false;
//                }
//                prev = n;
//            }
//            return true;
//        }
    }
}
