package easy;

public class Base7504 {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        StringBuilder sb = new StringBuilder();
        boolean isNegative = false;
        if(num<0) {
            isNegative=true;
            num = Math.abs(num);
        }
        while (num!=0){
            sb.append(num%7);
            num/=7;
        }
        if(isNegative) sb.append("-");
        return sb.reverse().toString();
        //    Best solution
//        return Integer.toString(num, 7);
    }

}
