package medium;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal166 {
    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        boolean minus = (numerator < 0) ^ (denominator < 0);
        long num = Math.abs((long) numerator);
        long denom = Math.abs((long) denominator);
        StringBuilder sb = new StringBuilder();
        long res = num / denom;
        long remain = num % denom;
        if (minus) sb.append("-");
        sb.append(res);
        if (remain == 0) return sb.toString();
        sb.append(".");
        Map<Long, Long> map = new HashMap<>();
        while (remain != 0) {
            if (map.containsKey(remain)) {
                long tmp = remain;
                StringBuilder repeatString = new StringBuilder();
                repeatString.append(map.get(remain));
                remain = (remain * 10) % denom;
                while (remain != tmp) {
                    repeatString.append(map.get(remain));
                    remain = (remain * 10) % denom;
                }
                int index = sb.lastIndexOf(repeatString.toString());
                sb.delete(index, sb.length());
                sb.append("(");
                sb.append(repeatString);
                sb.append(")");
                break;
            } else {
                long calc = (remain * 10) / denom;
                map.put(remain, calc);
                remain = (remain * 10) % denom;
                sb.append(calc);
            }
        }
        return sb.toString();
    }

    //Popular Solution
//    public String fractionToDecimal(int numerator, int denominator) {
//        StringBuilder ans = new StringBuilder();
//        if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0))
//            ans.append("-");
//
//        long num = (long) Math.abs((long) numerator);
//        long den = (long) Math.abs((long) denominator);
//
//        long quotient = num / den;
//        long remainder = num % den;
//
//        ans.append(String.valueOf(quotient));
//
//        if (remainder == 0)
//            return ans.toString();
//
//        ans.append(".");
//
//        Map<Long, Integer> map = new HashMap<>();
//
//        while (remainder != 0) {
//            if (map.containsKey(remainder)) {
//                int pos = map.get(remainder);
//                ans.insert(pos, "(");
//                ans.append(")");
//                return ans.toString();
//            } else {
//                map.put(remainder, ans.length());
//                remainder *= 10;
//                quotient = remainder / den;
//                remainder %= den;
//                ans.append(String.valueOf(quotient));
//            }
//        }
//
//        return ans.toString();
//    }
}
