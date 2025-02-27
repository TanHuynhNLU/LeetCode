package easy;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i+1]);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);
        }
        return res;
//        Best Solution
//        int arrSize = 0;
//        for (int i = 0; i < nums.length; i += 2) {
//            arrSize += nums[i];
//        }
//
//        int[] result = new int[arrSize];
//
//        int startIdx = 0;
//        for (int i = 0; i < nums.length; i += 2) {
//            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
//            startIdx += nums[i];
//        }
//        return result;
    }
}
