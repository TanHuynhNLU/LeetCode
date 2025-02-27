package easy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight1046 {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            queue.add(stones[i]);
        }
        while (queue.size() > 1) {
            int stone1 = queue.poll();
            int stone2 = queue.poll();
            if (stone1 - stone2 != 0) queue.add(stone1 - stone2);
        }
        if(queue.size()==1) return queue.poll();
        else return 0;
//        Best Solution
//        int n = stones.length;
//        if(n == 1)
//            return stones[0];
//        int last = n-1;
//        while(n > 0){
//            Arrays.sort(stones);
//            int val = stones[last] - stones[last-1];
//            stones[last-1] = val;
//            stones[last] = 0;
//            n--;
//        }
//        return stones[stones.length-2];
    }
}
