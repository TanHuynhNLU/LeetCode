package easy;

import java.util.Arrays;
import java.util.List;

public class ConstructTheMinimumBitwiseArrayI3314 {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] result = new int[nums.size()];
        Arrays.fill(result, -1);
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            for (int j = 1; j < num; j++) {
                if ((j | j + 1) == num) {
                    result[i] = j;
                    break;
                }
            }
        }
        return result;
    }
}
