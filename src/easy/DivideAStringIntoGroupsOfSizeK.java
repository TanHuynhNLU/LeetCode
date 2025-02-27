package easy;

public class DivideAStringIntoGroupsOfSizeK {
    public static String[] divideString(String s, int k, char fill) {
        int n = (int) Math.ceil((double) s.length() / k);
        String[] res = new String[n];
        int count = 0;
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            count++;
            if (count == k) {
                res[index++] = sb.toString();
                count = 0;
                sb = new StringBuilder();
            }
        }
        if (count != 0) {
            for (; count < k; count++) {
                sb.append(fill);
            }
            res[index++] = sb.toString();
        }
        return res;
    }

    //   Best Solution
//    public String[] divideString(String s, int k, char fill) {
//        int remain = s.length() % k;
//        int groups = s.length() / k;
//        if (remain != 0) {
//            groups++;
//        }
//
//        String[] result = new String[groups];
//        int i = 0;
//        for (int j = 0; j < groups - 1; j++) {
//            result[j] = s.substring(i, i + k);
//            i += k;
//        }
//        StringBuilder last = new StringBuilder();
//        last.append(s.substring(i));
//        int delta = k - last.length();
//        for (i = 0; i < delta; i++) {
//            last.append(fill);
//        }
//        result[groups - 1] = last.toString();
//        return result;
//    }

    public static void main(String[] args) {
        divideString("abcdefghij", 3, 'x');
    }
}
