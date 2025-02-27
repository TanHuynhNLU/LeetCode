package easy;

public class NumberOfSegmentsInAString434 {
    public int countSegments(String s) {
       boolean flag = true;
       int count=0;
       for (char c:s.toCharArray()){
           if (flag&&c!=' '){
               count++;
               flag=false;
           }
           if(!flag&&c==' ') flag=true;
       }
       return count;
    }
//    Another Solution
//        int count=0;
//        for(int i=0;i<s.length();i++){
//        if((i==0||s.charAt(i-1)==' ')&&s.charAt(i)!=' '){
//            count++;
//        }
//        }
//        return count;
}
