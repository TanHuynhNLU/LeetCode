package easy;

import java.util.ArrayList;
import java.util.List;

public class SeparateTheDigitsInAnArray2553 {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num >= 10) {
                String s = String.valueOf(num);
                for (char c : s.toCharArray()) {
                    list.add(Character.getNumericValue(c));
                }
            } else {
                list.add(num);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    //    Best Solution
//    public int[] separateDigits(int[] nums) {
//        int n = 0;
//        for (int i : nums) {
//            if (i < 10) n += 1;
//            else if (i < 100) n += 2;
//            else if (i < 1000) n += 3;
//            else if (i < 10000) n += 4;
//            else if (i < 100000) n += 5;
//            else n += 6;
//        }
//        int[] dig = new int[n];
//        int k = n - 1;
//
//        for (int i = nums.length - 1; i >= 0; i--) {
//            n = nums[i];
//            while (n > 0) {
//                dig[k--] = n % 10;
//                n /= 10;
//            }
//        }
//        return dig;
//    }
}
