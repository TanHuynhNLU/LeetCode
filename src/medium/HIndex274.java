package medium;

import java.util.Arrays;

public class HIndex274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int count = 0;
        int max = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            count++;
            max = Math.max(max, count);
            if (count > citations[i]) {
                count = 0;
            }
        }
        return max;
    }

    // Best Solution
//    public int hIndex(int[] citations) {
//        int n = citations.length;
//        int[] arr = new int[n + 1];
//        for (int c : citations) {
//            if (c > n) {
//                arr[n]++;
//            } else {
//                arr[c]++;
//            }
//        }
//        int count = 0;
//        for (int i = n; i >= 0; i--) {
//            count += arr[i];
//            if (count >= i) {
//                return i;
//            }
//        }
//        return 0;
//    }
}
