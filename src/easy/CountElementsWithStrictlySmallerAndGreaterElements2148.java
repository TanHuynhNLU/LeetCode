package easy;

public class CountElementsWithStrictlySmallerAndGreaterElements2148 {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int countMin = 0;
        int countMax = 0;
        for (int num : nums) {
            if (num < min) {
                min = num;
                countMin = 1;
            } else if (num == min) countMin++;
            if (num > max) {
                max = num;
                countMax = 1;
            } else if (num == max) countMax++;
        }
        if (countMin + countMax >= nums.length) return 0;
        else
            return nums.length - countMin - countMax;
    }
}
