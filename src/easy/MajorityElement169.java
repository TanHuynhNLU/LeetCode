package easy;

import java.util.HashMap;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        if (nums.length==1) return nums[0];
        int n = nums.length;
        HashMap<Integer,Integer> mapMajority = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(mapMajority.containsKey(nums[i])){
                int value = mapMajority.get(nums[i]);
                if (value>=n/2) return nums[i];
                mapMajority.put(nums[i],value+1);
            }else {
                mapMajority.put(nums[i],1);
            }
        }
        return 0;
//        Boyer-Moore Majority Voting Algorithm
//        int count = 0;
//        int candidate = 0;
//
//        for (int num : nums) {
//            if (count == 0) {
//                candidate = num;
//            }
//
//            if (num == candidate) {
//                count++;
//            } else {
//                count--;
//            }
//        }
//
//        return candidate;
    }
}
