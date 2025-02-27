package easy;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks2379 {
    public int minimumRecolors(String blocks, int k) {
        StringBuilder sb = new StringBuilder();
        int min = 101;
        int countW = 0;
        for (int i = 0; i < k; i++) {
            char c = blocks.charAt(i);
            if (c == 'W') countW++;
            sb.append(c);
        }
        if (countW == 0) return 0;
        min = countW;
        for (int i = k; i < blocks.length(); i++) {
            char c = blocks.charAt(i);
            if (c == 'W') countW++;
            if (sb.charAt(0) == 'W') {
                countW--;
            }
            sb.deleteCharAt(0);
            sb.append(c);
            min = Math.min(min, countW);
            if (min == 0) return 0;
        }
        return min;
    }

    //    Best Solution
//    public int minimumRecolors(String blocks, int k) {
//        int min = Integer.MAX_VALUE;
//        int blackCounter = 0;
//        char[] xters = blocks.toCharArray();
//        int right = 0;
//        int left = 0;
//        for (int i = 0; i < k; i++) {
//            if (xters[i] == 'B') {
//                blackCounter++;
//            }
//        }
//        min = Math.min(min, k - blackCounter);
//        for (int i = k; i < xters.length; i++) {
//            char leftXter = xters[left];
//            char rightXter = xters[i];
//
//            if (rightXter == 'B') {
//                blackCounter++;
//            }
//
//            if (leftXter == 'B') {
//                blackCounter--;
//            }
//            min = Math.min(min, k - blackCounter);
//            left++;
//        }
//        return min;
//    }
}
