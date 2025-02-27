package easy;

public class FindTheXOROfNumbersWhichAppearTwice3158 {
    public int duplicateNumbersXOR(int[] nums) {
        int[] counts = new int[51];
        int res = 0;
        for (int num : nums) {
            counts[num]++;
        }
        for (int i = 1; i < 51; i++) {
            if (counts[i] == 2) res ^= i;
        }
        return res;
    }

    //    Best Solution
//    public int duplicateNumbersXOR(int[] nums) {
//        long k = 0;
//        int result = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int j = nums[i];
//            if ((k & (1L << j)) != 0) {
//                result ^= j;
//            }
//            k |= (1L << j);
//        }
//        return result;
//    }
}
