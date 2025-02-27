package easy;

public class CountEqualAndDivisiblePairsInAnArray2176 {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if ((i * j) % k == 0) count++;
                }
            }
        }
        return count;
    }

    //    Best Solution
//    public static int countPairs(int[] nums, int k) {
//        int maxValue = 0, n = nums.length;
//        for (int num : nums) {
//            maxValue = Math.max(maxValue, num);
//        }
//        int[] head = new int[maxValue + 1], next = new int[n];
//        int ans = 0;
//        for (int i = n - 1; i >= 0; i--) {
//            int j = head[nums[i]];
//            while (j > i) {
//                if (i * j % k == 0) {
//                    ans++;
//                }
//                j = next[j];
//            }
//            next[i] = head[nums[i]];
//            head[nums[i]] = i;
//        }
//        return ans;
//    }
}
