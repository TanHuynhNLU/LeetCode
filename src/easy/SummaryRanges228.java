package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges228 {
    public static List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        int prev = nums[0];
        int first = nums[0];
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev + 1) {
                last = nums[i];
            } else {
                if (first != last)
                    result.add(first + "->" + last);
                else result.add("" + first);
                first = last = nums[i];
            }
            prev = nums[i];
        }
        if (first != last)
            result.add(first + "->" + last);
        else result.add("" + first);
        return result;
//        Best solution
//        int len = nums.length;
//        if (len == 0) {
//            return Collections.EMPTY_LIST;
//        }
//        List<String> res = new ArrayList<>();
//        int count = 0;
//        StringBuilder sb = new StringBuilder(25);
//        while (count < len) {
//            sb.setLength(0);
//            int val = nums[count];
//            if (++count < len && nums[count] - 1 == val) {
//                sb.append(val);
//                sb.append("->");
//                do {
//                    val = nums[count];
//                } while (++count < len && nums[count] - 1 == val);
//                sb.append(val);
//            } else {
//                sb.append(val);
//            }
//            res.add(sb.toString());
//        }
//        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> result = summaryRanges(nums);
        System.out.println(result.toString());
    }
}
