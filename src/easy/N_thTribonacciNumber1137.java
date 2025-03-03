package easy;

public class N_thTribonacciNumber1137 {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 1;
        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i - 3] + nums[i - 2] + nums[i - 1];
        }
        return nums[n];
    }
}
