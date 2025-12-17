package medium;

public class ComplexNumberMultiplication537 {
    public String complexNumberMultiply(String num1, String num2) {
        String[] split1 = num1.split("\\+");
        int a1 = Integer.parseInt(split1[0]);
        int b1 = Integer.parseInt(split1[1].substring(0, split1[1].length() - 1));

        String[] split2 = num2.split("\\+");
        int a2 = Integer.parseInt(split2[0]);
        int b2 = Integer.parseInt(split2[1].substring(0, split2[1].length() - 1));
        int a = a1 * a2 - b1 * b2;
        int b = b1 * a2 + a1 * b2;

        StringBuilder sb = new StringBuilder();
        sb.append(a).append("+").append(b).append("i");
        return sb.toString();
    }

    // Best Solution
//    public String complexNumberMultiply(String num1, String num2) {
//        int charAt = 0;
//        int real1 = Integer.parseInt(num1.substring(0, (charAt = num1.indexOf('+'))));
//        int img1 = Integer.parseInt(num1.substring(charAt + 1, num1.length() - 1));
//        int real2 = Integer.parseInt(num2.substring(0, (charAt = num2.indexOf('+'))));
//        int img2 =  Integer.parseInt(num2.substring(charAt + 1, num2.length() - 1));
//        int a = real1 * real2 - img1 * img2;
//        int b = real1 * img2 + img1 * real2;
//        StringBuilder sb = new StringBuilder();
//        sb.append(a);
//        sb.append("+");
//        sb.append(b);
//        sb.append("i");
//        return sb.toString();
//    }
}
