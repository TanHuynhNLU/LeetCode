package easy;

public class CheckIfTheNumberIsFascinating2729 {
    public static boolean isFascinating(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(n));
        sb.append(String.valueOf(n * 2));
        sb.append(String.valueOf(n * 3));
        char[] chars = sb.toString().toCharArray();
        int[] nums = new int[10];
        for (int i = 0; i < chars.length; i++) {
            nums[chars[i] - '0']++;
        }
        for (int i = 1; i < 10; i++) {
            if (nums[i] != 1) return false;
        }
        return true;
    }

    //    Best Solution
//    public boolean isFascinating(int n) {
//
//        return n == 192 || n == 219 || n == 273 || n == 327;
//    }

    public static void main(String[] args) {
        isFascinating(783);
    }
}
