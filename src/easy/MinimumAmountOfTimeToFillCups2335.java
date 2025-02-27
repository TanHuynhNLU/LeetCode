package easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumAmountOfTimeToFillCups2335 {
    public int fillCups(int[] amount) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int a : amount) {
            if (a != 0)
                pq.add(a);
        }
        while (pq.size() > 1) {
            int c1 = pq.poll();
            int c2 = pq.poll();
            c1--;
            c2--;
            count++;
            if (c1 != 0) pq.add(c1);
            if (c2 != 0) pq.add(c2);
        }
        if (pq.size() == 1)
            count += pq.poll();
        return count;
    }
//    public int fillCups(int[] A) {
//        int mx = 0, sum = 0;
//        for(int a: A) {
//            mx = Math.max(a, mx);
//            sum += a;
//        }
//        return Math.max(mx, (sum + 1) / 2);
//    }
}
