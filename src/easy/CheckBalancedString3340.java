package easy;

public class CheckBalancedString3340 {
    public static boolean isBalanced(String num) {
        char[] chars = num.toCharArray();
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < num.length(); i++) {
            int n = Character.getNumericValue(chars[i]);
            if (i % 2 == 0) {
                sumEven += n;
            }
            else sumOdd += n;
        }
        return sumEven == sumOdd;
    }

    public static void main(String[] args) {
        isBalanced("24123");
    }
}
