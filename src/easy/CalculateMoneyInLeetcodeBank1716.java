package easy;

public class CalculateMoneyInLeetcodeBank1716 {
    public int totalMoney(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        int sum = 1;
        for (int i = 1; i < n; i++) {
            if (i % 7 == 0) {
                arr[i] += arr[i - 7] + 1;
            } else {
                arr[i] = arr[i - 1] + 1;
            }
            sum += arr[i];
        }
        return sum;
    }

    //    Best solution
//    int res = 0;
//    int[] arr = new int[]{1, 3, 6, 10, 15, 21, 28};
//    int k = 0;
//        while(n>0)
//
//    {
//        if (n < 8) {
//            res += arr[n - 1];
//            res += k * n;
//            n = 0;
//        } else {
//            n -= 7;
//            res += arr[6];
//            res += k * 7;
//            k += 1;
//        }
//    }
//        return res;
}
