package easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGiftsFromTheRichestPile2558 {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int g : gifts) {
            pq.add(g);
        }
        for (int i = 0; i < k; i++) {
            int p = pq.poll();
            pq.add((int) Math.floor(Math.sqrt(p)));
        }
        long sum = 0;
        for (int p : pq) {
            sum += p;
        }
        return sum;
    }
}
