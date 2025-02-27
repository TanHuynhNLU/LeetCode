package easy;

public class DivisorGame1025 {
    public boolean divisorGame(int n) {
        if (n == 1) return false;
        if (n % 2 == 0) return true;
        return false;
    }
}
