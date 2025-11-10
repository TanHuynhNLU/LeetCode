package medium;

import java.util.Arrays;

public class NextGreaterElementII503 {
    public int[] nextGreaterElements(int[] nums) {
        int l = nums.length;
        int[] res = new int[l];
        Arrays.fill(res, -1);
        for (int i = 0; i < l; i++) {
            for (int j = (i + 1) % l; j != i; j = (j + 1) % l) {
                if (nums[j] > nums[i]) {
                    res[i] = nums[j];
                    break;
                }
            }
        }
        return res;
    }

    //Best Solution
//    public int[] nextGreaterElements(int[] nums) {
//        int n = nums.length;
//        int[] answer = new int[n];
//        Arrays.fill(answer, -1);
//        int[] stack = new int[n];
//        int top = -1;
//
//        for (int i = 0; i < 2 * n - 1; i++) {
//            while (top != -1 && nums[i % n] > nums[stack[top]]) {
//                int prev = stack[top--];
//                answer[prev] = nums[i % n];
//            }
//            if (i < n) stack[++top] = i % n;
//        }
//
//        return answer;
//    }
}
