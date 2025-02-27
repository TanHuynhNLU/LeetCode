package easy;

public class GetMaximumInGeneratedArray1646 {
    public int getMaximumGenerated(int n) {
        int[] arr = new int[n+1];
        int max = 0;
        for (int i = 0; i <= n; i++) {
            if(i==0) {
                arr[0] = 0;
                continue;
            }
            if(i==1) {
                arr[1] = 1;
                max=1;
                continue;
            }
            if(i%2==0){
                int calc =
                arr[i] = arr[i/2];
                max = Math.max(max,arr[i]);
            }
            else {
                int calc = (i-1)/2;
                arr[i] = arr[calc]+ arr[calc+1];
                max = Math.max(max,arr[i]);
            }
        }
        return max;
    }
}
