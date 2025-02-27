package easy;

public class CountElementsWithMaximumFrequency3005 {
    public int maxFrequencyElements(int[] nums) {
        int[] counts = new int[101];
        for (int num : nums) {
            counts[num]++;
        }
        int max = 0;
        int res = 0;
        for (int i = 1; i < 101; i++) {
            if (counts[i] > max) {
                max = counts[i];
                res = counts[i];
            } else if (counts[i] == max) res += counts[i];
        }
        return res;
    }

    //    Best Solution
//    public int maxFrequencyElements(int[] nums) {
//        int[] f = new int[101];
//        for (int i = 0; i < nums.length; i++) {
//            f[nums[i]]++;
//        }
//        int m = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (f[nums[i]] > m) m = f[nums[i]];
//        }
//        int s = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (f[nums[i]] == m) s += 1;
//        }
//        return s;
//    }
}
