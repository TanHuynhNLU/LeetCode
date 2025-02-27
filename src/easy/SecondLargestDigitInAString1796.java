package easy;

public class SecondLargestDigitInAString1796 {
    public int secondHighest(String s) {
        int firstMax = -1;
        int secondMax = -1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                int num = Character.getNumericValue(chars[i]);
                if (num > firstMax) {
                    secondMax = firstMax;
                    firstMax = num;
                } else if (num != firstMax && num > secondMax) {
                    secondMax = num;
                }
            }
        }
        return secondMax;
    }

    //    Best solution
//    public int secondHighest(String s) {
//        int cnt = 0;
//        for (char c = '9'; c >= '0'; c--) {
//            if (s.indexOf(c) != -1) {
//                cnt++;
//            }
//            if (cnt == 2) return c - '0';
//        }
//        return -1;
//    }
}
