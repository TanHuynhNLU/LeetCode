package easy;

public class CheckIfArrayIsGood2784 {
    public static boolean isGood(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] counts = new int[max + 1];
        for (int num : nums) {
            counts[num]++;
        }
        if (counts[max] != 2) return false;
        for (int i = 1; i < counts.length-1; i++) {
            if (counts[i] != 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        isGood(new int[]{1, 3, 3, 2});
    }
}
