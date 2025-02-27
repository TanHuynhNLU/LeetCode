package easy;

import java.util.Stack;

public class MakeTheStringGreat1544 {
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) stack.push(charArray[i]);
            else {
                if(stack.peek()==charArray[i]+32||stack.peek()==charArray[i]-32) stack.pop();
                else stack.push(charArray[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
//        Best Solution
//        StringBuilder ans = new StringBuilder();
//        for(char ch : s.toCharArray()){
//            int len = ans.length();
//            if(len>0 && Math.abs(ans.charAt(len-1) - ch ) == 32){
//                ans.deleteCharAt(len-1);
//            }else{
//                ans.append(ch);
//            }
//        }
//        return ans.toString();
    }

    public static void main(String[] args) {
        makeGood("leEeetcode");
    }
}
