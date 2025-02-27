package easy;

public class NumberOfArithmeticTriplets2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) count++;
                }
            }
        }
        return count;
    }

    //    Best Solution
//    public int arithmeticTriplets(int[] nums, int diff) {
//        int tripletCount = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (isTripletStart(nums, i, diff) == true) {
//                tripletCount++;
//            }
//        }
//        return tripletCount;
//    }
//
//    private boolean isTripletStart(int[] nums, int ind, int diff) {
//        int tripletVal = nums[ind];
//        int tripletCount = 1;
//        for (int i = ind + 1; i < nums.length; i++) {
//            if (nums[i] == tripletVal + diff) {
//                tripletVal = nums[i];
//                tripletCount++;
//            }
//            if (tripletCount == 3) {
//                return true;
//            }
//        }
//        return false;
//    }
}
