package easy;

public class PrimeArrangements1175 {
    public int numPrimeArrangements(int n) {
        int countPrime = 0;
        long M = 1000000007;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) countPrime++;
        }
        int count = n - countPrime;
        long f = 1;
        for (int i = 1; i <= countPrime; i++) {
            f = (f * i) % M;
        }
        for (int i = 1; i <= count; i++) {
            f = (f * i) % M;
        }
        return (int) f;
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
