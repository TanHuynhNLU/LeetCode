package medium;

public class MaximumSwap670 {
    public int maximumSwap(int num) {
        String strNum = String.valueOf(num);
        char[] chars = strNum.toCharArray();
        int n = chars.length;
        int[] arr = new int[n];
        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            int val = chars[i] - '0';
            max = Math.max(max, val);
            arr[i] = max;
        }

        for (int i = 0; i < n; i++) {
            int curr = chars[i]-'0';
            if(curr<arr[i]){
                int idx = strNum.lastIndexOf('0'+ arr[i]);
                char tmp = chars[i];
                chars[i] = chars[idx];
                chars[idx] = tmp;
                return Integer.parseInt(new String(chars));
            }
        }
        return num;
    }
    // Best solution
//    public int maximumSwap(int num) {
//        char[] digits = Integer.toString(num).toCharArray();
//        int[] last = new int[10];
//        for (int i = 0; i < digits.length; i++) last[digits[i] - '0'] = i;
//        for (int i = 0; i < digits.length; i++) {
//            for (int d = 9; d > digits[i] - '0'; d--) {
//                if (last[d] > i) {
//                    char tmp = digits[i];
//                    digits[i] = digits[last[d]];
//                    digits[last[d]] = tmp;
//                    return Integer.parseInt(new String(digits));
//                }
//            }
//        }
//        return num;
//    }
}
