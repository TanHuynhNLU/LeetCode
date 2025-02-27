package medium;

public class IntegerToRoman12 {
//    public String intToRoman(int num) {
//        StringBuilder sb = new StringBuilder();
//        while (num > 0) {
//            Pair p = convert(num);
//            sb.append(p.converted);
//            num = p.num;
//        }
//        return sb.toString();
//    }
//
//    public Pair convert(int num) {
//        int[] res = new int[2];
//        StringBuilder sb = new StringBuilder();
//        if (num >= 1000) {
//            for (int i = 0; i < num / 1000; i++) {
//                sb.append('M');
//            }
//            return new Pair(num % 1000, sb.toString());
//        }
//        if (num >= 500) {
//            if (num >= 900) return new Pair(num - 900, "CM");
//            else return new Pair(num - 500, "D");
//        }
//        if (num >= 100) {
//            if (num >= 400) return new Pair(num - 400, "CD");
//            for (int i = 0; i < num / 100; i++) {
//                sb.append('C');
//            }
//            return new Pair(num % 100, sb.toString());
//        }
//        if (num >= 50) {
//            if (num >= 90) return new Pair(num - 90, "XC");
//            else return new Pair(num - 50, "L");
//        }
//        if (num >= 10) {
//            if (num >= 40) return new Pair(num - 40, "XL");
//            for (int i = 0; i < num / 10; i++) {
//                sb.append('X');
//            }
//            return new Pair(num % 10, sb.toString());
//        }
//        if (num >= 5) {
//            if (num >= 9) return new Pair(num - 9, "IX");
//            else return new Pair(num - 5, "V");
//        }
//        if (num >= 1) {
//            if (num >= 4) return new Pair(num - 4, "IV");
//            for (int i = 0; i < num; i++) {
//                sb.append('I');
//            }
//            return new Pair(0, sb.toString());
//        }
//        return null;
//    }

//    Best solution
//    public String intToRoman(int num) {
//        /**
//         * when converting a value from bigger base to lower base we could directly
//         * modulo with the target base, e.g. convert 97 base 10 to base 6,
//         * similar idea could be used for this problem, where instead of the numeric
//         * base the different between conversion is the range, the integer is
//         * 0...inf meanwhile roma is 1...3999 (because more than 3 symbols aren't
//         * alowed in roman numeric notation). So we could directly subtract the
//         * romanized value with priority biggest to lowest, and account for
//         * subtractive form
//         */
//
//        StringBuilder result = new StringBuilder();
//        while (num > 0) {
//            if (num >= 1000) {
//                result.append("M");
//                num -= 1000;
//            } else if (num >= 900) {
//                result.append("CM");
//                num -= 900;
//            } else if (num >= 500) {
//                result.append("D");
//                num -= 500;
//            } else if (num >= 400) {
//                result.append("CD");
//                num -= 400;
//            } else if (num >= 100) {
//                result.append("C");
//                num -= 100;
//            } else if (num >= 90) {
//                result.append("XC");
//                num -= 90;
//            } else if (num >= 50) {
//                result.append("L");
//                num -= 50;
//            } else if (num >= 40) {
//                result.append("XL");
//                num -= 40;
//            } else if (num >= 10) {
//                result.append("X");
//                num -= 10;
//            } else if (num >= 9) {
//                result.append("IX");
//                num -= 9;
//            } else if (num >= 5) {
//                result.append("V");
//                num -= 5;
//            } else if (num >= 4) {
//                result.append("IV");
//                num -= 4;
//            } else if (num >= 1) {
//                result.append("I");
//                num -= 1;
//            }
//        }
//        return result.toString();
//    }
}

//class Pair {
//    int num;
//    String converted;
//
//    public Pair(int num, String converted) {
//        this.num = num;
//        this.converted = converted;
//    }
//}
