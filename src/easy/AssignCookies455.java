package easy;

import java.util.Arrays;

public class AssignCookies455 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int size = 0;
        for (int i = 0; i < g.length; i++) {
            if (count>=s.length) return size;
            while (count<s.length){
                if(g[i]<=s[count++]){
                    size++;
                    break;
                }
            }

        }
        return size;
    }
//    Best solution
//private void swap(int[] arr, int i, int j) {
//    int temp = arr[i];
//    arr[i] = arr[j];
//    arr[j] = temp;
//}
//
//    private int partition(int[] arr, int low, int high) {
//        int pivot = arr[high];
//        int i = (low - 1);
//
//        for (int j = low; j <= high - 1; j++) {
//            if (arr[j] < pivot) {
//                i++;
//                swap(arr, i, j);
//            }
//        }
//        swap(arr, i + 1, high);
//        return (i + 1);
//    }
//
//    private void quickSort(int[] arr, int low, int high) {
//        if (low < high) {
//            int pi = partition(arr, low, high);
//            quickSort(arr, low, pi - 1);
//            quickSort(arr, pi + 1, high);
//        }
//    }
//
//    private void quickSort(int[] arr) {
//        if(arr.length == 0){
//            return;
//        }
//        int pi = partition(arr, 0, arr.length-1);
//        quickSort(arr, 0, pi - 1);
//        quickSort(arr, pi + 1, arr.length-1);
//    }
//    public int findContentChildren(int[] g, int[] s) {
//        quickSort(g);
//        quickSort(s);
//
//        int p = 0;
//        for(int i = 0; i < s.length && p < g.length; i++){
//            if(g[p] <= s[i]){
//                p++;
//            }
//        }
//        return p;


    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        System.out.println(findContentChildren(g,s));
    }
}
