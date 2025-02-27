package easy;

public class FindTheSumOfEncryptedIntegers3079 {
    public int sumOfEncryptedInt(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += encrypt(nums[i]);
        }
        return res;
    }

    public int encrypt(int num) {
        String s = String.valueOf(num);
        int max = 0;
        int n = num;
        while (n > 0) {
            max = Math.max(max, n % 10);
            n = n / 10;
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = res * 10 + max;
        }
        return res;
    }

    //    Best Solution
//    public int sumOfEncryptedInt(int[] nums) {
//        int ans = 0;
//        for (int n : nums) {
//            if (n < 10) {
//                ans += n;
//            } else if (n < 100) {
//                ans += 11 * Math.max(n % 10, n / 10);
//            } else if (n < 1000) {
//                ans += 111 * Math.max(n / 100, Math.max(n % 10, (n / 10) % 10));
//            } else {
//                ans += 1111;
//            }
//        }
//        return ans;
//    }
}
