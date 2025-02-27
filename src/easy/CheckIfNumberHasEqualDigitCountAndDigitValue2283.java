package easy;

public class CheckIfNumberHasEqualDigitCountAndDigitValue2283 {
    public boolean digitCount(String num) {
        int[] counts = new int[10];
        for (int i = 0; i < num.length(); i++) {
            counts[num.charAt(i) - '0']++;
        }
        for (int i = 0; i < num.length(); i++) {
            if (counts[i] != num.charAt(i) - '0') return false;
        }
        return true;
    }
}
