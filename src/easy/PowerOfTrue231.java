package easy;

public class PowerOfTrue231 {
    public boolean isPowerOfTwo(int n) {
        if (n > 0 && ((n & (n - 1)) == 0)) return true;
        return false;
    }
}
