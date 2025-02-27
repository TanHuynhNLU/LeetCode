package easy;

public class AddBinary67 {
    public static String addBinary(String a, String b) {
        String result = "";
        int i1 = a.length() - 1;
        int i2 = b.length() - 1;
        byte r = 0;
        while (i1 >= 0 && i2 >= 0) {
            byte value1 = (byte) (a.charAt(i1) == '1' ? 1 : 0);
            byte value2 = (byte) (b.charAt(i2) == '1' ? 1 : 0);
            byte sum = (byte) (value1 + value2 + r);
            if (sum < 2) {
                result = sum + result;
                r = 0;
            }
            if (sum == 2) {
                result = 0 + result;
                r = 1;
            }
            if (sum == 3) {
                result = 1 + result;
                r = 1;
            }
            i1--;
            i2--;
        }
        while (i1 >= 0) {
            byte value1 = (byte) (a.charAt(i1) == '1' ? 1 : 0);
            byte sum = (byte) (value1 + r);
            if (sum < 2) {
                result = sum + result;
                r = 0;
            }
            if (sum == 2) {
                result = 0 + result;
                r = 1;
            }
            i1--;
        }
        while (i2 >= 0) {
            byte value2 = (byte) (b.charAt(i2) == '1' ? 1 : 0);
            byte sum = (byte) (value2 + r);
            if (sum < 2) {
                result = sum + result;
                r = 0;
            }
            if (sum == 2) {
                result = 0 + result;
                r = 1;
            }
            i2--;
        }
        if (r == 1) result = 1 + result;
        return result;

        //best solution
//        StringBuilder sb = new StringBuilder();
//        int carry = 0;
//        int i = a.length() - 1;
//        int j = b.length() - 1;
//
//        while (i >= 0 || j >= 0 || carry == 1)
//        {
//            if(i >= 0)
//                carry += a.charAt(i--) - '0';
//            if(j >= 0)
//                carry += b.charAt(j--) - '0';
//            sb.append(carry % 2);
//            carry /= 2;
//        }
//        return sb.reverse().toString();
//    }
    }

    public static void main(String[] args) {
//        String a = "1010";
//        String b = "1011";
//        System.out.println(a.charAt(0) == '1');
//        System.out.println("Number: " + addBinary(a, b));
        char a = 'B';
        char b = 'A';
        System.out.println(a - b);
    }
}
