package easy;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1]-arr[0];
        for (int i = 2; i < arr.length; i++) {
            if(arr[i]-arr[i-1]!=d) return false;
        }
        return true;
//        Best solution
//        int min = arr[0];
//        int max = arr[0];
//
//        for (int elem: arr) {
//            if (elem < min) {
//                min = elem;
//            }
//            else if (max < elem) {
//                max = elem;
//            }
//        }
//
//        if ((max - min)%(arr.length-1)!=0) {
//            return false;
//        }
//
//        int diff = (max - min)/(arr.length-1);
//        int[] visited = new int[arr.length];
//
//        for (int elem: arr) {
//            if (diff == 0){
//                if (elem != min) {
//                    return false;
//                }
//            }
//            else if ((elem - min) % diff !=0) {
//                return false;
//            }
//            if (diff!=0) {
//                int index = (elem - min) / diff;
//                if (visited[index] == 1) {
//                    return false;
//                }
//                visited[index] = 1;
//            }
//        }
//
//        return true;
    }
}
