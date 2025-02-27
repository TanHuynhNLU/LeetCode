package leetcode;

public class Atoi8 {
    public static int myAtoi(String s) {
        boolean isNegative = false;
        boolean isParse = false;
        long number = 0;

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c) && c != '+' && c != '-' && c != ' ') break;
            if (isParse && !Character.isDigit(c)) break;
            if (c == ' ') continue;
            if (c == '+') {
                isParse = true;
                continue;
            }
            if (c == '-') {
                isNegative = true;
                isParse = true;
                continue;
            }
            if (Character.isDigit(c)) {
                int numericValue = Character.getNumericValue(c);


                isParse = true;
                if (isNegative) {
                    number = number * 10 - numericValue;
                } else number = number * 10 + numericValue;
                if (number >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (number <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
        }
        return (int) number;
    }

    public static int myAtoi1(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        int ind = 0, total = 0, sign = 1;
        while (s.charAt(ind) == ' ' && ind < s.length()) ind++;
        if (s.charAt(ind) == '+' || s.charAt(ind) == '-') {
            sign = s.charAt(ind) == '+' ? 1 : -1;
            ind++;
        }
        while (ind < s.length()) {
            int digit = s.charAt(ind) - '0';
            if (digit < 0 || digit > 9) break;

            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = total * 10 + digit;
            ind++;
        }
        return total * sign;
    }

    public static void main(String[] args) {
        String s = "21474836460";
        System.out.println(myAtoi(s));
    }
}
