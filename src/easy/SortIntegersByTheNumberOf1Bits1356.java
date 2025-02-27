package easy;

import java.util.*;

public class SortIntegersByTheNumberOf1Bits1356 {
    public static int[] sortByBits(int[] arr) {
        int count = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = Integer.bitCount(arr[i]);
            List<Integer> value = map.getOrDefault(key, new ArrayList<>());
            value.add(arr[i]);
            map.put(key,value);
        }
        for (Map.Entry entry : map.entrySet()) {
            List<Integer> list = (List<Integer>) entry.getValue();
            Collections.sort(list);
            for (int n : list) {
                arr[count++] = n;
            }
        }
        return arr;
//        Best Solution
//        for(int i = 0; i<arr.length; i++){
//            arr[i] += Integer.bitCount(arr[i])*10001;
//        }
//
//        Arrays.sort(arr);
//
//        for(int i = 0; i<arr.length; i++){
//            arr[i] = arr[i]%10001;
//        }
//        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        sortByBits(arr);
    }
}
