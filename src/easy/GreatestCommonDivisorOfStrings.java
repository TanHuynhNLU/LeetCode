package easy;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) return gcdOfStrings(str2, str1);
        String res = "";
        StringBuilder sb = new StringBuilder();
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        for (int i = 0; i < char2.length; i++) {
            if(char1[i]!=char2[i]) return "";
            sb.append(char1[i]);
            if(char1.length%sb.length()==0&&char2.length%sb.length()==0) res = sb.toString();
        }
        String[] splitStr1 = str1.split(res);
        for (String s:splitStr1) {
            if(s!="") return "";
        }
        return res;
    }
//    Best Solution
//    public String gcdOfStrings(String str1, String str2) {
//        return (str1 + str2).equals(str2 + str1) ? str1.substring(0, gcd(str1.length(), str2.length())) : "";
//    }
//
//    private int gcd(int a, int b){
//        return b == 0 ? a : gcd(b, a % b);
//    }
}
