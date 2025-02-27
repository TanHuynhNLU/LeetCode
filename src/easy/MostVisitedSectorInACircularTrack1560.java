package easy;

import java.util.ArrayList;
import java.util.List;

public class MostVisitedSectorInACircularTrack1560 {
    public static List<Integer> mostVisited(int n, int[] rounds) {
        int[] counts = new int[n+1];
        int max = 1;
        int countMax = 1;
        counts[rounds[0]]++;
        for (int i = 0; i < rounds.length-1 ; i++) {
            int counter=rounds[i];
            while(counter!=rounds[i+1]){
                counter = counter ==n?1:counter+1;
                counts[counter]++;
                if(counts[counter]==max) countMax++;
                else {
                    max = Math.max(counts[counter],max);
                    countMax=1;
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(counts[i]==max) {
                res.add(i);
                count++;
            }
            if(count==countMax) break;
        }
        return res;
//      Best solution
//        List<Integer> mostVisitedSectors = new ArrayList<>();
//        int start = rounds[0];
//        int end = rounds[rounds.length - 1];
//        if (end >= start) {
//            for (int i = start; i <= end; i++) {
//                mostVisitedSectors.add(i);
//            }
//        } else {
//            for (int i = 1; i <= end; i++) {
//                mostVisitedSectors.add(i);
//            }
//
//            for (int i = start; i <= n; i++) {
//                mostVisitedSectors.add(i);
//            }
//        }
//
//        return mostVisitedSectors;
    }

    public static void main(String[] args) {
        int[] test = {1,3,5,7};
        mostVisited(7,test);
    }
}
