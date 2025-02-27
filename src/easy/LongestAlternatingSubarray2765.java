package easy;

public class LongestAlternatingSubarray2765 {
    public static int alternatingSubarray(int[] nums) {
        int max = -1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev + 1) {
                int count = 2;
                int cur = nums[i];
                for (int j = i + 1; j < nums.length; j += 2) {
                    if (j < nums.length && nums[j] == prev) count++;
                    else break;
                    if (j + 1 < nums.length && nums[j + 1] == cur) count++;
                    else break;
                }
                max = Math.max(max, count);
            }
            prev = nums[i];
        }
        return max;
    }

    //    Best Solution
//    public int alternatingSubarray(int[] nums) {
//        int pointer = 1;
//        int max = 0;
//        while (pointer < nums.length) {
//            int count = 1;
//            int positive = 1;
//            while (pointer < nums.length && positive != nums[pointer] - nums[pointer - 1]) pointer++;
//            while (pointer < nums.length && positive == nums[pointer] - nums[pointer - 1]) {
//                pointer++;
//                positive *= -1;
//                count++;
//            }
//            max = Math.max(max, count);
//        }
//        return max > 1 ? max : -1;
//    }

    public static void main(String[] args) {
        alternatingSubarray(new int[]{64, 65, 64, 65, 64, 65, 66, 65, 66, 65});
    }
}
