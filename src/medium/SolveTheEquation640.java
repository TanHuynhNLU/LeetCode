package medium;

public class SolveTheEquation640 {
    public String solveEquation(String equation) {
        String[] splitEquation = equation.split("=");
        String[] splitLeft = splitEquation[0].split("(?=[+-])");
        String[] splitRight = splitEquation[1].split("(?=[+-])");
        int numX = 0;
        int sumLeft = 0;
        int sumRight = 0;
        for (String s : splitLeft) {
            if (s.contains("x")) {
                String x = s.substring(0, s.indexOf("x"));
                if (x.length() > 1) {
                    numX += Integer.parseInt(x);
                } else {
                    if (s.contains("-")) numX--;
                    else if (s.contains("+")||x.isEmpty()) numX++;
                    else numX += Integer.parseInt(x);
                }
            } else sumLeft += Integer.parseInt(s);
        }
        for (String s : splitRight) {
            if (s.contains("x")) {
                String x = s.substring(0, s.indexOf("x"));
                if (x.length() > 1) {
                    numX -= Integer.parseInt(x);
                } else {
                    if (s.contains("-")) numX++;
                    else if (s.contains("+")||x.isEmpty()) numX--;
                    else numX -= Integer.parseInt(x);
                }
            } else sumRight += Integer.parseInt(s);
        }
        if (sumLeft == sumRight && numX == 0) return "Infinite solutions";
        if (numX == 0) return "No solution";
        return String.format("x=%d", (sumRight - sumLeft) / numX);
    }
    // Best Solution
//    public String solveEquation(String equation) {
//        int x1 = 0, x2 = 0;
//        int sum1 = 0, sum2 = 0, sign = 1;
//        int n = equation.length();
//        boolean flag = true;
//        for(int i = 0; i < n; i++) {
//            char c = equation.charAt(i);
//            if(c == '=') flag = false;
//            else if(c == 'x') {
//                if(flag) x1 += sign;
//                else x2 += sign;
//                sign = 1;
//            }else if(c >= '0' && c <= '9') {
//                int val = 0;
//                while(i < n && equation.charAt(i) >= '0' && equation.charAt(i) <= '9') val = 10 * val + equation.charAt(i++) - '0';
//                i--;
//                if(i < n - 1 && equation.charAt(i + 1) == 'x') {
//                    i++;
//                    if(flag) x1 += sign * val;
//                    else x2 += sign * val;
//                }else if(flag) sum1 += sign * val;
//                else sum2 += sign * val;
//                sign = 1;
//            }else if(c == '-') sign = -1;
//        }
//
//        if(x1 == x2 && sum1 == sum2) return "Infinite solutions";
//        else if(sum1 == 0 && sum2 == 0) return "x=0";
//        else if(x1 == x2) return "No solution";
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("x=").append((sum2 - sum1) / (x1 - x2));
//        return sb.toString();
//    }
}
