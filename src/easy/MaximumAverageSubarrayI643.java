package easy;

public class MaximumAverageSubarrayI643 {
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max = 0;
        boolean isFirst = true;
        for (int i = 0; i <= nums.length-k; i++) {
            if(isFirst){
                for (int j = 0; j < k; j++) {
                    sum+=nums[i+j];
                }
                isFirst=false;
                max=sum;
            }

            else {
                    sum-=nums[i-1];
                    sum+=nums[i+k-1];
                    max=Math.max(max,sum);
                }
            }
        return max/k;
//        int sum = 0 ;
//        int ans = 0;
//
//        for(int i = 0; i < k ; i++){
//            sum += nums[i];
//        }
//
//        ans = sum;
//
//        for(int i = k ; i < nums.length; i++){
//            sum += nums[i] - nums[i - k];
//            ans = Math.max(ans,sum);
//        }
//
//        return (double)ans / k;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,3,3};

        System.out.println(findMaxAverage(nums,4));
    }
}
