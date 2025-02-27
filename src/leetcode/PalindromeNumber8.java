package leetcode;

public class PalindromeNumber8 {
    public static boolean palindromeNumber(int x) {
        try {
            if (x < 0) return false;
            StringBuilder stringBuilder = new StringBuilder(Integer.toString(x));

            stringBuilder.reverse();
            if (Integer.parseInt(stringBuilder.toString()) == x) return true;
            return false;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(palindromeNumber(99876543));
    }
}
