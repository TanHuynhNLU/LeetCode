package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EliminationGame390 {
    public int lastRemaining(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        return helper(list, true);
    }

    public int helper(List<Integer> list, boolean lToR) {
        if (list.size() == 1) return list.get(0);
        if (lToR)
            for (int i = 0; i < list.size(); i += 1) {
                list.remove(i);
            }
        else {
            for (int i = list.size() - 1; i >= 0; i -= 2) {
                list.remove(i);
            }
        }
        return helper(list, !lToR);
    }

//    public int lastRemaining(int n) {
//        boolean left = true;
//        int remaining = n;
//        int step = 1;
//        int head = 1;
//        while (remaining > 1) {
//            if (left || remaining % 2 == 1) {
//                head = head + step;
//            }
//            remaining = remaining / 2;
//            step = step * 2;
//            left = !left;
//        }
//        return head;
//    }
}
