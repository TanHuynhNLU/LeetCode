package medium;

public class ArithmeticSlices413 {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;
        int res = 0;
        int l = 2;
        int diff = nums[1] - nums[0];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == diff) {
                l++;
            } else {
                if (l >= 3) res += helper(l);
                diff = nums[i] - nums[i - 1];
                l = 2;
            }
        }
        if (l >= 3) res += helper(l);
        return res;
    }

    public int helper(int l) {
        int num = l - 2;
        return (int) ((num + 1) * ((double)num / 2));
    }

    // Another Approach
//    public int numberOfArithmeticSlices(int[] nums) {
//        int sum=0; int cur=0;
//        for(int i=2; i<nums.length; i++){
//            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
//                cur+=1;
//                sum+=cur;
//
//            }
//            else{
//                cur=0;
//            }
//        }
//        return sum;
//    }
}
