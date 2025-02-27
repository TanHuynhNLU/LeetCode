package medium;

public class MultiplyStrings43 {
    public static String multiply(String num1, String num2) {
        if(num1.charAt(0) == '0' && num2.charAt(0) == '0') return "0";
        String res = "0";
        for (int i = num2.length() - 1; i >= 0; i--) {
            int shiftLeft = num2.length() - i - 1;
            for (int j = num1.length() - 1; j >= 0; j--) {
                int mul = (num1.charAt(j) - '0') * (num2.charAt(i) - '0');
                StringBuilder sb = new StringBuilder();
                sb.append(mul);
                for (int k = 0; k < shiftLeft; k++) {
                    sb.append(0);
                }
                res = sum(res, sb.toString());
                shiftLeft++;
            }
        }
        return res;
    }

    public static String sum(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 && j >= 0) {
            int sum = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = (num1.charAt(i) - '0') + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
        }
        while (j >= 0) {
            int sum = (num2.charAt(j) - '0') + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            j--;
        }
        if (carry != 0)
            sb.append(carry);
        return sb.reverse().toString();
    }

//    Best Solution
//public String multiply(String num1, String num2) {
//    if ("0".equals(num1) || "0".equals(num2)) {
//        return "0";
//    }
//    int m = num1.length(), n = num2.length();
//    int[] arr = new int[m + n];
//    for (int i = m - 1; i >= 0; --i) {
//        int a = num1.charAt(i) - '0';
//        for (int j = n - 1; j >= 0; --j) {
//            int b = num2.charAt(j) - '0';
//            arr[i + j + 1] += a * b;
//        }
//    }
//    for (int i = arr.length - 1; i > 0; --i) {
//        arr[i - 1] += arr[i] / 10;
//        arr[i] %= 10;
//    }
//    int i = arr[0] == 0 ? 1 : 0;
//    StringBuilder ans = new StringBuilder();
//    for (; i < arr.length; ++i) {
//        ans.append(arr[i]);
//    }
//    return ans.toString();
//}

    public static void main(String[] args) {
        multiply("123", "456");
    }
}
