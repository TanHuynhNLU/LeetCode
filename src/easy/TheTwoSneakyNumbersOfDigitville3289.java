package easy;

public class TheTwoSneakyNumbersOfDigitville3289 {
    public int[] getSneakyNumbers(int[] nums) {
        int[] counts = new int[101];
        int k = 0;
        int[] res = new int[2];
        for (int num : nums) {
            counts[num]++;
            if (counts[num] == 2) {
                res[k++] = num;
            }
        }
        return res;
    }
}
