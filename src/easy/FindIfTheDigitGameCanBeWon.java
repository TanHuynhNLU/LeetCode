package easy;

public class FindIfTheDigitGameCanBeWon {
    public boolean canAliceWin(int[] nums) {
        int sumSingle = 0;
        int sumDouble = 0;
        for (int n : nums) {
            if (n >= 10) sumDouble += n;
            else sumSingle += n;
        }
        return sumSingle != sumDouble;
    }
}
