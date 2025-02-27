package easy;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups830 {
    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        char prev = ' ';
        int count =0;
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(c!=prev){
                if(count>=3){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i-count);
                    list.add(i-1);
                    res.add(list);
                }
                count=1;
                prev=c;
            }
            else {
                count++;
            }
        }
        if(count>=3){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(s.length()-count);
            list.add(s.length()-1);
        }
        return res;
    }

    public static void main(String[] args) {
        largeGroupPositions("abbxxxxzzy");
    }
}
