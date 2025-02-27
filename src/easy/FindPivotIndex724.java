package easy;

public class FindPivotIndex724 {
    public static int pivotIndex(int[] nums) {
          int l = nums.length;
        int[] sumLeft = new int[l];
        sumLeft[0] = nums[0];
        int[] sumRight = new int[l];
        sumRight[l - 1] = nums[l - 1];
        for (int i = 1; i < nums.length; i++) {
            sumLeft[i] = sumLeft[i - 1] + nums[i];
        }
        for (int i = l - 2; i >= 0; i--) {
            sumRight[i] = sumRight[i + 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (sumLeft[i] == sumRight[i]) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -1, -1, -1, -1, 0};
        System.out.println(pivotIndex(nums));
    }
}
