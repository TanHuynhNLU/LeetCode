package easy;

import java.util.*;

public class DestinationCity1436 {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
           map.put(path.get(0),path.get(1));
        }
        String des = paths.get(0).get(0);
        while (map.containsKey(des)){
            des = map.get(des);
        }
        return des;
//        Best solution
//        int l=paths.size();
//        HashSet<String> set=new HashSet<>();
//        for(int i=0;i<l;i++)
//        {
//            set.add(paths.get(i).get(0));
//        }
//        for(int i=0;i<l;i++)
//        {
//            if(!set.contains(paths.get(i).get(1)))
//                return paths.get(i).get(1);
//        }
//        return "";
    }
}
