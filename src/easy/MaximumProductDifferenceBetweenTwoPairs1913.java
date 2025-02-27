package easy;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs1913 {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1] * nums[nums.length-2])-(nums[0] * nums[1]);
    }
//    Best Solution
//public int maxProductDifference(int[] nums) {
//    int p1[] = get(nums);
//    int p2[] = get(nums);
//    return p1[1]*p2[1] - p1[0]*p2[0];
//}
//    public int[] get(int a[]){
//
//        int min = Integer.MAX_VALUE;
//        int max = 0;
//        int mi=0,mai=0;
//        for(int i=0;i<a.length;i++)
//        {
//            if(a[i]!=0)
//            {
//                if(a[i]<min)
//                {
//                    min=a[i];
//                    mi=i;
//                }
//                if(a[i]>max)
//                {
//                    max=a[i];
//                    mai=i;
//                }
//            }
//        }
//        a[mi]=0;
//        a[mai]=0;
//        return new int[]{min,max};
//    }
}
