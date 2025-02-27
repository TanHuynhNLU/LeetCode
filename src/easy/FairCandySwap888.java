package easy;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;
        Set<Integer> bobCandies = new HashSet<>();
        int[] res = new int[2];

        for (int i = 0; i < aliceSizes.length; i++) {
            sumAlice += aliceSizes[i];
        }

        for (int i = 0; i < bobSizes.length; i++) {
            sumBob += bobSizes[i];
            bobCandies.add(bobSizes[i]);
        }

        int average = (sumAlice+sumBob)/2;

        for (int i = 0; i <aliceSizes.length ; i++) {
            int candy = aliceSizes[i] + average - sumAlice;
            if(bobCandies.contains(candy)){
                res[0] = aliceSizes[i];
                res[1] = candy;
                return res;
            }
        }
        return res;
    }

//    Best solution
//    int aum = 0;
//    boolean[] inAlice = new boolean[100001];
//        for (int i = 0; i < aliceSizes.length; i++) {
//        aum += aliceSizes[i];
//        inAlice[aliceSizes[i]] = true;
//    }
//    int bum = 0;
//        for (int i = 0; i < bobSizes.length; i++) {
//        bum += bobSizes[i];
//    }
//    int diff = aum - bum;
//    int[] ans = new int[2];
//        for (int i = 0; i < bobSizes.length; i++) {
//        int target = bobSizes[i] + diff / 2;
//        if (target > 0 && target < 100001) {
//            if (inAlice[target]) {
//                ans = new int[] {target, bobSizes[i]};
//                return ans;
//            }
//        }
//    }
//        return ans;
}
