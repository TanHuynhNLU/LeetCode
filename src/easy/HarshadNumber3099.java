package easy;

public class HarshadNumber3099 {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = sumOfDigits(x);
        if (x % sum == 0) return sum;
        else return -1;
    }

    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
