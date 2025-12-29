package medium;

public class OptimalDivision553 {
    public String optimalDivision(int[] nums) {
        if (nums.length == 1) return String.valueOf(nums[0]);
        if (nums.length == 2) return nums[0] + "/" + nums[1];

        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]).append("/(");
        for (int i = 1; i < nums.length; i++) {
            sb.append(nums[i]);
            if (i != nums.length - 1) sb.append("/");
        }
        sb.append(")");
        return sb.toString();
    }

    // Best Solution
//    public String optimalDivision(int[] nums) {
//        if (nums.length == 1) {
//            return Integer.toString(nums[0]);
//        }
//        StringBuilder sc = new StringBuilder();
//        if (nums.length == 2) {
//
//            sc.append(Integer.toString(nums[0]));
//            sc.append("/");
//            sc.append(Integer.toString(nums[1]));
//            return sc.toString();
//        }
//        int count = 1;
//        for (int i = 0; i < nums.length - 1; i++) {
//            sc.append(Integer.toString(nums[i]));
//            sc.append("/");
//            if (count == 1) {
//                sc.append("(");
//            }
//            count = 0;
//
//        }
//        sc.append(Integer.toString(nums[nums.length - 1]));
//        sc.append(")");
//
//        return sc.toString();
//    }
}
