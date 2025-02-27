package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy51018 {
    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            n = (n * 2 + nums[i])%5;
          res.add(n==0);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,0,0,1};
        System.out.println(prefixesDivBy5(nums));
    }
}
