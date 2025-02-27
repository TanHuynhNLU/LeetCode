package easy;

import java.util.Arrays;

public class CheckIfArrayIsSortedAndRotated1752 {
    public static boolean check(int[] nums) {
        if(nums.length==1) return true;
        int[] tmp = nums.clone();
        Arrays.sort(tmp);
        int[] newArr = new int[nums.length * 2];
        System.arraycopy(tmp, 0, newArr, 0, tmp.length);
        System.arraycopy(tmp, 0, newArr, nums.length, tmp.length);
        for (int i = 0; i <= newArr.length/2; i++) {
            if(newArr[i] == nums[0]){
                boolean flag = true;
                for (int j = 1, k=i+1; j < nums.length; j++,k++) {
                    if(newArr[k] != nums[j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) return true;
            }

        }
        return false;
    }
    
//    Best solution
//public boolean check(int[] nums) {
//    int count = 0;
//
//    for(int i = 0; i < nums.length; i++){
//        if(nums[i] > nums[(i+1)% nums.length]){
//            count++;
//        }
//        if(count > 1)
//            return false;
//    }
//    return true;
//}
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        check(arr);
    }
}
