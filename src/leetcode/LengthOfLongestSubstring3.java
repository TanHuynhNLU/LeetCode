package leetcode;

import java.util.*;

public class LengthOfLongestSubstring3 {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        Queue<Character> myQueue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (myQueue.contains(c)) {
                if (myQueue.size() > max)
                    max = myQueue.size();
                while (myQueue.peek()!=c) myQueue.poll();
                myQueue.poll();
                myQueue.add(c);
            } else myQueue.add(c);
        }
        if(myQueue.size()>max)
            max = myQueue.size();
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcab";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
