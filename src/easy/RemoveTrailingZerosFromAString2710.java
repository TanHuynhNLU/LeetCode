package easy;

public class RemoveTrailingZerosFromAString2710 {
    public String removeTrailingZeros(String num) {
        int i =num.length();
        for (int j = num.length(); j >=0 ; j--) {
            if(num.charAt(i)=='0') i--;
            else break;
        }
        return num.substring(0,i);
    }
}
