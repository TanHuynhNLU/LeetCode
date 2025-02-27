package easy;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target){
        int insertedIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target) return i;
            if(target>nums[i]) insertedIndex++;
            if(target<nums[i]) break;

        }
        return insertedIndex;

        //fastest solution
//        int start = 0;
//        int end = nums.length-1;
//
//        while (start <= end) {
//            int mid = start + (end-start)/2;
//            if (nums[mid] == target) return mid;
//            else if (nums[mid] > target) end = mid-1;
//            else start = mid+1;
//        }
//
//        return start;
    }

    public static void main(String[] args) {
        int[] nums ={1,3,5,6};
        System.out.println(searchInsert(nums,7));
    }
}
