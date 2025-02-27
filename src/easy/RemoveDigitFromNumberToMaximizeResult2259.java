package easy;

public class RemoveDigitFromNumberToMaximizeResult2259 {
    public String removeDigit(String number, char digit) {
        String max = "";
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                StringBuilder sb = new StringBuilder(number);
                sb.deleteCharAt(i);
                if (!sb.toString().equals(max) && isLarger(sb.toString(), max)) max = sb.toString();
            }
        }
        return max;
    }
    
    public boolean isLarger(String number1, String number2) {
        if (number1.length() > number2.length()) return true;
        if (number1.length() < number2.length()) return false;
        for (int i = 0; i < number1.length(); i++) {
            if (number1.charAt(i) > number2.charAt(i)) return true;
            if (number1.charAt(i) < number2.charAt(i)) return false;
        }
        return false;
    }
//    Best Solution
//    public String removeDigit(String number, char digit) {
//    int last=0;
//    for(int i=0; i<number.length(); i++){
//        if(number.charAt(i)==digit){
//            last=i;
//            if(i!=number.length()-1 && number.charAt(i+1)>digit){
//                break;
//            }
//        }
//    }
//    return (number.substring(0,last).concat(number.substring(last+1, number.length())));
//
//}
}
