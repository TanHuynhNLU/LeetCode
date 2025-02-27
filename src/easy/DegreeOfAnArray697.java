package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DegreeOfAnArray697 {
    public static int findShortestSubArray(int[] nums) {
        int[] lengths = new int[50000];
        int[] indexes = new int[50000];
        int[] counts = new int[50000];
        Arrays.fill(indexes,-1);
        Arrays.fill(lengths,1);
        List<Integer> maxFreq = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (indexes[nums[i]] == -1) indexes[nums[i]] = i;
            else
                lengths[nums[i]] = i - indexes[nums[i]] + 1;
            counts[nums[i]]++;
            if (counts[nums[i]] > max) {
                maxFreq.clear();
                maxFreq.add(nums[i]);
                max = counts[nums[i]];
            }
            else if (counts[nums[i]] == max) {
                maxFreq.add(nums[i]);
            }
        }

        int minL = Integer.MAX_VALUE;
        for(int num:maxFreq){
            minL = Math.min(minL,lengths[num]);
        }
        return minL;
    }
//    Best solution
//public int findShortestSubArray(int[] nums) {
//    int max = -1;
//    for (int i=0; i<nums.length;i++)
//        if (nums[i] > max) max = nums[i];
//
//    MinMax [] minmax = new MinMax[max + 1];
//    int maxfreq = 0;
//    for (int i=0; i<nums.length;i++) {
//        if (minmax[nums[i]] == null)
//            minmax[nums[i]] = new MinMax(i);
//        minmax[nums[i]].max = i;
//        minmax[nums[i]].count++;
//
//        if (minmax[nums[i]].count > maxfreq)
//            maxfreq = minmax[nums[i]].count;
//    }
//    int minarray = Integer.MAX_VALUE;
//    for (int i=0; i<minmax.length;i++) {
//        if (minmax[i] != null && minmax[i].count == maxfreq)
//            minarray = Math.min(minarray, minmax[i].max - minmax[i].min + 1);
//    }
//    return minarray;
//}
//    private class MinMax {
//        int count = 0;
//        int min = -1;
//        int max = -1;
//
//        public MinMax(int i) {
//            min = i;
//            max = i;
//        }
//    }

    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(findShortestSubArray(nums));
    }
}
