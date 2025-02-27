package easy;

import java.util.Stack;

public class RemoveOutermostParentheses1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        int count1 = 0;
        int count2 = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '(') count1++;
            else count2++;
            tmp.append(c);
            if (count1 == count2) {
                res.append(tmp.substring(1, tmp.length() - 1));
                tmp = new StringBuilder();
                count2 = 0;
                count1 = 0;
            }
        }
        return res.toString();
//      Best solution
//        char[] chr=s.toCharArray();
//        int c=1,l=chr.length,i=1;
//        StringBuilder res=new StringBuilder();
//        while(i<l){
//            if(chr[i]=='(')c++;
//            else c--;
//            if(c==0){
//                i+=2;
//                c=1;
//            }else{
//                res.append(chr[i]);
//                i++;
//            }
//        }
//        return res.toString();
    }

    public static void main(String[] args) {
        String s ="abc";
        System.out.println(s.substring(1,s.length()-1));
    }
}
