package leetcode;

import java.util.Arrays;

public class FindMedianSortedArrays4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] nums = new int[n];

        int i = 0;
        int i1 = 0;
        int i2 = 0;
        while (i < n) {
            if (i1 < n1 && i2 < n2) {
                if (nums1[i1] < nums2[i2]) {
                    nums[i] = nums1[i1];
                    i1++;
                } else {
                    nums[i] = nums2[i2];
                    i2++;
                }
            }else {
                if(i1<n1){
                    nums[i] = nums1[i1];
                    i1++;
                }
                if (i2<n2){
                    nums[i] = nums2[i2];
                    i2++;
                }
            }
            i++;
        }
        if(n%2==0) return (double)(nums[n/2-1]+nums[n/2])/2;
        else return (double)nums[n/2];
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        int[] nums2 = {2, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
