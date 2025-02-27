package easy;

public class FindTheK_orOfAnArray2917 {
    public int findKOr(int[] nums, int k) {
        int[] counts = new int[32];
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            int n = nums[i];
            while (n != 0) {
                int bit = n & 1;
                if (bit == 1)
                    counts[j]++;
                j++;
                n >>>= 1;
            }

        }
        int res = 0;
        for (int i = 31; i >= 0; i--) {
            if (counts[i] >= k)
                res += Math.pow(2, i);
        }
        return res;
    }
}
