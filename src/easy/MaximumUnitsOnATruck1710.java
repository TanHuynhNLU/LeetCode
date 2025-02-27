package easy;

import java.util.*;

public class MaximumUnitsOnATruck1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int sum = 0;
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int[] box : boxTypes) {
            map.put(box[1], map.getOrDefault(box[1], 0) + box[0]);
        }
        int num = truckSize;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < num) {
                sum += entry.getKey() * entry.getValue();
                num -= entry.getValue();
            } else {
                sum += entry.getKey() * num;
                return sum;
            }
        }
        return sum;
    }
//    Best solution
//    int MAX_UNITS = 1001;
//    int[] buckets = new int[MAX_UNITS];
//    for (int i = 0; i < MAX_UNITS; i++) {
//        buckets[i] = -1;
//    }
//
//    int spaceRemainingBoxes = truckSize;
//    int unitsLoaded = 0;
//
//    for (int i = 0; i < boxTypes.length; i++) {
//        if (buckets[boxTypes[i][1]] == -1) {
//            buckets[boxTypes[i][1]] = boxTypes[i][0];
//        } else {
//            buckets[boxTypes[i][1]] += boxTypes[i][0];
//        }
//    }
//
//    for (int i = MAX_UNITS - 1; i >= 0; i--) {
//        if (buckets[i] == -1) continue;
//
//        if (buckets[i] > spaceRemainingBoxes) {
//            unitsLoaded += spaceRemainingBoxes * i;
//            return unitsLoaded;
//        } else {
//            unitsLoaded += buckets[i] * i;
//            spaceRemainingBoxes -= buckets[i];
//        }
//    }
//
//    return unitsLoaded;

    //    Popular solution
//    public int maximumUnits(int[][] boxTypes, int truckSize) {
//        Arrays.sort(boxTypes, (int[] a, int[] b) -> Integer.compare(b[1], a[1]));
//
//        int totalUnits = 0;
//        for (int i = 0; i < boxTypes.length; i++) {
//            int[] boxType = boxTypes[i];
//            int currentBoxCount = Math.min(boxType[0], truckSize);
//            totalUnits = totalUnits + (currentBoxCount * boxType[1]);
//            truckSize = truckSize - currentBoxCount;
//            if (truckSize <= 0) {
//                break;
//            }
//        }
//
//        return totalUnits;
//    }
}
