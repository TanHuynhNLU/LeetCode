package easy;

public class FindTheLongestBalancedSubstringOfABinaryString2609 {
    public static int findTheLongestBalancedSubstring(String s) {
        int max = 0;
        int count1 = 0, count0 = 0;
        char prev = ' ';
        for (char c : s.toCharArray()) {
            if (prev == '1' && c == '0') {
                count0 = 0;
            }
            if (prev == '0' && c == '1') {
                count1 = 0;
            }
            if (c == '0') {
                count0++;
            } else {
                count1++;
                max = Math.max(max, Math.min(count1, count0) * 2);
            }
            prev = c;
        }
        return max;
    }
//    public int findTheLongestBalancedSubstring(String s) {
//        int currLongest = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char curr = s.charAt(i);
//            int currZeroesCount = 0;
//            int currOnesCount = 0;
//
//            while (curr == '0') {
//                currZeroesCount++;
//                i++;
//                if (i < s.length()) {
//                    curr = s.charAt(i);
//                } else {
//                    break;
//                }
//            }
//            if (i >= s.length()) {
//                break;
//            }
//            while (curr == '1') {
//                currOnesCount++;
//                i++;
//                if (i < s.length()) {
//                    curr = s.charAt(i);
//                } else {
//                    break;
//                }
//            }
//            i--;
//            if (currOnesCount > 0 && currZeroesCount > 0) {
//                currLongest = Math.max(Math.min(currOnesCount, currZeroesCount) * 2, currLongest);
//            }
//        }
//        return currLongest;
//    }

    public static void main(String[] args) {
        findTheLongestBalancedSubstring("01000111");
    }
}
