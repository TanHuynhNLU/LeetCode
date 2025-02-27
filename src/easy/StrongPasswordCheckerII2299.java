package easy;

public class StrongPasswordCheckerII2299 {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;
        String special = "!@#$%^&*()-+";
        boolean isLowercase = false, isUppercase = false, isDigit = false, isSpecial = false;
        char prev = ' ';
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) isLowercase = true;
            if (Character.isUpperCase(c)) isUppercase = true;
            if (Character.isDigit(c)) isDigit = true;
            if (special.contains(String.valueOf(c))) isSpecial = true;
            if (c == prev) return false;
            prev = c;
        }
        return isLowercase && isUppercase && isDigit && isSpecial;
    }

    //    Best Solution
//    public boolean strongPasswordCheckerII(String p) {
//        int l = p.length();
//        if (l < 8) return false;
//        int a = 0, b = 0, c = 0, d = 0;
//        String s = "!@#$%^&*()-+";
//        char x[] = p.toCharArray();
//        for (int i = 0; i < l; i++) {
//            if (x[i] >= '0' && x[i] <= '9') a = 1;
//            else if (x[i] >= 'a' && x[i] <= 'z') b = 1;
//            else if (x[i] >= 'A' && x[i] <= 'Z') c = 1;
//            else if (s.indexOf(x[i]) > -1) d = 1;
//            if (i != l - 1 && x[i] == x[i + 1]) return false;
//        }
//        return a + b + c + d == 4;
//    }
}
