package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ZigzagConversion6 {
    public static String convert(String s, int numRows) {
        if(numRows ==1) return  s;
        StringBuilder result = new StringBuilder();
        Queue<Character> myQueue[] = new Queue[numRows];
        for (int i = 0; i < numRows; i++) {
            myQueue[i] = new LinkedList<>();
        }
        int count = 0;
        boolean asc = true;
        for (char c : s.toCharArray()) {
            myQueue[count].add(c);
            if (asc)
                count++;
            else count--;
            if(count==numRows){
                asc = false;
                count -=2;
            }
            if(count==-1){
                asc = true;
                count +=2;
            }
        }
        for (int i = 0; i < numRows; i++) {
            while (!myQueue[i].isEmpty()) {
                result.append(myQueue[i].poll()) ;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("ab", 1));
    }
}
