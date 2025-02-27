package easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrayII350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] flag = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            flag[nums1[i]]++;
        }
        List<Integer> listNums = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(flag[nums2[i]]>0) {
                listNums.add(nums2[i]);
                flag[nums2[i]]--;
            }
        }
        int[] result = new int[listNums.size()];
        for (int i = 0; i < result.length; i++) {
            result[i]=listNums.get(i);
        }
        return result;
    }

//    Best solution
//int temp[]=nums1.length>nums2.length?nums1:nums2;
//    int check[]=new int[1001];
//    int final_arr[]=new int[1001];
//
//        for(int x:temp)
//    {
//        check[x]++;
//    }
//    int temp1[]=temp.length==nums2.length?nums1:nums2;
//    int count=0;
//
//        for(int i:temp1)
//    {
//        if(check[i]>0)
//        {
//            final_arr[count++]=i;
//            check[i]--;
//
//        }
//    }
//
//        return Arrays.copyOfRange(final_arr,0,count);
}
