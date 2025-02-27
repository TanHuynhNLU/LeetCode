package easy;

import java.util.ArrayList;
import java.util.List;

public class NumberOfRecentCalls933 {
    List<Integer> list ;
    int count = 0;
    public NumberOfRecentCalls933() {
        list = new ArrayList<>();
    }

    public int ping(int t) {
        list.add(t);
        for (int i = count; i < list.size(); i++) {
            if(t-3000> list.get(i)) count++;
            else break;
        }
        return list.size()-count;
    }

//    Best solution
//    int record[];
//    int end=0;
//    int start=0;
//    public RecentCounter() {
//        this.record=new int[10000];
//    }
//
//    public int ping(int t) {
//        record[ end++ ]=t;
//        while(record[start] < t-3000){
//            start++;
//        }
//        return end-start;
//    }
}
