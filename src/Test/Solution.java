package Test;

import java.util.Scanner;

public class Solution {
    public static int countNumDiff(int[] arr) {
        int res = 0;
        int[] counter = new int[1001];
        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] >= 1) res++;
        }
        return res;
    }

    public static int subReverseNum(int number) {
        int reverseNumber = 0;
        int n = number;
        while (n > 0) {
            reverseNumber = reverseNumber * 10 + n % 10;
            n /= 10;
        }
        return number - reverseNumber;
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int length = scanner.nextInt();
//        int[] arr = new int[length];
//        for (int i = 0; i < length; i++) {
//            arr[i] = scanner.nextInt();
//        }

//        ========================
//        int res1 = countNumDiff(arr);
        int res2 = subReverseNum(96);
        System.out.println(res2);
    }
}
