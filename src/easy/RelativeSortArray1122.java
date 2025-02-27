package easy;

import java.util.*;

public class RelativeSortArray1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int[] numbers = new int[1001];

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            if(!set.contains(arr1[i])) list.add(arr1[i]);
            else numbers[arr1[i]]++;
        }

        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (numbers[arr2[i]]!=0){
                res[index++] = arr2[i];
                numbers[arr2[i]]--;
            }
        }
        Collections.sort(list);
        for (int n:list){
            res[index++]=n;
        }
        return res;
//        Best solution
//        int[] count = new int[1001];
//        for (int num : nums) {
//            count[num]++;
//        }
//
//        int numsIndex = 0;
//        for (int num : order) {
//            while (count[num] > 0) {
//                nums[numsIndex++] = num;
//                count[num]--;
//            }
//        }
//
//        for (int i = 0; i < count.length; i++) {
//            while (count[i] > 0) {
//                nums[numsIndex++] = i;
//                count[i]--;
//            }
//        }
//
//        return nums;
    }
}
