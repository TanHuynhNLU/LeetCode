package easy;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElement1619 {
    public double trimMean(int[] arr) {
        int sum = 0;
        int count = arr.length/20;
        Arrays.sort(arr);
        for (int i = count; i < arr.length-count; i++) {
            sum+= arr[i];
        }
        return (double)sum/(arr.length-count*2);
    }
}
