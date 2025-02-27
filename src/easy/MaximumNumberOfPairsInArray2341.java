package easy;

public class MaximumNumberOfPairsInArray2341 {
    public int[] numberOfPairs(int[] nums) {
        int[] ans = new int[2];
        int[] counts = new int[101];
        for (int num : nums) {
            counts[num]++;
        }
        for (int i = 0; i < 101; i++) {
            ans[0] += counts[i] / 2;
            ans[1] += counts[i] % 2;
        }
        return ans;
    }

    //    Best Solution
//    public int[] numberOfPairs(int[] nums) {
//        Map<Integer, Integer> hm = new HashMap<>();
//        boolean[] seen = new boolean[101];
//        int pairs = 0;
//        int rem = 0;
//        for (int num : nums) {
//            if (seen[num]) {
//                seen[num] = false;
//                pairs++;
//                if (rem != 0)
//                    rem--;
//            } else {
//                seen[num] = true;
//                rem++;
//            }
//        }
//        return new int[]{pairs, rem};
//    }
}
