package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ShuffleAnArray384 {
    int[] origin;
    int[] copy;

    public ShuffleAnArray384(int[] nums) {
        this.origin = nums;
        this.copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);
    }

    public int[] reset() {
        System.arraycopy(copy, 0, origin, 0, copy.length);
        return origin;
    }

    public int[] shuffle() {
        Random rd = new Random();
        for (int i = 0; i < origin.length; i++) {
            int rdIndex = rd.nextInt(origin.length);
            int tmp = origin[rdIndex];
            origin[rdIndex] = origin[i];
            origin[i] = tmp;
        }
        return origin;
    }
}
