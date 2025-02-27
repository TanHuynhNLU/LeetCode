package easy;

import java.util.HashSet;

public class DistributeCandies575 {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> types = new HashSet<>();
        for (int i: candyType) {
            types.add(i);
            if(types.size()>=candyType.length/2) return candyType.length/2;

        }
        return types.size();
//        Best solution
//        boolean[] ate = new boolean[200001];
//        int count = 0;
//        int max = candyType.length/2;
//        for (int type : candyType) {
//            if (count == max) break;
//            if (ate[type+100000]) continue;
//            ate[type+100000] = true;
//            count++;
//        }
//        return count;
    }
}
