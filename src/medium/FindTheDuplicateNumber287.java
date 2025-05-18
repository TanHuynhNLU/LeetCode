package medium;

public class FindTheDuplicateNumber287 {
    public int findDuplicate(int[] nums) {
        int[] counts = new int[10001];
        for (int num : nums) {
            if (counts[num] != 0) return num;
            counts[num]++;
        }
        return 0;
    }
}
