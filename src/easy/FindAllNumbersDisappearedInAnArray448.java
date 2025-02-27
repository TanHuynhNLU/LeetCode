package easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] counters = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            counters[nums[i]]++;
        }
        for (int i = 1; i < counters.length ;i++) {
            if (counters[i]==0) result.add(i);
        }
        return result;
//        Best solution
//        int n = nums.length;
//        int[] count=new int[n];
//
//        for (int i = 0; i<n;i++) {
//            count[nums[i]-1] = -1;
//        }
//
//        List<Integer> list = new ArrayList<>(n);
//        for(int i = 0;i<n;i++){
//            if(count[i] != -1){
//                list.add(i+1);
//            }
//        }
//        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1};
        findDisappearedNumbers(arr);
    }
}
