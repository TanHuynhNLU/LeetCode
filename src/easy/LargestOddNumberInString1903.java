package easy;

public class LargestOddNumberInString1903 {
    public static String largestOddNumber(String num) {
       int i = num.length()-1;
       char[] chars = num.toCharArray();
        for (; i >=0; i--) {
            if(Character.getNumericValue(chars[i])%2!=0)
                break;
        }
        return num.substring(0,i+1);
    }

    public static void main(String[] args) {
        System.out.println(largestOddNumber("35427"));
    }
}
