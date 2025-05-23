package medium;

import java.util.ArrayList;
import java.util.List;

public class AdditiveNumber306 {
    boolean isAddictive = false;
    List<Long> list = new ArrayList<>();

    public boolean isAdditiveNumber(String num) {
        if (num.length() < 3) return false;
        backtrack(num, 0);
        return isAddictive;
    }

    public void backtrack(String num, int start) {
        if (isAddictive) return;
        if (start == num.length() && list.size() >= 3) isAddictive = true;
        for (int i = start; i < Math.min(start + 18, num.length()); i++) {
            if (i > start && num.charAt(start) == '0') break;
            long n = Long.parseLong(num.substring(start, i + 1));
            if (list.size() >= 2) {
                long firstPrev = list.get(list.size() - 1);
                long secondPrev = list.get(list.size() - 2);
                if (n > firstPrev + secondPrev) break;
                if (n == firstPrev + secondPrev) {
                    list.add(n);
                    backtrack(num, i + 1);
                    list.remove(list.size() - 1);
                    break;
                }
            } else {
                list.add(n);
                backtrack(num, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
