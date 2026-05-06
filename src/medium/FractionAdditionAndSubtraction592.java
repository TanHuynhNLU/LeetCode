package medium;

public class FractionAdditionAndSubtraction592 {
    public String fractionAddition(String expression) {
        String[] split = expression.split("/|(?=[+-])");
        int[] arr = new int[split.length];
        int a = 0;
        int b = Integer.parseInt(split[1]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        for (int i = 3; i < arr.length; i += 2) {
            b = lcm(b, arr[i]);
        }
        for (int i = 0; i < arr.length; i += 2) {
            a += arr[i] * (b / arr[i + 1]);
        }
        int gcd = gcd(a, b);
        a /= Math.abs(gcd);
        b /= Math.abs(gcd);
        return String.format("%d/%d", a, b);
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        int gcd = gcd(a, b);
        return Math.abs(a * b) / gcd;
    }

    //Best solution
//    public String fractionAddition(String exp) {
//        Fraction f = new Fraction(0, 1);
//        for (int i = 0; i < exp.length(); i++) {
//            boolean negative = false;
//            int num = 0;
//            int den = 0;
//            int j = i;
//            if (exp.charAt(j) == '-') {
//                negative = true;
//                j++;
//            } else if (exp.charAt(j) == '+') j++;
//            while (j < exp.length() && exp.charAt(j) >= '0' && exp.charAt(j) <= '9') {
//                num *= 10;
//                num += (int) (exp.charAt(j) - '0');
//                j++;
//            }
//            j++;
//            while (j < exp.length() && exp.charAt(j) >= '0' && exp.charAt(j) <= '9') {
//                den *= 10;
//                den += (int) (exp.charAt(j) - '0');
//                j++;
//            }
//            if (negative) num *= (-1);
//            i = j - 1;
//            f.add(new Fraction(num, den));
//        }
//        f.reduce();
//        StringBuilder sb = new StringBuilder();
//        sb.append(f.num);
//        sb.append('/');
//        sb.append(f.den);
//        return sb.toString();
//    }
}

//class Fraction {
//    public int num;
//    public int den;
//
//    public Fraction(int num, int den) {
//        this.num = num;
//        this.den = den;
//    }
//
//    public void add(Fraction f) {
//        this.num = num * f.den + den * f.num;
//        this.den = den * f.den;
//        glorify();
//    }
//
//    public void reduce() {
//        if (num == 0) {
//            den = 1;
//            return;
//        }
//        int remainder = gcd(num, den);
//        num /= remainder;
//        den /= remainder;
//        glorify();
//    }
//
//    private int gcd(int num, int den) {
//        if (num % den == 0) return den;
//        return gcd(den, (num % den));
//    }
//
//    private void glorify() {
//        if (num < 0 && den < 0) {
//            num = Math.abs(num);
//            den = Math.abs(den);
//        } else if (num > 0 && den > 0) return;
//        else {
//            num = -Math.abs(num);
//            den = Math.abs(den);
//        }
//    }
//}
