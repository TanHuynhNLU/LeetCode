package easy;

import java.util.HashSet;

public class SumMultiples2652 {
    public int sumOfMultiples(int n) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        int tmp = n;
        while(tmp>=3){
            if(tmp%3==0){
                while(tmp>=3){
                    set.add(tmp);
                    tmp-=3;
                }
                break;
            }
            tmp--;
        }
        tmp = n;
        while(tmp>=5){
            if(tmp%5==0){
                while(tmp>=5){
                    set.add(tmp);
                    tmp-=5;
                }
                break;
            }
            tmp--;
        }
        tmp = n;
        while(tmp>=7){
            if(tmp%7==0){
                while(tmp>=7){
                    set.add(tmp);
                    tmp-=7;
                }
                break;
            }
            tmp--;
        }
        for(Integer i : set){
            sum += i;
        }
        return sum;
    }
}
