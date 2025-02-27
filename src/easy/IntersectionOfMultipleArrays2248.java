package easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfMultipleArrays2248 {
    public List<Integer> intersection(int[][] nums) {
        int[] counts = new int[1001];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                counts[nums[i][j]]++;
            }
        }
        List<Integer> intersection = new ArrayList<>();
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] == nums.length) intersection.add(i);
        }
        return intersection;
    }
}
