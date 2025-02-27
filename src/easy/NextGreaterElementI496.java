package easy;

import java.util.Arrays;
import java.util.HashMap;

public class NextGreaterElementI496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        Arrays.fill(res,-1);
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i],i);
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = map.get(nums1[i]); j < nums2.length ; j++) {
                if(nums2[j]>nums1[i]) {
                    res[i]=nums2[j];
                    break;
                }
            }
        }
        return res;
//        Best Solution
//        int[] nextGreaterArr = new int[10000];
//        for (int j = nums2.length - 1; j >= 0; j--) {
//            if(j == nums2.length - 1) {
//                nextGreaterArr[nums2[j]] = -1;
//                continue;
//            }
//
//            int ele = nums2[j + 1];
//            while (nums2[j] > ele && ele != -1){
//                ele = nextGreaterArr[ele];
//            }
//            nextGreaterArr[nums2[j]] = ele;
//        }
//        int[] res = new int[nums1.length];
//        for (int j = 0; j < nums1.length; j++) {
//            res[j] = nextGreaterArr[nums1[j]];
//        }
//
//        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
}
