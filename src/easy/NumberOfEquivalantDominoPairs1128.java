package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberOfEquivalantDominoPairs1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < dominoes.length; i++) {
            int key = dominoes[i][0] * 10 + dominoes[i][1];
            if (map.containsKey(dominoes[i][1] * 10 + dominoes[i][0])) {
                key = dominoes[i][1] * 10 + dominoes[i][0];
            }
            int value = map.getOrDefault(key, 0);
            map.put(key, value + 1);
        }
        int count =0;

        for (int value:map.values()){
            count+=value*(value-1)/2;
        }
        return count;
    }
//    Best solution
//     if (dominoes == null) return 0;
//
//    final int[][] counters = new int[9][9];
//        for (int[] domino : dominoes)
//    counters[domino[0] - 1][domino[1] - 1]++;
//
//    int pairs = 0;
//        for (int i = 0; i < 9; i++) {
//        for (int j = i; j < 9; j++) {
//            int count = counters[i][j];
//            if (i != j) count += counters[j][i];
//            pairs += (count*(count-1))/2;
//        }
//    }
//
//        return pairs;
}
