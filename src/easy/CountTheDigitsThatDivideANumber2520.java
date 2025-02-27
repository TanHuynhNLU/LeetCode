package easy;

import java.util.HashSet;
import java.util.Set;

public class CountTheDigitsThatDivideANumber2520 {
    public int countDigits(int num) {
        int count = 0;
        int tmp = num;
        Set<Integer> set = new HashSet<>();
        while (tmp > 0) {
            int digit = tmp % 10;
            if(!set.contains(digit)){
                if(num % digit == 0) count++;
            }
            tmp /= 10;
        }
        return count;
    }
}
