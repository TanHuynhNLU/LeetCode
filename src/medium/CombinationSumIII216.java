package medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII216 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(new ArrayList<>(), 1, 0, k, n);
        return res;
    }

    public void backtrack(List<Integer> list, int start, int count, int k, int n) {
        if (n < 0) return;
        if (count == k && n == 0) {
            List<Integer> tmpList = new ArrayList<>(list);
            res.add(tmpList);
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (n - i < 0) break;
            list.add(i);
            backtrack(list, i + 1, count + 1, k, n - i);
            list.remove(list.size() - 1);
        }
    }
}
