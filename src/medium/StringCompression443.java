package medium;

public class StringCompression443 {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;
        int count = 0;
        int pointer = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            count++;
            if (chars[i] != chars[i + 1]) {
                chars[pointer++] = chars[i];
                if (count != 1) {
                    String s = String.valueOf(count);
                    for (char c : s.toCharArray()) {
                        chars[pointer++] = c;
                    }
                }
                count = 0;
            }
        }
        count++;
        chars[pointer++] = chars[chars.length - 1];
        if (count != 1) {
            String s = String.valueOf(count);
            for (char c : s.toCharArray()) {
                chars[pointer++] = c;
            }
        }
        return pointer;
    }

    // Another Solution
//    public int compress(char[] chars) {
//        int i = 0;
//        int count = 1;
//
//        for (int j = 1; j <= chars.length; j++) {
//
//            if (j == chars.length || chars[j] != chars[j - 1]) {
//                chars[i++] = chars[j - 1];
//
//                if (count > 1) {
//                    String countStr = String.valueOf(count);
//                    for (char digit : countStr.toCharArray()) {
//                        chars[i++] = digit;
//                    }
//                }
//
//                count = 1;
//            } else {
//                count++;
//            }
//        }
//        return i;
//    }
}
