package easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubarraysDistinctElementSumOfSquaresI2913 {
    public static int sumCounts(List<Integer> nums) {
        int res = 0;
        for (int i = 0; i < nums.size(); i++) {
            Set<Integer> set = new HashSet();
            for (int j = i; j < nums.size(); j++) {
                set.add(nums.get(j));
                res += set.size() * set.size();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        sumCounts(List.of(1, 2, 1));
    }
}
