package medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations77 {
    static List<List<Integer>> combinations = new ArrayList<List<Integer>>();

    public static List<List<Integer>> combine(int n, int k) {
        backtrack(1, n, k, new ArrayList<>(), new boolean[n + 1]);
        return combinations;
    }

    public static void backtrack(int initial, int n, int k, List<Integer> list, boolean[] visited) {
        if (list.size() == k) {
            ArrayList<Integer> newList = new ArrayList<>(list);
            combinations.add(newList);
            return;
        }
        for (int i = initial; i <= n; i++) {
            if (visited[i]) continue;
            list.add(i);
            visited[i] = true;
            backtrack(i + 1, n, k, list, visited);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }

//    public List<List<Integer>> combine(int n, int k) {
//        return new AbstractList<>() {
//            private List<List<Integer>> res = null;
//
//            @Override
//            public List<Integer> get(int index) {
//                return res.get(index);
//            }
//
//            @Override
//            public int size() {
//                if (res == null) {
//                    res = new ArrayList<>();
//                    search(n, k, new ArrayList<>());
//                }
//                return res.size();
//            }
//
//            private void search(int n, int k, List<Integer> curr) {
//                if (k == 0) {
//                    res.add(new ArrayList<>(curr));
//                } else {
//                    for (int num = n; num >= 1; num--) {
//                        curr.add(num);
//                        search(num - 1, k - 1, curr);
//                        curr.removeLast();
//                    }
//                }
//            }
//        };
//    }

    public static void main(String[] args) {
        combine(4, 2);
    }
}
