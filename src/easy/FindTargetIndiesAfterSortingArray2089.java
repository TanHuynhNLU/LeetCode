package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndiesAfterSortingArray2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                res.add(i);
            }
        }
        return res;
    }
}
