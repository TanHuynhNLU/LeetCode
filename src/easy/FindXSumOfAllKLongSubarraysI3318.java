package easy;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindXSumOfAllKLongSubarraysI3318 {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i <= nums.length - k; i++) {
            res[i] = xSum(nums, k, x, i);
        }
        return res;
    }

    public int xSum(int[] nums, int k, int x, int start) {
        int[] count = new int[51];
        int res = 0;
        for (int i = start; i < start + k; i++) {
            count[nums[i]]++;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder());
        for (int i = 1; i < 51; i++) {
            if (count[i] != 0) pq.add(new Pair(i, count[i]));
        }
        int c = 0;
        while (!pq.isEmpty() && c < x) {
            Pair p = pq.poll();
            res += p.value * p.count;
            c++;
        }
        return res;
    }

    public static void main(String[] args) {
        FindXSumOfAllKLongSubarraysI3318 f = new FindXSumOfAllKLongSubarraysI3318();
        System.out.println(f.xSum(new int[]{1, 1, 2, 2, 3}, 5, 2, 0));
    }
}


class Pair implements Comparable<Pair> {
    int value;
    int count;

    public Pair(int value, int count) {
        this.value = value;
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pair))
            return false;
        Pair other = (Pair) o;
        return this.count == other.count && this.value == other.value;
    }

    @Override
    public int compareTo(Pair o) {
        if (this.count == o.count) {
            return Integer.compare(this.value, o.value);
        }
        return Integer.compare(this.count, o.count);
    }
}
