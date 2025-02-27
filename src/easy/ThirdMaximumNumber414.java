package easy;

import java.util.*;

public class ThirdMaximumNumber414 {
    public int thirdMax(int[] nums) {
       TreeSet<Integer> set = new TreeSet<>();
        for (int n : nums) {
            set.add(n);
        }
        TreeSet<Integer> reverse = (TreeSet<Integer>) set.descendingSet();
        if(set.size()<3) return reverse.first();
        int count = 0;
        for (int n : reverse){
            if(++count==3) return n;
        }
        return 0;
//        Best Solution
//        long max= Long.MIN_VALUE;
//        long secMax= Long.MIN_VALUE;
//        long thirdMax= Long.MIN_VALUE;
//        for(int n:nums){
//            if(n> max){
//                thirdMax= secMax;
//                secMax= max;
//                max= n;
//            }
//            else if( max >n && n>secMax){
//                thirdMax= secMax;
//                secMax=n;
//            }
//            else if(secMax>n && n>thirdMax){
//                thirdMax=n;
//
//            }
//        }
//        return thirdMax==Long.MIN_VALUE ?(int)max: (int)thirdMax;
    }
}
