package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LastVisitedIntegers2899 {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        List<Integer> lastVisited = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] >= 0) {
                lastVisited.add(nums[i]);
                i++;
            } else {
                int j = lastVisited.size() - 1;
                while (i < nums.length && nums[i] == -1) {
                    if (j >= 0) {
                        res.add(lastVisited.get(j));
                        j--;
                    } else {
                        res.add(-1);
                    }
                    i++;
                }
            }
        }
        return res;
    }
}
