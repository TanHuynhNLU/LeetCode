package easy;

import java.util.List;

public class PointsThatIntersectWithCars2848 {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] counters = new int[102];
        for (List<Integer> num : nums) {
            counters[num.get(0)]++;
            counters[num.get(1) + 1]--;
        }
        int count = 0;
        for (int i = 1; i < 102; i++) {
            counters[i] = counters[i - 1] + counters[i];
            if (counters[i] != 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
