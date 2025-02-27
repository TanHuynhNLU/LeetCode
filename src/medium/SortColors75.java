package medium;

public class SortColors75 {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            while (count[k] == 0) k++;
            nums[i] = k;
            count[k]--;
        }
    }
}
