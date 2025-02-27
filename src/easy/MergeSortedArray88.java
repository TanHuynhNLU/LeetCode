package easy;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1 = 0;
        int i2 = 0;
        int i = 0;
        int[] result = new int[m+n];
        while (i < m + n) {
            if (i1 < m && i2 < n) {
                if(nums1[i1]<nums2[i2]){
                    result[i++] = nums1[i1++];
                }else {
                    result[i++] = nums2[i2++];
                }
            } else if (i1<m) {
                result[i++] = nums1[i1++];
            } else if (i2<n) {
                result[i++] = nums2[i2++];
            }
        }
        System.arraycopy(result,0,nums1,0,m+n);
        //Another Solution
//        int i = m - 1;
//        int j = n - 1;
//        int k = m + n - 1;
//
//        while (j >= 0) {
//            if (i >= 0 && nums1[i] > nums2[j]) {
//                nums1[k--] = nums1[i--];
//            } else {
//                nums1[k--] = nums2[j--];
//            }
//        }
    }

    public static void main(String[] args) {
        int[] nums1  ={1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));

    }
}
