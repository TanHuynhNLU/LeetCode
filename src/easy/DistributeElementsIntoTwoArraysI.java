package easy;

public class DistributeElementsIntoTwoArraysI {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int[] res = new int[nums.length];
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int last1 = 0;
        int last2 = 0;
        for (int i = 2; i < nums.length; i++) {
            if(arr1[last1] > arr2[last2]) {
                last1++;
                arr1[last1] = nums[i];
            }else {
                last2++;
                arr2[last2] = nums[i];
            }
        }
        int i =0;
        for (int j = 0; j < arr1.length; j++) {
            if(arr1[j]==0) break;
            res[i++] = arr1[j];
        }
        for (int j = 0; j < arr2.length; j++) {
            if(arr2[j]==0) break;
            res[i++] = arr2[j];
        }
        return res;
    }
}
