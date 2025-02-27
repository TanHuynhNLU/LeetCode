package easy;

import java.util.Stack;

public class CrawlerLogFolder1598 {
    public int minOperations(String[] logs) {
        int count = 0;
        for (int i = 0; i < logs.length; i++) {
            if(logs[i].equals("../")) {
                if(count>0)count--;
                continue;
            }
            if(!(logs[i].equals("./"))) count++;
        }
        return count;
    }

//    Best Solution
//public int minOperations(String[] logs) {
//    int x = 0;
//
//    for(String s : logs)
//        x += add(s, x);
//
//    return x;
//}
//
//    public int add(String s, int x){
//        return s.charAt(1) == '.' ? x == 0 ? 0 : - 1 : s.charAt(0) == '.' ? 0 : 1;
//    }
}
