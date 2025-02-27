package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEvenAndOddIndiesIndependently2164 {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> listOdd = new ArrayList<>();
        List<Integer> listEven = new ArrayList<>();

        for (int i = 1; i < nums.length; i+=2) {
            listOdd.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i+=2) {
            listEven.add(nums[i]);
        }
        listOdd.sort(Collections.reverseOrder());
        Collections.sort(listEven);
        int k = 0;
        for (int i = 1; i < nums.length; i+=2) {
            nums[i] = listOdd.get(k++);
        }
        k = 0;
        for (int i = 0; i < nums.length; i+=2) {
            nums[i] = listEven.get(k++);
        }
        return nums;
    }
//    Best solution
//public int[] sortEvenOdd(int[] nums) {
//    evenOddSort(nums, 0);
//    evenOddSort(nums, 1);
//
//    return nums;
//
//}
//
//    public static void evenOddSort(int[] nums, int idx) {
//        int index = -1;
//        int temp = 0;
//        for (int i = idx; i < nums.length; i += 2) {
//            index = i;
//            if (idx == 0) {
//                for (int j = i; j < nums.length; j += 2) {
//                    if (nums[index] > nums[j])
//                        index = j;
//                }
//            } else {
//                for (int j = i; j < nums.length; j += 2) {
//                    if (nums[index] < nums[j]) index = j;
//
//                }
//            }
//            temp = nums[index];
//            nums[index] = nums[i];
//            nums[i] = temp;
//        }
//    }
}
