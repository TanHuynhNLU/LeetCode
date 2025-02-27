package easy;

public class IsSubsequence392 {
    public static boolean isSubsequence(String s, String t) {
        int flag =-1;
        for (char c:s.toCharArray()){
            int index=t.indexOf(c,flag+1);
            if(index>flag){
                flag= index;
            }else return false;
        }
        return true;
//        Another solution
//        int i=0,j=0;
//        int n=t.length();
//        int m=s.length();
//        char ss[]=s.toCharArray();
//        char tt[]=t.toCharArray();
//
//        if(m<1)
//            return true;
//
//        while(i<n){
//            if(tt[i]==ss[j]){
//                j++;
//            }
//            i++;
//
//            if(j==m)
//                return true;
//        }
//
//        return false;
//    }
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","aebfc"));
    }
}
