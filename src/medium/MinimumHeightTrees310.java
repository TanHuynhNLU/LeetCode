package medium;

import java.util.*;

public class MinimumHeightTrees310 {
    // Remove leaf solution
//    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
//        if (n <= 2) {
//            List<Integer> list = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                list.add(i);
//            }
//            return list;
//        }
//        int[] count = new int[n];
//        Map<Integer, List<Integer>> map = new HashMap<>();
//        for (int[] edge : edges) {
//            count[edge[0]]++;
//            count[edge[1]]++;
//
//            List<Integer> list1 = map.getOrDefault(edge[0], new ArrayList<>());
//            list1.add(edge[1]);
//            map.put(edge[0], list1);
//
//            List<Integer> list2 = map.getOrDefault(edge[1], new ArrayList<>());
//            list2.add(edge[0]);
//            map.put(edge[1], list2);
//        }
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 0; i < n; i++) {
//            if (count[i] == 1) queue.add(i);
//        }
//        int numNode = 0;
//        while (n - numNode > 2) {
//            int size = queue.size();
//            numNode += size;
//            for (int i = 0; i < size; i++) {
//                int key = queue.poll();
//                List<Integer> neighbors = map.get(key);
//                for (int neighbor : neighbors) {
//                    count[neighbor]--;
//                    if (count[neighbor] == 1) {
//                        queue.add(neighbor);
//                    }
//                }
//            }
//        }
//
//        return queue.stream().toList();
//    }

    // Best solution
//    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
//        int[] counts = new int[n];
//        int[] links = new int[n];
//        for (int[] edge : edges) {
//            links[edge[0]] ^= edge[1];
//            counts[edge[0]]++;
//            links[edge[1]] ^= edge[0];
//            counts[edge[1]]++;
//        }
//        Queue<Integer> Qu = new LinkedList<>();
//        int[] dists = new int[n];
//        for (int i = 0; i < n; i++) {
//            if (counts[i] == 1)
//                Qu.add(i);
//        }
//        int stp = 1;
//        while (!Qu.isEmpty()) {
//            int size = Qu.size();
//            for (int j = 0; j < size; j++) {
//                int tmp = Qu.poll();
//                links[links[tmp]] ^= tmp;
//                counts[links[tmp]]--;
//                if (counts[links[tmp]] == 1) {
//                    dists[links[tmp]] = Math.max(stp, dists[links[tmp]]);
//                    Qu.add(links[tmp]);
//                }
//            }
//            stp++;
//        }
//        int max = 0;
//        for (int i = 0; i < n; i++) {
//            max = Math.max(dists[i], max);
//        }
//        List<Integer> res = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            if (dists[i] == max)
//                res.add(i);
//        }
//        return res;
//    }
}
