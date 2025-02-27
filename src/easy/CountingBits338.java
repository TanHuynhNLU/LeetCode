package easy;

import java.util.Arrays;

public class CountingBits338 {
    public static int[] countBits(int n) {
        int[] nums = new int[n+1];
        int po2=0;
        for (int i = 1; i <= n; i++) {
            if((i&(i-1))==0){
                nums[i]=1;
                po2=i;
            }
            else {
                nums[i]=nums[po2]+nums[i-po2];
            }
        }
        return nums;

//        Best solution
//        public int[] countBits(int n) {
//            int[] res = new int[n+1];
//            count(res,n,1,1);
//            return res;
//        }
//
//        public void count(int[] res, int n, int i, int j){
//            if(i > n) return;
//            res[i] = j;
//            count(res,n,(i<<1),j);
//            count(res,n,(i<<1)+1,j+1);
//        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
    }
}
