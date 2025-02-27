package easy;

public class CountOddNumbersInAnIntervalRange1523 {
    public int countOdds(int low, int high) {
        int res = 0;
        if (high % 2 == 0) {
            res = (int) Math.ceil((double)(high - low) / 2);
        } else res = (int) Math.floor((double)(high - low) / 2) +1;
        return res;
    }
}
