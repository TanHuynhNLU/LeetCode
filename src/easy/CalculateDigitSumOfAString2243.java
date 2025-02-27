package easy;

public class CalculateDigitSumOfAString2243 {
    public static String digitSum(String s, int k) {
        StringBuilder res = new StringBuilder(s);
        while (res.length() > k) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < res.length(); i += k) {
                int sum = 0;
                for (int j = i; j < i + k && j < res.length(); j++) {
                    sum += Character.getNumericValue(res.charAt(j));
                }
                tmp.append(sum);
            }
            res = tmp;
        }
        return res.toString();
    }

//    Best Solution
//public String digitSum(String s, int k) {
//    if(s.length()<=k) return s;
//
//    StringBuilder sb = new StringBuilder();
//    for(int i = 1, sum = 0; i<=s.length(); i++){
//        sum += s.charAt(i-1) - '0';
//        if(i%k==0 || i == s.length()){
//            sb.append(sum);
//            sum = 0;
//        }
//    }
//
//    return digitSum(sb.toString(), k);
//}

    public static void main(String[] args) {
        digitSum("11111222223", 3);
    }
}
