package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformOfAnArray1331 {
    public int[] arrayRankTransform(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        Map<Integer,Integer> map = new HashMap<>();
        int count =1;
        for (int i = 0; i < clone.length; i++) {
            if(!map.containsKey(clone[i])){
                map.put(clone[i],count++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
//        Best Solution
//        int[] arr = Arrays.copyOf(arr0, arr0.length);
//        Arrays.sort(arr);
//
//        Map<Integer, Integer> map = new HashMap<>(arr.length);
//        int position = 1;
//        int prev = Integer.MIN_VALUE;
//        for (int x : arr) {
//            if (x == prev) continue;
//            map.put(x, position++);
//            prev = x;
//        }
//
//        for (int i = 0; i < arr0.length; i++) {
//            arr0[i] = map.get(arr0[i]);
//        }
//        return arr0;
    }
}
