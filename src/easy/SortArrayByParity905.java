package easy;

public class SortArrayByParity905 {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length;
        while (left<right){
            if(nums[left]%2==0){
                left++;
                continue;
            }
            if(nums[right]%2!=0){
                right--;
                continue;
            }
            int tmp = nums[left];
            nums[left]=nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
        return nums;
//        Best solution
//        int pos = 0;
//
//        for(int i=0,j=0; j<nums.length; j++)
//        {
//            if(nums[j]%2 == 0)
//            {
//                int temp = nums[i];
//                nums[i++] = nums[j];
//                nums[j] = temp;
//            }
//        }
//
//        return nums;
    }
}
