package Test;

public class LatestTimeByReplacingHiddenDigits1736 {
    public String maximumTime(String time) {
        char[][] matrix = new char[][]{{'2', '1'}, {'9', '3'}, {'5'}, {'9'}};
        char[] chars = time.toCharArray();
        for (int i = 0; i < time.length(); i++) {
            if (chars[i] == '?') {
                if (i == 0) {
                    chars[0] = Character.getNumericValue(chars[1]) > 3 ? matrix[0][1] : matrix[0][0];
                }
                if (i == 1) {
                    int k = Character.getNumericValue(chars[0]) > 1 ? 1 : 0;
                    chars[1] = matrix[1][k];
                }
                if (i == 3) {
                    chars[3] = matrix[2][0];
                }
                if (i == 4) {
                    chars[4] = matrix[3][0];
                }
            }
        }
        return new String(chars);
    }

    //    Best solution
//    public String maximumTime(String time) {
//        char[] times = time.toCharArray();
//        if (times[0] == '?') {
//            times[0] = times[1] <= '3' || times[1] == '?' ? '2' : '1';
//        }
//
//        if (times[1] == '?') {
//            times[1] = times[0] == '2' ? '3' : '9';
//        }
//
//        if (times[3] == '?') {
//            times[3] = '5';
//        }
//
//        if (times[4] == '?') {
//            times[4] = '9';
//        }
//
//        return new String(times);
//    }
}
