package easy;

public class MinimumCostToMoveChipsToTheSamePosition1217 {
    public int minCostToMoveChips(int[] position) {
        int countOdd = 0;
        int countEven = 0;
        for (int p : position) {
            if (p % 2 == 0) countEven++;
            else countOdd++;
        }
        return Math.min(countEven, countOdd);
    }
}
