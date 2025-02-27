package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (myMap.containsKey(tmp)) {
                result[0] = myMap.get(tmp);
                result[1] = i;
            } else {
                myMap.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(twoSum(arr, 3)));
    }
}
