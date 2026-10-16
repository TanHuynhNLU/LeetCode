package medium;

public class SubarrayProductLessThanK713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0;
        int l = nums.length;

        for (int i = 0; i <l; i++) {
            long p = nums[i];
            if(p<k){
                res++;
                for (int j = i - 1; j >= 0; j--) {
                    p *= nums[j];
                    if (p < k) res++;
                    else break;
                }
            }
        }
        return res;
    }
    // Best solution
//    static
//    {
//        for (int i = 0; i < 800; ++i)
//        {
//            numSubarrayProductLessThanK(new int[0],0);
//        }
//    }
//    public static int numSubarrayProductLessThanK(int[] nums, int k) {
//        if(k<=1)
//        {
//            return 0;
//        }
//        int i = 0;
//        int j = 0;
//        int prod = 1;
//        int res = 0;
//        while(j<nums.length)
//        {
//
//            prod = prod * nums[j];
//            while(prod>=k)
//            {
//                prod = prod / nums[i];
//                i++;
//            }
//            res += (j-i)+1;
//            j++;
//        }
//        return res;
//    }
}
