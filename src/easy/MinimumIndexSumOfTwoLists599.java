package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = list1.length+ list2.length;
        Map<String ,Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < list1.length ; i++) {
            map.put(list1[i],i );
        }
        for (int i = 0; i < list2.length; i++) {
            if(map.containsKey(list2[i])){
                if(map.get(list2[i])+i<min){
                    res.clear();
                    res.add(list2[i]);
                }
                if(map.get(list2[i])+i==min){
                    res.add(list2[i]);
                }
                min = map.get(list2[i])+i;
            }
        }

        return res.toArray(new String[0]);
//        Best solution
//        if (list1.length > list2.length) return findRestaurant(list2, list1);
//        HashMap<String, Integer> map1 = new HashMap<>();
//        for(int i = 0; i < list1.length ; i++) {
//            map1.put(list1[i] , i);
//        }
//        int minsum = Integer.MAX_VALUE;
//        int j = 0;
//        ArrayList<String> resulting = new ArrayList<>();
//        for(int i = 0 ; i < list2.length && i<=minsum; i++) {
//            String key =  list2[i];
//            int value = i;
//
//            if(map1.containsKey(key)) {
//                int value1 = map1.get(key);
//                int sum = value+value1;
//                if(sum <= minsum){
//                    if(sum < minsum) {
//                        resulting.clear();
//                    }
//                    minsum = sum;
//                    resulting.add(key);
//                }
//            }
//        }
//        return resulting.toArray(new String[resulting.size()]);
    }
}
