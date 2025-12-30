package medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall554 {
    public int leastBricks(List<List<Integer>> wall) {
        int h = wall.size();
        int res = h;
        Map<Integer, Integer> map = new HashMap<>();

        for (List<Integer> row : wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                int val = map.getOrDefault(sum, 0);
                map.put(sum, val + 1);
            }
        }
        for (int val : map.values()) {
            res = Math.min(res, h - val);
        }
        return res;
    }

    // Best Solution
//    static{
//        for(int i=0;i<500;i++){
//            leastBricks(null);
//        }
//    }
//    public static int leastBricks(List<List<Integer>> wall) {
//        if(wall==null)
//            return 0;
//        Map<Integer,Integer> map=new HashMap<>();
//        int max=0;
//        for(List<Integer> subList:wall){
//            int sum=0;
//            for(int i=0;i<subList.size()-1;i++){
//                int num=subList.get(i);
//                sum+=num;
//                map.put(sum,map.getOrDefault(sum,0)+1);
//                max=Math.max(max,map.get(sum));
//            }
//        }
//        return wall.size()-max;
//
//    }
}
