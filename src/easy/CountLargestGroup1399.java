package easy;

import java.util.HashMap;
import java.util.Map;

public class CountLargestGroup1399 {
    public static int countLargestGroup(int n) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int sum = sumOfDigits(i);
            int value = map.getOrDefault(sum, 0);
            map.put(sum, value + 1);
            max = Math.max(max, value + 1);
        }
        int count = 0;
        for (int value : map.values()) {
            if (value == max) count++;
        }
        return count;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

//        Best solution
//public int countLargestGroup(int n) {
//
//    int[] freq = new int[38];
//    int max = 0;
//    int groups = 0;
//
//    for (int i = 0; i <= n; i += 10) {
//        int ds = digitSum(i);
//        freq[ds]++;
//        if (i+9 > n)
//            freq[digitSum(n+1)]--;
//        else
//            freq[ds+10]--;
//    }
//
//    // prefix sum
//    for (int i = 1; i < freq.length; i++)
//        freq[i] += freq[i-1];
//    freq[0] = 0;
//
//        /*
//        while (n > 0)
//            freq[digitSum(n--)]++;
//        */
//
//    for (int f: freq) {
//        if (f >= max) {
//            if (f > max)
//                groups = 0;
//            groups++;
//            max = f;
//        }
//    }
//
//    return groups;
//}
//    private int digitSum(int n) {
//        return (n == 0) ? 0 : n%10 + digitSum(n/10);
//    }

    public static void main(String[] args) {
        countLargestGroup(13);
    }
}
