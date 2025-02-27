package easy;

public class CountPairsThatFormACompleteDayI3184 {
    public static int countCompleteDayPairs(int[] hours) {
        int res = 0;
        int[] counts = new int[25];
        for (int num : hours) {
            int h = num % 24;
            if (counts[24 - h] != 0) {
                res += counts[24 - h];
            }
            if (h == 0) counts[24]++;
            else counts[h]++;

        }
        return res;
    }

    //    Best Solution
//    public int countCompleteDayPairs(int[] hours) {
//        int[] remainderCount = new int[24];
//        int pairCount = 0;
//
//        // Step 1: Count the remainders when divided by 24
//        for (int hour : hours) {
//            remainderCount[hour % 24]++;
//        }
//
//        // Step 2: Count pairs
//        // Case 1: Pair numbers where remainder is 0 (e.g., 24 + 24 = 48)
//        pairCount += remainderCount[0] * (remainderCount[0] - 1) / 2;
//
//        // Case 2: Pair numbers where remainder is 12 (e.g., 12 + 12 = 24)
//        pairCount += remainderCount[12] * (remainderCount[12] - 1) / 2;
//
//        // Case 3: Pair numbers where remainder is r and remainder is 24 - r (e.g., 1 + 23 = 24, 2 + 22 = 24, etc.)
//        for (int r = 1; r < 12; r++) {
//            pairCount += remainderCount[r] * remainderCount[24 - r];
//        }
//
//        return pairCount;
//    }

    public static void main(String[] args) {
        int[] hours = {11, 11, 24};
        countCompleteDayPairs(hours);
    }
}
