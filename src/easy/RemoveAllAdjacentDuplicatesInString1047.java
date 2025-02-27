package easy;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString1047 {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c: chars){
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            }
            char prevChar = stack.peek();
            if(prevChar==c) stack.pop();
            else stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
//        Best solution
//        int index = -1;
//        char []  ch = s.toCharArray();
//        for(char c : ch)
//        {
//            if(index >= 0 && ch[index] == c)
//            {
//                index--;
//            }
//            else
//            {
//                ch[++index] = c;
//            }
//        }
//        return String.valueOf(ch, 0, index+1);
    }

    public static void main(String[] args) {
        removeDuplicates("abbaca");
    }
}
