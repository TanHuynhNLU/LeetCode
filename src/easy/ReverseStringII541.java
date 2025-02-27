package easy;

public class ReverseStringII541 {
    public static String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        if (s.length() <= k) return res.append(s).reverse().toString();
        for (int i = 0; i < s.length(); i += 2 * k) {
            StringBuilder tmp = new StringBuilder();
            boolean isReverse = false;
            for (int j = 0; j < 2 * k; j++) {
                if (i + j >= s.length()) break;
                tmp.append(s.charAt(i + j));
                if (j + 1 == k) {
                    isReverse=true;
                    tmp.reverse();
                }
            }
            if(!isReverse) tmp.reverse();
            res.append(tmp);
        }
        return res.toString();
//        Best solution
//        public String reverseStr(String s, int k) {
//            char[] charArray = s.toCharArray();
//
//            for(int i = 0; i < s.length(); i += 2 * k) {
//                reverse(charArray, i, k - 1);
//            }
//
//            return new String(charArray);
//        }
//
//        private void reverse(char[] arr, int start, int k) {
//            int right = Math.min(arr.length - 1, start + k);
//
//            // swap
//            while(start < right) {
//                char temp = arr[start];
//                arr[start] = arr[right];
//                arr[right] = temp;
//
//                start++;
//                right--;
//            }
//        }
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 8));
    }
}
