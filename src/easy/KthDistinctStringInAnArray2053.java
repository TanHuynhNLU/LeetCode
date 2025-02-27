package easy;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class KthDistinctStringInAnArray2053 {
    public String kthDistinct(String[] arr, int k) {
        Queue<String> queue = new LinkedList<>();
        Set<String> tmpSet = new HashSet<>();
        for (String s : arr) {
            if (tmpSet.contains(s)) {
                queue.remove(s);
            } else {
                queue.add(s);
                tmpSet.add(s);
            }
        }
        int count = 1;
        for (String s : queue) {
            if (count == k) {
                return s;
            }
            count++;
        }
        return "";
    }

    //    Best solution
//    public String kthDistinct(String[] arr, int k) {
//
//        HashMap<String, Integer> map = new HashMap<>();
//
//        for (String s : arr)
//            map.put(s, map.getOrDefault(s, 0) + 1); // n. For Hasmaps insertions is nearly constant time
//
//        for (int i = 0; i < arr.length; i++) { // n
//
//            if (map.get(arr[i]) == 1) k--;
//
//            if (k == 0) return arr[i];
//        }
//
//        return "";
//    }
}
