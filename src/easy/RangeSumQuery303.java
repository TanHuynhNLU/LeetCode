package easy;

public class RangeSumQuery303 {
    private int[] nums;

    public RangeSumQuery303(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (; left <= right; left++) {
            sum += nums[left];
        }
        return sum;
    }

//    Best Solution Dynamic Programing
//    int psum[];
//    public NumArray(int[] nums) {
//        psum=new int[nums.length+1];
//        psum[0]=0;
//        for (int i=1;i<=nums.length;i++){
//            psum[i]=psum[i-1]+nums[i-1];
//        }
//    }
//
//    public int sumRange(int lft, int rgt) {
//        return psum[rgt+1]-psum[lft];
//
//    }
}
