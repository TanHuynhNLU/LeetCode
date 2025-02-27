package easy;

public class ValidPalindrome125 {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if (!Character.isAlphabetic(leftChar)&&!Character.isDigit(leftChar)) {
                left++;
                continue;
            }
            if (!Character.isAlphabetic(rightChar)&&!Character.isDigit(rightChar)) {
                right--;
                continue;
            }
            if (leftChar != rightChar) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
