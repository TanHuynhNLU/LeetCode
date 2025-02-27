package easy;

import java.util.HashSet;

public class IntersectionOfTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) result.add(nums2[i]);
        }
        int[] array = new int[result.size()];
        int j = 0;
       for(Integer i : result){
           array[j++]=i;
       }
        return array;

//       Best Solution
//        boolean[] count = new boolean[1001];
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < nums1.length; i++) {
//            count[nums1[i]] = true;
//        }
//
//        for (int i = 0; i < nums2.length; i++) {
//            if (count[nums2[i]] == true) {
//                list.add(nums2[i]);
//                count[nums2[i]] = false;
//            }
//        }
//
//        int[] ans = new int[list.size()];
//        for (int i = 0; i < ans.length; i++) {
//            ans[i] = list.get(i);
//        }
//
//        return ans;
    }
}
