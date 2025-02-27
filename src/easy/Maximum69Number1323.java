package easy;

public class Maximum69Number1323 {
    public int maximum69Number (int num) {
       StringBuilder sb = new StringBuilder(num);
       sb.append(num);
       int index = sb.indexOf("6");
       if(index!=-1){
           sb.replace(index,index+1,"9");
       }else return num;
       return Integer.parseInt(sb.toString());
//       Best solution
//        char[] number = String.valueOf(num).toCharArray();
//
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] == '6') {
//                number[i] = '9';
//                break;
//            }
//        }
//
//        return Integer.parseInt(String.copyValueOf(number));
    }
}
