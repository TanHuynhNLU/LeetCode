package easy;

import java.util.HashMap;

public class PartitionArrayIntoThreePartsWithEqualSum1013 {
    public static boolean canThreePartsEqualSum(int[] arr) {
        long sumArr = 0;
        HashMap<Long, Integer> mapSumJ = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }
        long sumJ = 0;
        for (int i = arr.length - 1; i > 1; i--) {
            sumJ += arr[i];
            if (!mapSumJ.containsKey(sumJ)) {
                mapSumJ.put(sumJ, i);
            }
        }
        long sumI = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            sumI += arr[i];
            if (mapSumJ.containsKey(sumI)
                    && mapSumJ.get(sumI) > i + 1
                    && sumArr - 2 * sumI == sumI)
                return true;
        }
        return false;
//        Best solution
//        int sum1=arr[0],sum2=0,i;
//        for(i=1;i<arr.length;i++){
//            sum2+=arr[i];
//        }
//        for(i=1;i<arr.length;i++){
//            if(sum1 != sum2/2){
//                sum1+=arr[i];
//                sum2-=arr[i];
//            }
//            else if(sum1 == sum2/2 && sum2%2==0){
//                sum2=arr[i];
//                break;
//            }
//        }
//        for(i=i+1;i<arr.length;i++){
//            if(sum1 != sum2){
//                sum2+=arr[i];
//            }
//            else
//                return true;
//        }
//        return false;
//        Other Solution
//        int sum = Arrays.stream(A).sum(), part = 0, average = sum / 3, cnt = 0;
//        for (int a : A) {
//            part += a;
//            if (part == average) { // find the average: sum / 3
//                ++cnt; // find an average, increase the counter.
//                part = 0; // reset part.
//            }
//        }
//        return cnt >= 3 && sum % 3 == 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(canThreePartsEqualSum(arr));
    }
}
