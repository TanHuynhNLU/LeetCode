package easy;

public class CheckIfAllTheIntegersInARangeAreCovered1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] count = new int[52];
        for (int[] range : ranges) {
            count[range[0]]++;
            count[range[1]+1]--;
        }
        for (int i = 1; i < 52; i++) {
            count[i] = count[i] + count[i - 1];
        }
        for (int i = left; i <= right; i++) {
            if (count[i] <=0) return false;
        }
        return true;
    }
}
