package easy;

import java.util.ArrayList;
import java.util.List;

public class Finding3DigitEvenNumber2094 {
    public int[] findEvenNumbers(int[] digits) {
        int[] counts = new int[10];
        List<Integer> list  =new ArrayList<>();
        for (int digit : digits) {
            counts[digit]++;
        }
        for (int i = 100; i < 999; i+=2) {
            if(check(counts.clone(),i)) list.add(i);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    public boolean check(int[] nums, int target) {
        while (target!=0){
            int n = target%10;
            if(nums[n]>0) nums[n]--;
            else return false;
            target/=10;
        }
        return true;
    }
}
