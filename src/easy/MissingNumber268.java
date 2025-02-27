package easy;

public class MissingNumber268 {
    public static int missingNumber(int[] nums) {
        int l = nums.length;
        double sum = ((double)l/2)*(l+1);
        for (int n:nums) {
            sum-=n;
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
}
