package easy;

public class PrimeInDiagonal2614 {
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i][i])) {
                max = Math.max(max, nums[i][i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i][nums.length - i - 1])) {
                max = Math.max(max, nums[i][nums.length - i - 1]);
            }
        }
        return max;
    }

    //    Best Solution
//    public int diagonalPrime(int[][] nums) {
//        int max = 0;
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            if (nums[i][i] > max && isPrime(nums[i][i])) {
//                max = nums[i][i];
//            }
//            if (nums[i][n - 1 - i] > max && isPrime(nums[i][n - 1 - i])) {
//                max = nums[i][n - 1 - i];
//            }
//        }
//        return max;
//    }

    public boolean isPrime(int val) {
        if (val == 1) return false;
        for (int i = 2; i <= Math.sqrt(val); i++) {
            if (val % i == 0) return false;
        }
        return true;
    }
}
