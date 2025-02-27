package easy;

public class SplitTheArray3046 {
    public boolean isPossibleToSplit(int[] nums) {
        int[] counter = new int[101];
        for(int num : nums){
            counter[num]++;
        }
        for(int num : nums){
            if(counter[num] >2) return false;
        }
        return true;
    }
//    public static boolean isPossibleToSplit(int[] nums) {
//        int max =nums[0];
//        for (int num : nums) {
//            if (num > max) { max = num; }
//        }
//
//        int[] t = new int[max+1];
//        for (int c : nums) {
//            t[c]++;
//            if (t[c] > 2)  return false;
//        }
//        return true;
//    }
}
