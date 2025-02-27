package easy;

import java.util.HashMap;

public class MinimumCommonValue2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j =0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        while(i < n1 && j < n2){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }
            if(nums1[i] < nums2[j]){
                i++;
                continue;
            }
            if(nums1[i] > nums2[j]){
                j++;
            }
        }
        return -1;
    }
}
