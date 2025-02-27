package easy;

import java.util.HashMap;
import java.util.Map;

public class XofAKindInADeckOfCards914 {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            int value = map.getOrDefault(deck[i], 0);
            map.put(deck[i], value + 1);
        }
        int k = map.get(deck[0]);
        int tmp = 0;
        if (k <= 1) return false;
        for (int value : map.values()) {
         tmp = GCD(tmp,value);
         if(tmp<=1) return false;
        }
        return true;
    }

    public int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
//    Best solution
//public boolean hasGroupsSizeX(int[] deck) {
//
//    int MAX_VALUE = 1001;
//    int[] map = new int[MAX_VALUE];
//    int ans = 0;
//    int val = -1;
//
//    for(int num : deck) {
//        ++map[num];
//        if(val == -1) {
//            val = num;
//        }
//    }
//
//    ans = map[val];
//
//    for(int num : map) {
//        if(num != 0) {
//            ans = GCD(ans, num);
//        }
//    }
//
//    return ans > 1 ? true : false;
//}
//
//    public int GCD(int p, int q) {
//        if(p % q == 0) return q;
//        return GCD(q, p % q);
//    }
}
