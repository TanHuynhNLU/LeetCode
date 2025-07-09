package medium;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers386 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> lexicalOrder(int n) {
        helper(n, 1, 0, 0);
        return result;
    }

    public void helper(int n, int start, int idx, int prevNum) {

        for (int i = start; i <= 9; i++) {
            int num = prevNum * 10 + i;
            if (num > n) return;
            result.add(num);
            helper(n, 0, idx + 1, num);
        }
    }
}
