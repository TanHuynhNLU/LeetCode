package easy;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber136 {
    public static int singleNumber(int[] nums) {
        Set<Integer> singleNum = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(singleNum.contains(nums[i])) singleNum.remove(nums[i]);
            else singleNum.add(nums[i]);
        }
        return (int) singleNum.toArray()[0];

        //BestSolution
//        int xor = 0;
//        for(int i = 0; i<nums.length; i++){
//            xor = xor ^ nums[i];
//        }
//        return xor;
    }

    public static void main(String[] args) {
        int[] array = {4,1,2,1,2};
        System.out.println(singleNumber(array));
    }
}
