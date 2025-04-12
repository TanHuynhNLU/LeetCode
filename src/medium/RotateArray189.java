package medium;

public class RotateArray189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] res = new int[nums.length];
        int i = 0;
        for (int j = n - k; j < n; j++) {
            res[i++] = nums[j];
        }
        for (int j = 0; i < n; j++) {
            res[i++] = nums[j];
        }
        System.arraycopy(res, 0, nums, 0, n);
    }

//    public void rotate(int[] A, int k) {
//        int n = A.length;
//        k %= n;
//        // n-=1;
//        // 1 2 3 4 5 6 7
//        // 7 6 5 4 3 2 1
//        // 4 5 6 7 1 2 3
//
//        help(A, 0, n - 1);
//        help(A, 0, k - 1);
//        help(A, k, n - 1);
//
//    }
//
//    private void help(int[] A, int l, int r) {
//        while (l <= r) {
//            int t = A[l];
//            A[l++] = A[r];
//            A[r--] = t;
//        }
//    }
}
