package easy;

public class FindTheArrayConcatenationValue2562 {
    public static long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int first = 0;
        int last = nums.length - 1;
        while (first <= last) {
            if (first == last) sum += nums[first];
            else {
                StringBuilder sb = new StringBuilder();
                sb.append(nums[first]);
                sb.append(nums[last]);
                sum += Integer.parseInt(sb.toString());
            }
            first++;
            last--;
        }
        return sum;
    }

    //    Best Solution
//    public long findTheArrayConcVal(int[] nums) {
//        long res = 0;
//        int x = 0;
//        int y = nums.length - 1;
//        while (x < y) {
//            if (nums[y] < 10) {
//                res += nums[y] + 10 * nums[x];
//            } else if (nums[y] < 100) {
//                res += nums[y] + 100 * nums[x];
//            } else if (nums[y] < 1000) {
//                res += nums[y] + 1000 * nums[x];
//            } else if (nums[y] < 10000) {
//                res += nums[y] + 10000 * nums[x];
//            } else {
//                res += 10000 + 100000 * nums[x];
//            }
//            x++;
//            y--;
//        }
//        if (x == y) {
//            res += nums[x];
//        }
//        return res;
//    }

    public static void main(String[] args) {
        findTheArrayConcVal(new int[]{7, 52, 2, 4});
    }
}
