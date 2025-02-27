package easy;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class SortThePeople2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        int i =0;
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            names[i++] = entry.getValue();
        }
        return names;
    }
}
