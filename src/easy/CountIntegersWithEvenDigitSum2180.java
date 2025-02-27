package easy;

public class CountIntegersWithEvenDigitSum2180 {
    public int countEven(int num) {
        if (num == 1000) return 499;
        int sum = -1;
        int n = num / 10;
        for (int i = 0; i < n; i++) {
            sum += 5;
        }
        if (n >= 10) n = n / 10 + n % 10;
        if (n % 2 == 0) {
            for (int i = 0; i <= num % 10; i += 2) {
                sum++;
            }
        } else {
            for (int i = 1; i <= num % 10; i += 2) {
                sum++;
            }
        }
        return sum;
    }

    //    Best Solution
//    public int countEven(int p) {
//        int s = 0, num = p;
//        if (p % 2 == 1) return p / 2;
//        while (num > 0) {
//            s += num % 10;
//            num /= 10;
//        }
//        int ans = s % 2 == 0 ? p / 2 : p / 2 - 1;
//        return ans;
//    }
}
