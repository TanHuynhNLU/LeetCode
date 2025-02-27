package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setNumbers = new HashSet<>();
        for (int number:nums) {
            if(setNumbers.contains(number)) return true;
            setNumbers.add(number);
        }
        return false;
    }
    //Best solution
//    int num = nums[0];
//    int leng = nums.length;
//        if (leng == 2 && (num == -24500 || num == 237384))
//            return true;
//        if (num == 0 && nums[leng - 1] == 99999)
//            return false;
//        if (num == 237384 || num == -24500 || num == 2048 || num == 30720)
//            return false;
//    byte[] array = new byte[2048];
//        for (int i : nums) {
//        if (array[i & 2047]++ == 1)
//            return true;
//    }
//        return false;
}
