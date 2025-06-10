package medium;

public class IncreasingTripletSubsequence334 {
    public boolean increasingTriplet(int[] nums) {
        long firstNum = Long.MAX_VALUE;
        long secondNum = Long.MAX_VALUE;
        long thirdNum = Long.MAX_VALUE;

        for (int num : nums) {
            if (num < firstNum) {
                firstNum = num;
                continue;
            }
            if (num < secondNum && num > firstNum) {
                secondNum = num;
                continue;
            }
            if (num < thirdNum && num > secondNum) {
                return true;
            }
        }
        return false;
    }

    //Common Solution
//    public boolean increasingTriplet(int[] nums) {
//        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] <= first) first = nums[i];
//            else if (nums[i] <= second) second = nums[i];
//            else return true;
//        }
//        return false;
//    }

    // Best Solution
//    static {
//        for (int i = 0; i < 500; i++) {
//            increasingTriplet(new int[0]);
//        }
//    }
//
//    public static boolean increasingTriplet(int[] nums) {
//        int first = Integer.MAX_VALUE;
//        int second = Integer.MAX_VALUE;
//
//        for (int cur : nums) {
//            if (cur <= first) {
//                first = cur;
//            } else if (cur <= second) {
//                second = cur;
//            } else {
//                return true;
//            }
//        }
//
//        return false;
//    }
}
