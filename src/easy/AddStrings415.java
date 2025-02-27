package easy;

public class AddStrings415 {
    public static String addStrings(String num1, String num2) {
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;
        char[] arr1  = num1.toCharArray();
        char[] arr2  = num2.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        int r = 0;
        while (n1>=0||n2>=0){
            if(n1>=0&&n2>=0){
                int sum = Character.getNumericValue(arr1[n1--])+Character.getNumericValue(arr2[n2--])+r;
                r=sum/10;
                strBuilder.append(sum%10);
            } else if (n1>=0) {
                int sum = Character.getNumericValue(arr1[n1--])+r;
                r=sum/10;
                strBuilder.append(sum%10);
            }else if(n2>=0){
                int sum = Character.getNumericValue(arr2[n2--])+r;
                r=sum/10;
                strBuilder.append(sum%10);
            }
        }
        if (r!=0) strBuilder.append(r);
        return strBuilder.reverse().toString();
//        Best Solution
//        int cf = 0;
//        StringBuilder sb = new StringBuilder();
//        int len = Math.max(num1.length(), num2.length());
//        int i = num1.length() - 1, j = num2.length() - 1;
//        while (i >= 0 || j >= 0) {
//            int sum = cf;
//            if (i >= 0) {
//                sum += (num1.charAt(i) - '0');
//            }
//            if (j >= 0) {
//                sum += (num2.charAt(j) - '0');
//            }
//            sb.append(sum % 10);
//            cf = sum / 10;
//            i--;
//            j--;
//        }
//        if (cf > 0) {
//            sb.append(cf);
//        }
//        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("0","0"));
    }
}
