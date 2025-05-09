package medium;

public class ProductOfArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];
        suffix[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i];
        }
        res[0] = suffix[1];
        res[n - 1] = prefix[n - 2];
        for (int i = 1; i < n - 1; i++) {
            res[i] = prefix[i - 1] * suffix[i + 1];
        }
        return res;
    }

    //Best Solution
//    public int[] productExceptSelf(int[] nums) {
//        int[] output = new int[nums.length];
//        output[0] = 1;
//        for (int i = 1; i < nums.length; i++) {
//            output[i] = output[i - 1] * nums[i - 1];
//        }
//        int R = 1;
//        for (int i = nums.length - 1; i >= 0; i--) {
//            output[i] = R * output[i];
//            R *= nums[i];
//        }
//        return output;
//    }
}
