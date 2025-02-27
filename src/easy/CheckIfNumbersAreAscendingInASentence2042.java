package easy;

public class CheckIfNumbersAreAscendingInASentence2042 {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int prevNum = 0;
        for (String word : words) {
            if (isNumeric(word)) {
                if (Integer.parseInt(word) <= prevNum) return false;
                prevNum = Integer.parseInt(word);
            }
        }
        return true;
    }

    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
//    Best solution
//    public boolean areNumbersAscending(String s) {
//    int lastNum = -1;
//    int tempNum = -1;
//    int i = -1;
//
//    while(++i < s.length()) {
//        char ch = s.charAt(i);
//        if (ch == ' ' && tempNum != -1) {
//            if (tempNum <= lastNum) {
//                return false;
//            }
//
//            lastNum = tempNum;
//            tempNum = -1;
//        } else if (ch - '0' >= 0 && ch - '0' <= 9) {
//            if (tempNum == -1) {
//                tempNum = 0;
//            }
//
//            tempNum = tempNum * 10 + (ch - '0');
//        }
//    }
//
//    if (tempNum != -1 && tempNum <= lastNum) {
//        return false;
//    }
//
//    return true;
//}
}
