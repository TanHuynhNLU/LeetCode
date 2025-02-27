package easy;

import java.util.*;

public class MergeSimilarItems2363 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] item : items1) {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }
        for (int[] item : items2) {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(entry.getKey());
            list.add(entry.getValue());
            res.add(list);
        }
        return res;
    }

    //    Best Solution
//    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
//        int[] mp = new int[1001];
//        for (int[] item : items1) mp[item[0]] += item[1];
//        for (int[] item : items2) mp[item[0]] += item[1];
//        List<List<Integer>> ret = new ArrayList<>();
//        for (int i = 1; i < mp.length; i++) {
//            if (mp[i] == 0) continue;
//            int finalI = i;
//            ret.add(new ArrayList<Integer>() {
//                {
//                    add(finalI);
//                    add(mp[finalI]);
//                }
//            });
//        }
//        return ret;
//    }
}
