package easy;

import java.util.HashSet;
import java.util.Set;

public class BestPokerHand2347 {
    public String bestHand(int[] ranks, char[] suits) {
        char prev = suits[0];
        int count = 1;
        for (int i = 1; i < suits.length; i++) {
            if (suits[i] == prev) count++;
        }
        if (count == 5) return "Flush";
        int[] counts = new int[14];
        int max = 0;
        for(int rank: ranks){
            counts[rank]++;
            max = Math.max(max, counts[rank]);
        }
        if(max>=3) return "Three of a Kind";
        if(max==2) return "Pair";
        return "High Card";
    }
}
