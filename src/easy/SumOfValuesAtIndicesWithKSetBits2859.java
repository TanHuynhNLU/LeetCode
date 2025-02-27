package easy;

import java.util.List;

public class SumOfValuesAtIndicesWithKSetBits2859 {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if(countBits(i)==k) sum+=nums.get(i);
        }
        return sum;
    }

    public int countBits(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num >>>= 1;
        }
        return count;
    }
}
