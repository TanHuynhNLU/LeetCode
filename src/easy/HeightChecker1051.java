package easy;

import java.util.Arrays;

public class HeightChecker1051 {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] clone = heights.clone();
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            if (clone[i] != heights[i]) count++;
        }
        return count;
//        Best solution
//        int[] heightCount = new int[101];
//        for(int height : heights )
//        {
//            heightCount[height]++;
//        }
//        int mismatch = 0;
//        int hit = 1;
//        for(int i = 0; i<heights.length; i++)
//        {
//            while(heightCount[hit] == 0)
//            {
//                hit++;
//            }
//            if(heights[i] != hit)
//            {
//                mismatch++;
//            }
//            heightCount[hit]--;
//        }
//        return mismatch;
    }
}
